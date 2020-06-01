package numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumericStreamRanges {
    public static void main(String args[])
    {
    	IntStream.rangeClosed(1,100).forEach(System.out::println);
    	IntStream.range(1,100).forEach(System.out::println);
    	System.out.println("Range count "+IntStream.range(1,100).count());
    	System.out.println("Range closed count "+IntStream.rangeClosed(1,100).count());
    	IntStream.rangeClosed(1,200).asDoubleStream().forEach(d->System.out.print(d+","));
    }
}
