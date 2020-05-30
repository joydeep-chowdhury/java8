import java.util.function.Function;

public class FunctionMethodReference {

	
	static Function<String,String> methodRef=String::toUpperCase;
	
	public static void main(String args[])
	{
		System.out.println(methodRef.apply("chowdhury"));
	}
	
}
