/*
   Copyright (C)  Seun Landsberg 2016

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, see <http://www.gnu.org/licenses/>.
*/

package fr.lepellerin.ecole.web.controller.cantine.ws;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.DocumentException;

import fr.lepellerin.ecole.bean.Classe;
import fr.lepellerin.ecole.bean.Individu;
import fr.lepellerin.ecole.exceptions.TechnicalException;
import fr.lepellerin.ecole.logging.LogMe;
import fr.lepellerin.ecole.service.CantineService;

@Controller
@RequestMapping("/cantine/details/")
public class ReportCantineController {
  

  @Autowired
  private CantineService cantineService;
  
  @Autowired
  private TemplateEngine templateEngine;

 
  /**
   * construit le rapport repas quotidien.
   *
   * @param model
   *          : model spring
   * @return le nom de la vue
   * @throws TechnicalException 
   * @throws IOException 
   * @throws DocumentException 
   */
  @RequestMapping("/reportQuotidien")
  @LogMe(logExit = true)
  public String reportQuotidien() throws TechnicalException, IOException, DocumentException {
    final Context ctx = new Context();
    final Calendar cal = GregorianCalendar.getInstance();
    cal.set(2017, Calendar.JANUARY, 24);
    final Map<Classe, List<Individu>> report = this.cantineService.getEnfantsAvecReservationParClasse(cal.getTime());
    ctx.setVariable("rapport", report);
    final String htmlContent = this.templateEngine.process("reportEnfantCantineQuotidien", ctx);
    
    final ByteArrayOutputStream os = new ByteArrayOutputStream();
    final ITextRenderer renderer = new ITextRenderer();

    renderer.setDocumentFromString(htmlContent);
    renderer.layout();
    renderer.createPDF(os);

    byte[] pdfAsBytes = os.toByteArray();
    os.close();
    
    final FileOutputStream fos = new FileOutputStream(new File("c:\\temp\\essai.pdf"));
    fos.write(pdfAsBytes);
    fos.close();
    
    return null;
  }

}
