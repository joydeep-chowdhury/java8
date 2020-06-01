import java.util.Optional;

import util.Student;
import util.StudentDao;

public class StreamsFind {
   public static void main(String args[])
   {
	   Optional<Student> findAny=StudentDao.getAllStudents().stream().filter(s->s.getGpa()>=9).findAny();
	   if(findAny.isPresent())
	   {
		   System.out.println("FindAny "+findAny.get());
	   }
	   else
	   {
		   System.out.println("Not Found");
	   }
	   
	   Optional<Student> findFirst=StudentDao.getAllStudents().stream().filter(s->s.getGender().equals("Male")).findFirst();
	   
	   if(findFirst.isPresent())
	   {
		   System.out.println("findFirst "+findFirst.get());
	   }
	   else
	   {
		   System.out.println("Not Found");
	   }
   }
}
