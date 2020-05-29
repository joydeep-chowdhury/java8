package function;

import java.util.function.Function;

public class FunctionExample {

	
	static Function<String,String> function=(name)->name.toUpperCase();
	static Function<String,String> rev=(name)->new StringBuffer(name).reverse().toString();
	static Function<String,String> concat=(name)->name.concat("concat");
	public static void main(String args[])
	{
		System.out.println(function.apply("joydeep"));
		System.out.println(function.andThen(rev).apply("joydeep"));
		System.out.println(rev.andThen(concat).apply("joydeep"));
		System.out.println(rev.compose(concat).apply("joydeep"));
	}
}
