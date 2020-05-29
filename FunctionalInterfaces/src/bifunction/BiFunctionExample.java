package bifunction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import consumerinterface2.Student;
import consumerinterface2.StudentDao;

public class BiFunctionExample {
	
  static BiFunction<List<Student>,Predicate<Student>,Map<String,Double>> studentBi=(studentlist,predicate)->{
	  Map<String,Double> stdMap=new HashMap<String,Double>();
	  studentlist.forEach(student->{
		  if(predicate.test(student))
		  {
			  stdMap.put(student.getName(), student.getGpa());
		  }
	  });
	  return stdMap;
  };
   
  static Predicate<Student> gpaPred=student->student.getGpa()>8;
	
   public static void main(String args[])
   {
	   List<Student> studentList=StudentDao.getAllStudents();
	   for(Entry<String,Double> entry:studentBi.apply(studentList, gpaPred).entrySet())
	   {
		   System.out.println("Student Name: "+entry.getKey()+" Student Gpa: "+entry.getValue());
	   }
   }
}
