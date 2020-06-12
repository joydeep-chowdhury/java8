package optional;

import java.util.Optional;

public class OptionalIfPresentIsPresent {
    public static void main(String args[])
    {
    	Optional<String> name=Optional.ofNullable("Joydeep");
    	if(name.isPresent())
    	{
    		System.out.println(name.get());
    	}
    	else
    	{
    		System.out.println("Empty");
    	}
    	
    	name.ifPresent(n->System.out.println(n.toUpperCase()));
    }
}
