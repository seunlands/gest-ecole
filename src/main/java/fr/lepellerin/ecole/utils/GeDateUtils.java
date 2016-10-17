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

package fr.lepellerin.ecole.utils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GeDateUtils {

  public static final String DATE_FORMAT_ANNEE_MOIS_FULL = "MMM yyyy";

  public static final String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";

  public static final String DATE_FORMAT_YYYYMM = "yyyyMM";

  /**
   * private constructor : util class.
   */
  private GeDateUtils() {

  }

  /**
   * retourne la date avec heure, minute, seconde, ms à 0.
   *
   * @param date
   *          : la date à traiter
   * @return <code>Date</code>
   */
  public static Date truncateDate(final Date date) {
    final Calendar cal = new GregorianCalendar();
    cal.setTime(date);
    truncateCal(cal);
    return cal.getTime();
  }

  /**
   * retourne la date avec heure, minute, seconde, ms à 0.
   *
   * @param cal
   *          : la date à traiter
   * @return <code>Date</code>
   */
  public static Calendar truncateCal(final Calendar cal) {
    cal.set(Calendar.MILLISECOND, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.HOUR, 0);
    return cal;
  }
  
  
  public static LocalDateTime addHeureMinute(final LocalDateTime time, final int heures, final int minutes) {
    return time.plus(heures * 60 + minutes, ChronoUnit.MINUTES);
  }
}
