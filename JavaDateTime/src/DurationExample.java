import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String args[])
    {
    	LocalTime localTime=LocalTime.of(15, 36);
    	LocalTime localTime2=LocalTime.of(16,36);
    	long minDiff=localTime.until(localTime2,ChronoUnit.MINUTES);
    	System.out.println("Time diff "+minDiff);
    	Duration duration=Duration.between(localTime, localTime2);
    	System.out.println(duration.toHours());
    	System.out.println(duration.toMinutes());
    }
}
