import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample
   {
      public static void main(String args[])
      {
    	  LocalTime localTime=LocalTime.now();
    	  System.out.println("LocalTime "+localTime);
    	  LocalTime localTime2=LocalTime.of(23,56,22);
    	  System.out.println("LocalTime2 "+localTime2);
    	  LocalTime localTime3=LocalTime.of(23, 56, 23,980980980);
    	  System.out.println("localTime3 "+localTime3);
    	  System.out.println(localTime3.getHour());
    	  System.out.println(localTime3.getMinute());
    	  System.out.println(localTime3.get(ChronoField.CLOCK_HOUR_OF_DAY));
    	  System.out.println(localTime3.toSecondOfDay());
    	  System.out.println(localTime3.minusHours(5));
    	  System.out.println(localTime3.minus(2,ChronoUnit.HOURS));
    	  System.out.println(localTime3.with(LocalTime.MIDNIGHT));
    	  System.out.println(localTime3.with(ChronoField.HOUR_OF_DAY, 13));
    	  System.out.println(localTime3.plusMinutes(5));
    	  System.out.println(localTime3.withHour(11));
      }
   }
