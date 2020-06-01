import java.util.Arrays;
import java.util.Optional;

public class StreamMinMax {
   public static void main(String args[])
   {
	  Optional<Integer> max= Arrays.asList(5,19,87,22,35).stream().reduce((n1,n2)->n1>n2?n1:n2);
	  Optional<Integer> min= Arrays.asList(5,19,87,22,35).stream().reduce((n1,n2)->n1<n2?n1:n2);
	  
	  if(max.isPresent())
	  {
		  System.out.println("[5,19,87,22,35] max: "+max.get());
	  }
	  else
	  {
		  System.out.println("List is empty");
	  }
	  if(min.isPresent())
	  {
		  System.out.println("[5,19,87,22,35] min: "+min.get());
	  }
	  else
	  {
		  System.out.println("List is empty");
	  }
   }
}
