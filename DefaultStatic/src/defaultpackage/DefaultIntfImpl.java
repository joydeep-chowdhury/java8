package defaultpackage;

import java.util.Arrays;
import java.util.List;

public class DefaultIntfImpl implements DefaultIntf
   {
	
	public int multiply(List<Integer> intList) {
		System.out.println("Overriding by impl");
		return intList.stream().reduce(1, (a, b) -> (a * b));
	}
	

      public static void main(String args[])
      {
    	  DefaultIntfImpl di=new DefaultIntfImpl();
    	  System.out.println(di.multiply(Arrays.asList(1,2,3,100)));
    	  System.out.println(DefaultIntf.add(Arrays.asList(1,2,3,100)));
      }
   }
