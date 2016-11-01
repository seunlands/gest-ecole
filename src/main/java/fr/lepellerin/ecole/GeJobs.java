package fr.lepellerin.ecole;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class GeJobs {

  @Scheduled(cron="0 */15 * * * *")
  public void imprimerReservationJob() {
    System.out.println("test");
  }
  
}
