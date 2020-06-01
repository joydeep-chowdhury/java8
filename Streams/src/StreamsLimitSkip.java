import java.util.Arrays;
import java.util.Optional;

public class StreamsLimitSkip {
  public static void main(String args[])
  {
	  Optional<Integer> limitSum=Arrays.asList(2,34,56,32,57,98,78).stream().limit(3).reduce((a,b)->a+b);
	  if(limitSum.isPresent())
	  {
		  System.out.println("Limit 3 sum "+limitSum.get());
	  }
	  
	  Optional<Integer> skipSum=Arrays.asList(2,34,56,32,57,98,78).stream().skip(3).reduce((a,b)->a+b);
	  if(skipSum.isPresent())
	  {
		  System.out.println("Skip 3 sum "+skipSum.get());
	  }
	  
  }
}
