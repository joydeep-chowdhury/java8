import java.time.Duration;
import java.time.Instant;

public class InstantExample 
   {
     public static void main(String args[])
     {
    	 Instant instant=Instant.now();
    	 System.out.println(instant);
    	 System.out.println("Epoch second "+instant.getEpochSecond());
    	 System.out.println(instant.ofEpochSecond(0));
    	 Instant instant2=Instant.now();
    	 Duration duration=Duration.between(instant, instant2);
    	 System.out.println(duration.getNano());
     }
   }
