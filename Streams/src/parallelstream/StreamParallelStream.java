package parallelstream;

import java.util.stream.IntStream;

public class StreamParallelStream {
  public static void main(String args[])
  {
	  long start=System.currentTimeMillis();
	  long sum=IntStream.rangeClosed(1,1000000000).asLongStream().sum();
	  long end=System.currentTimeMillis();
	  System.out.println("Sum[1,1000000000] = "+sum+" calculated in "+(end-start)/1000F+" seconds");
	  
	   start=System.currentTimeMillis();
	   sum=IntStream.rangeClosed(1,1000000000).asLongStream().parallel().sum();
	   end=System.currentTimeMillis();
	   System.out.println("Sum[1,1000000000] parallel= "+sum+" calculated in "+(end-start)/1000F+" seconds");
	   
	   System.out.println("No of processors "+Runtime.getRuntime().availableProcessors());
  }
}
