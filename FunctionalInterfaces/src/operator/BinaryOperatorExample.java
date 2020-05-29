package operator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
     
	static BinaryOperator<String> binOpr=(m,n)->m.concat(n);
	static Comparator<Integer> comp=(m,n)->m.compareTo(n);
	static BinaryOperator<Integer> maxBy=BinaryOperator.maxBy(comp);
	static BinaryOperator<Integer> minBy=BinaryOperator.minBy(comp);
	public static void main(String args[])
   {
	   System.out.println(binOpr.apply("Joydeep","Chowdhury"));
	   System.out.println(maxBy.apply(9, 15));
	   System.out.println(minBy.apply(100, 200));
   }
}
