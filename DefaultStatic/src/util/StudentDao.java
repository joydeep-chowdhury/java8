package util;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDao {
	
	public static Supplier<Student> stdSupp=()->{
		Student s=new Student("Mayank Kumar", 9, 9.2, "Male",17,
				Arrays.asList(new String[] { "Playing Cricket", "Listening to music" }));
		Bike bike1=new Bike();
		bike1.setModel("Disc-150F");
		bike1.setName("Bajaj Discover");
		s.setBike(Optional.ofNullable(bike1));
		return s;
	};
	
	public static List<Student> getAllStudents() {
		return Arrays.asList(new Student[] {
				new Student("Joydeep Chowdhury", 8, 8.2, "Male",11,
						Arrays.asList(new String[] { "Playing Cricket", "Listening to music" })),
				
				new Student("Arunabha Gupta", 9, 9.2, "Male",10,
						Arrays.asList(new String[] { "Playing Guitar", "Listening to gazal" })),
				
				new Student("Ankit Bhattacharjee", 7, 7.2, "Male",12,
						Arrays.asList(new String[] { "Playing Guitar", "Listening to rap" })),
				
				new Student("Preshika Bhutani", 10, 7.2, "Female",11,
						Arrays.asList(new String[] { "Playing Football", "Listening to bhangra" })),
				
				new Student("Samir Kumar", 9, 8.5, "Male",10,
						Arrays.asList(new String[] { "Playing Flute", "Listening to saxophone" })),
				
				new Student("Kaustav Chatterjee", 7, 7.9, "Male",12,
						Arrays.asList(new String[] { "Playing Golf", "Listening to news" })) });
	}
}
