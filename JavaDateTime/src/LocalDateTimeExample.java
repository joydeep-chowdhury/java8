import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample 
   {
      public static void main(String args[])
      {
    	  LocalDate localDate=LocalDate.now();
    	  System.out.println("LocalDate "+localDate);
    	  LocalTime localTime=LocalTime.now();
    	  System.out.println("LocalTime "+localTime);
    	  LocalDateTime localDateTime=LocalDateTime.now();
    	  System.out.println("LocalDateTime "+localDateTime);
      }
   }
