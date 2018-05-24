package domaine;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LanceurDateJava8 {
	
	public static void main(String[] args) {
	      // Get the current date and time
	      LocalDateTime currentTime = LocalDateTime.now();
	      System.out.println("Date et heure courante : " + currentTime);
	      
	      LocalDate date1 = currentTime.toLocalDate();
	      System.out.println("Date courante : " + date1);
	      
			
	      Month mois = currentTime.getMonth();
	      int jour = currentTime.getDayOfMonth();
	      int heure = currentTime.getHour();			
	      System.out.println("Mois : " + mois +", jour : " + jour +", heure : " + heure);
	      
	      //Avoir le 25 d�cembre 2023
	      LocalDateTime date2 = currentTime.withDayOfMonth(25).withYear(2023).withMonth(12);
	      System.out.println("Date modifi�e : " + date2);
	      
	      //une autre fa�on
	      LocalDate date3 = LocalDate.of(2023, Month.DECEMBER, 25);
	      System.out.println("Autre fa�on de faire : " + date3);
			
	      //On peut m�me parser une date depuis un String
	      LocalTime parsed = LocalTime.parse("20:15:30");
	      System.out.println("Date pars�e : " + parsed);
	}

}
