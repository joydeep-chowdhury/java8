package optional;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

import util.Student;
import util.StudentDao;

public class OptionalExample
{
	 private static Predicate<Student> check=s->s.getGradeLevel()>9;
	 private static Supplier<Student> supplyByGradeLevel=()->StudentDao.getAllStudents().stream().filter(check).findFirst().get();
	
     public static void main(String args[])
     {
    	Optional<Student> optStd=Optional.ofNullable(supplyByGradeLevel.get());
    	if(optStd.isPresent())
    	{
    		String name=optStd.map(Student::getName).get();
    		System.out.println(name);
    	}
     }
}
