package fr.lepellerin.ecole.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GeDateUtils {

  public static final String DATE_FORMAT_ANNEE_MOIS_FULL = "MMM yyyy";

  /**
   * retourne la date avec heure, minute, seconde, ms à 0.
   * 
   * @param date
   *          : la date à traiter
   * @return <code>Date</code>
   */
  public static Date truncateDate(Date date) {
    Calendar cal = new GregorianCalendar();
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
  public static Calendar truncateCal(Calendar cal) {
    cal.set(Calendar.MILLISECOND, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.HOUR, 0);
    return cal;
  }
}
