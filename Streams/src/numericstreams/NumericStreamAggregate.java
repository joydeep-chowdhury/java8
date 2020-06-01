package numericstreams;

import java.util.stream.IntStream;

public class NumericStreamAggregate {
   public static void main(String args[])
   {
	   System.out.println("Sum[1,5000]= "+IntStream.rangeClosed(1, 5000).sum());
	   System.out.println("Max Value[1,5000]= "+IntStream.rangeClosed(1, 5000).max().getAsInt());
	   System.out.println("Min Value[1,5000]= "+IntStream.rangeClosed(1, 5000).min().getAsInt());
	   System.out.println("Avg Value[1,5000]= "+IntStream.rangeClosed(1, 5000).average().getAsDouble());
   }
}
