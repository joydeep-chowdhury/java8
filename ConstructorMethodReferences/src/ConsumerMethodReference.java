import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReference {

	static Consumer<Student> stdCons=System.out::println;
	static Consumer<List<String>> actCons=System.out::println;
	static Consumer<Student> printactCons=Student::printActivities;
	public static void main(String args[])
	{
		StudentDao.getAllStudents().forEach(student->stdCons.accept(student));
		StudentDao.getAllStudents().forEach(student->actCons.accept(student.getActivities()));
		StudentDao.getAllStudents().forEach(student->printactCons.accept(student));
	}
	
	
}
