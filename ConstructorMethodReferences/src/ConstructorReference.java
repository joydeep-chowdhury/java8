import java.util.function.Supplier;

public class ConstructorReference {

	static Supplier<Student> stdSupp=Student::new;
	
	
	public static void main(String args[])
	{
		System.out.println(stdSupp.get());
	}
	
}
