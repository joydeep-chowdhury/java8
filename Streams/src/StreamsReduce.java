import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduce {
   public static void main(String args[])
   {
	  int result= Arrays.asList(1,3,5,7,9).stream().reduce(1,(a,b)->a*b);
	  System.out.println(result);
	  Optional<Integer> optInt=Arrays.asList(1,3,5,7,9).stream().reduce((a,b)->a*b);
	  System.out.println(optInt.isPresent());
	  System.out.println(optInt.get());
	  List<Integer> emptyList=new ArrayList<Integer>();
	  Optional<Integer> optInt2=emptyList.stream().reduce((a,b)->a*b);
	  System.out.println(optInt2.isPresent());
	  System.out.println(optInt2.get());
   }
}
