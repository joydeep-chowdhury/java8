package optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import util.Bike;
import util.Student;
import util.StudentDao;

public class OptionalMapFlatMap {
	
	static Supplier<List<Student>> stSupp=()->StudentDao.getAllStudents().stream().filter(s->s.getGpa()>5).collect(Collectors.toList());
	
   public static void main(String args[])
   {
	  Optional<List<Student>> stdOpt=Optional.ofNullable(stSupp.get());
	  if(stdOpt.isPresent())
	  {
		  System.out.println(stdOpt.get());
		  List<String> nameList=stdOpt.get().stream().filter(s->s.getGpa()>8).map(s->s.getName()).collect(Collectors.toList());
		  System.out.println(nameList);
	  }
	  
	  
	  Optional<Student> optStd=Optional.ofNullable(StudentDao.stdSupp.get());
	  Optional<String> name=optStd.filter(student->student.getGpa()>5).flatMap(Student::getBike).map(Bike::getName);
	  System.out.println(name);
   }
}
