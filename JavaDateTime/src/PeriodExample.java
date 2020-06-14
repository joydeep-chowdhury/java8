import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
   public static void main(String args[])
   {
	   LocalDate localDate1=LocalDate.of(1993, 1, 1);
	   LocalDate localDate2=LocalDate.of(1993, 12, 31);
	   Period period=localDate1.until(localDate2);
	   System.out.println(period);
	   System.out.println(period.getDays());
	   System.out.println(period.getMonths());
	   System.out.println(period.getYears());
	   Period period1=Period.ofDays(10);
	   System.out.println(period1.getDays());
	   Period period2=Period.ofYears(5);
	   System.out.println(period2.getYears());
	   System.out.println(period2.toTotalMonths());
	   Period period3=Period.between(localDate1, localDate2);
	   System.out.println(period3.getDays()+" : "+period3.getMonths()+" : "+period3.getYears());
	   System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusYears(3)).getYears());
   }
} 
