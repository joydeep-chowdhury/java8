package supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import consumerinterface2.Student;

public class SupplierExample 
   {
	
	 static Supplier<Student> stdSupp=()-> new Student("Dharma Kalua", 8, 8.2, "Male",Arrays.asList(new String[] { "Playing Cricket", "Listening to music" }));
	 
	 static Supplier<List<Student>> stdListSupp=()->{
			return Arrays.asList(new Student[] {
					new Student("Joydeep Chowdhury", 8, 8.2, "Male",
							Arrays.asList(new String[] { "Playing Cricket", "Listening to music" })),
					new Student("Arunabha Gupta", 9, 9.2, "Male",
							Arrays.asList(new String[] { "Playing Guitar", "Listening to gazal" })),
					new Student("Ankit Bhattacharjee", 7, 7.2, "Male",
							Arrays.asList(new String[] { "Playing Guitar", "Listening to rap" })),
					new Student("Preshika Bhutani", 10, 7.2, "Female",
							Arrays.asList(new String[] { "Playing Football", "Listening to bhangra" })),
					new Student("Samir Kumar", 9, 8.5, "Male",
							Arrays.asList(new String[] { "Playing Flute", "Listening to saxophone" })),
					new Student("Kaustav Chatterjee", 7, 7.9, "Male",
							Arrays.asList(new String[] { "Playing Golf", "Listening to news" })) });
	 };
	 
      public static void main(String args[])
      {
    	 System.out.println(stdSupp.get());
    	 System.out.println(stdListSupp.get());
      }
   }
