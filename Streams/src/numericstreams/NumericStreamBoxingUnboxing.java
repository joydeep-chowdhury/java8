package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxing {
   public static void main(String args[])
   {
	   List<Integer> intList=IntStream.rangeClosed(1,500).boxed().collect(Collectors.toList());
	   intList.forEach(i->System.out.print(i+","));
	   int sum=intList.stream().mapToInt(Integer::intValue).sum();
	   System.out.println("Integer sum "+sum);
   }
}
