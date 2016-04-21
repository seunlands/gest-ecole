package fr.lepellerin.ecole.service.internal;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Ouverture;
import fr.lepellerin.ecole.repo.OuvertureRepository;
import fr.lepellerin.ecole.service.CantineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CantineServiceImpl implements CantineService {

  @Autowired
  private OuvertureRepository ouvertureRepository;

  @Override
  public Set<Integer> getDateOuvert() {
    Calendar cal = new GregorianCalendar();
    Date debut = cal.getTime();
    cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    Date fin = cal.getTime();
    Activite activite = new Activite();
    activite.setIDactivite(1);
    List<Ouverture> ouvertures = this.ouvertureRepository.findByActiviteAndPeriode(activite, debut,
        fin);
    Set<Integer> jours = new HashSet<>();
    ouvertures.forEach(o -> {
      Calendar jour = new GregorianCalendar();
      jour.setTime(o.getDate());
      jours.add(jour.get(Calendar.DAY_OF_WEEK));
    });

    return jours;
  }

  @Override
  public YearMonth getMoisAnneeReservation() {
    LocalDate date = LocalDate.now();
    // TODO ext parametre
    if (date.getDayOfMonth() > 20) {
      return YearMonth.now().plusMonths(1);
    }
    return null;
  }

}
