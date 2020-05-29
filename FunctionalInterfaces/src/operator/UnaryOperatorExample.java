package operator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample
    {
	
	  static UnaryOperator<String> unOper=s->new StringBuffer(s).reverse().toString();
	
      public static void main(String args[])
      {
    	  System.out.println(unOper.apply("Wipro"));
      }
    }
