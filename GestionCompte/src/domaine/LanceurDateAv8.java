package domaine;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class LanceurDateAv8 {
	
	//http://www.mkyong.com/tutorials/java-date-time-tutorials/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// date courante
		Calendar date = new GregorianCalendar();
		Date d1 = date.getTime(); //		
		System.out.println(d1);
		
		System.out.println("************");
		
		//afficher la date dans un format plus lisible		
		DateFormat df1 = new SimpleDateFormat("dd/MM/yy");
		String d2 = df1.format(date.getTime());
		System.out.println(d2);
		
		System.out.println("************");
		
		//Afficher la date dans un certain format et une certaine langue
		Locale loc = new Locale("fr", "ca");
		DateFormat df2 = new SimpleDateFormat("dd/MM/yy", loc);
		String d3 = df2.format(date.getTime());
		System.out.println(d3);
		
		System.out.println("************");
		
		//Convertir du texte en Date
		DateFormat df3 = new SimpleDateFormat("dd/MM/yy");
		try{
		   date.setTime(df3.parse("22/05/2010"));
		   System.out.println(date.getTime());
		}catch(ParseException e){
		   System.out.println("ERROR");
		}
		
		System.out.println("************");
		
		//Ajouter des mois ou des jours
		System.out.println(date.getTime());
		date.add(Calendar.MONTH, 2); // ajout de 2 mois
		date.add(Calendar.DAY_OF_MONTH, 2); // ajout de 2 jours
		System.out.println(date.getTime());
		
		System.out.println("************");
		
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		   //get current date time with Calendar()
		  Calendar cal = Calendar.getInstance();
		  System.out.println("Current Date Time : " + dateFormat.format(cal.getTime()));
		  
		  cal.add(Calendar.DATE, 1);
		  System.out.println("Add one day to current date : " + dateFormat.format(cal.getTime()));
		  
		  cal = Calendar.getInstance();
		   cal.add(Calendar.MONTH, 1);
		   System.out.println("Add one month to current date : " + dateFormat.format(cal.getTime()));
		   
		   cal = Calendar.getInstance();
		   cal.add(Calendar.YEAR, 1);
		   System.out.println("Add one year to current date : " + dateFormat.format(cal.getTime()));
		   
		   cal = Calendar.getInstance();
		   cal.add(Calendar.HOUR, 1);
		   System.out.println("Add one hour to current date : " + dateFormat.format(cal.getTime()));
		   
		   cal = Calendar.getInstance();
		   cal.add(Calendar.MINUTE, 1);
		   System.out.println("Add one minute to current date : " + dateFormat.format(cal.getTime()));
		   
		   cal = Calendar.getInstance();
		   cal.add(Calendar.SECOND, 1);
		   System.out.println("Add one second to current date : " + dateFormat.format(cal.getTime()));
		   
		   cal = Calendar.getInstance();
		   cal.add(Calendar.DATE, -1);
		   System.out.println("Subtract one day from current date : " + dateFormat.format(cal.getTime()));
		   
		   cal = Calendar.getInstance();
		   cal.add(Calendar.MONTH, -1);
		   System.out.println("Subtract one month from current date : " + dateFormat.format(cal.getTime()));
		   
		   cal = Calendar.getInstance();
		   cal.add(Calendar.YEAR, -1);
		   System.out.println("Subtract one year from current date : " + dateFormat.format(cal.getTime()));
		   
		   cal = Calendar.getInstance();
		   cal.add(Calendar.HOUR, -1);
		   System.out.println("Subtract one hour from current date : " + dateFormat.format(cal.getTime()));
		   
		   cal = Calendar.getInstance();
		   cal.add(Calendar.MINUTE, -1);
		   System.out.println("Subtract one minute from current date : " + dateFormat.format(cal.getTime()));
		   
		   cal = Calendar.getInstance();
		   cal.add(Calendar.SECOND, -1);
		   System.out.println("Subtract one second from current date : " + dateFormat.format(cal.getTime()));
	}

}
