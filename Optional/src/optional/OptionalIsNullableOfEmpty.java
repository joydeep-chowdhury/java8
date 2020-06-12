package optional;

import java.util.Optional;

public class OptionalIsNullableOfEmpty {
  public static void main(String args[])
  {
	  Optional<String> o1=Optional.ofNullable("Joydeep");
	  System.out.println(o1+" "+o1.get());
	  Optional<String> o2=Optional.ofNullable(null);
	  System.out.println(o2+" "+o2.isPresent());
	  Optional<String> o3=Optional.of("Ankit");
	  System.out.println(o3);
//	  Optional<String> o4=Optional.of(null);
//	  System.out.println(o4.isPresent());
	  Optional<String> o5=Optional.empty();
	  System.out.println(o5);
  }
}
