import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {
	public static void main(String args[]) {
		LocalDate localDate = LocalDate.now();
		System.out.println("LocalDate " + localDate);
		LocalDate localDate1=LocalDate.of(2020, 06, 14);
		System.out.println("LocalDate1 "+localDate1);
		LocalDate localDate3=LocalDate.ofYearDay(2020, 68);
		System.out.println("localDate3 "+localDate3);
		System.out.println(localDate3.getMonth());
		System.out.println(localDate3.getMonthValue());
		System.out.println(localDate3.getDayOfWeek());
		System.out.println(localDate3.getDayOfYear());
		System.out.println(localDate3.getLong(ChronoField.DAY_OF_WEEK));
	}
}
