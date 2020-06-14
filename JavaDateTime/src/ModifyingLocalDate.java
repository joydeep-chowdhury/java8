import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ModifyingLocalDate {
   public static void main(String args[])
   {
	   LocalDate localDate=LocalDate.of(2008,07,13);
	   LocalDate localDate2=LocalDate.of(2008,07,15);
	   System.out.println(localDate);
	   System.out.println(localDate.plusDays(34));
	   System.out.println(localDate.plusMonths(3));
	   System.out.println(localDate.minusDays(5));
	   System.out.println(localDate.withYear(2018));
	   System.out.println(localDate.with(ChronoField.YEAR, 2014));
	   System.out.println(localDate.with(TemporalAdjusters.firstDayOfNextYear()));
	   System.out.println(localDate.minus(5,ChronoUnit.YEARS));
	   System.out.println(localDate.isLeapYear());
	   System.out.println(localDate.isEqual(localDate2));
	   System.out.println(localDate.isBefore(localDate2));
	   System.out.println(localDate.isAfter(localDate2));
	   System.out.println(localDate.isSupported(ChronoUnit.MINUTES));
	   System.out.println(localDate.isSupported(ChronoUnit.DAYS));
   }
}
