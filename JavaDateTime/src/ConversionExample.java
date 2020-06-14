import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConversionExample {
   public static void main(String args[])
   {
	   LocalDate localDate=LocalDate.of(1993, 10, 1);
	   LocalTime localTime=LocalTime.of(18, 23, 30, 780780780);
	   System.out.println(localDate.atTime(localTime));
	   System.out.println(localTime.atDate(localDate));
	   LocalDateTime localDateTime=localTime.atDate(localDate);
	   System.out.println(localDateTime.toLocalDate());
	   System.out.println(localDateTime.toLocalTime());
   }
}
