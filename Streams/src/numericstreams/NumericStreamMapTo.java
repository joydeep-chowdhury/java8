package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapTo {
  public static void main(String args[])
  {
	  List<Integer> intList=IntStream.rangeClosed(1,500).mapToObj(i->{return new Integer(i);}).collect(Collectors.toList());
	  System.out.println(intList);
	  long sum=IntStream.rangeClosed(1,5000).mapToLong(l->l).sum();
	  System.out.println("Sum: "+sum);
	  double doubleSum=IntStream.rangeClosed(1,5000).mapToDouble(l->l).sum();
	  System.out.println("Double sum"+doubleSum);
  }
}
