import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
   public static void main(String args[])
   {
	   LocalDateTime localDateTime=LocalDateTime.now();
	   System.out.println("localDateTime "+localDateTime);
	   System.out.println(LocalDateTime.of(LocalDate.of(1993, 9, 13), LocalTime.of(16, 23, 49, 780780780)));
	   LocalDateTime localDateTime2=LocalDateTime.of(1993, 10, 1, 18, 23, 30);
	   System.out.println(localDateTime2.plusHours(5));
	   System.out.println(localDateTime2);
	   System.out.println(localDateTime2.getYear());
	   System.out.println(localDateTime2.getMonth());
	   System.out.println(localDateTime2.getMonthValue());
	   System.out.println(localDateTime2.getDayOfMonth());
	   System.out.println(localDateTime2.getHour());
	   System.out.println(localDateTime2.getMinute());
	   System.out.println(localDateTime2.getSecond());
	   System.out.println(localDateTime2.getNano());
	   System.out.println(localDateTime2.minusDays(2));
	   System.out.println(localDateTime2.withMonth(2));
	   
   }
}
