package predicate;

import java.util.function.Predicate;

public class PredicateExample {
	static  Predicate<Integer> even=i->i%2==0;
	static Predicate<Integer> divisibleBy5=i->i%5==0;
   public static void main(String args[])
   {
	  
	   System.out.println(even.test(5));
	   
	   System.out.println("AND OPERATIONS --------------------");
	   System.out.println(even.and(divisibleBy5).test(10));
	   System.out.println(even.and(divisibleBy5).test(5));
	   System.out.println(even.and(divisibleBy5).test(9));
	   
	   System.out.println("OR OPERATIONS --------------------");
	   System.out.println(even.or(divisibleBy5).test(10));
	   System.out.println(even.or(divisibleBy5).test(5));
	   System.out.println(even.or(divisibleBy5).test(9));
	   
	   
	   System.out.println("NEGATE OPERATIONS --------------------");
	   System.out.println(even.or(divisibleBy5).negate().test(10));
	   System.out.println(even.or(divisibleBy5).negate().test(5));
	   System.out.println(even.or(divisibleBy5).negate().test(9));
   }
}
