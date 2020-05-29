package function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;

import consumerinterface2.Student;
import consumerinterface2.StudentDao;

public class FunctionExample2 
   {
	 static Predicate<Student> gpaPredicate=student->student.getGpa()>8;
	 static Function<List<Student>,Map<String,Double>> stdFuncIntf=studentList->{
		 Map<String,Double> detMap=new HashMap<String,Double>();
		 studentList.forEach((
				 student->{
					 if(gpaPredicate.test(student))
					 {
					 detMap.put(student.getName(), student.getGpa());
					 }
				 })); 
		 return detMap;
	 };
	
	
	 
	 
     public static void main(String args[])
     {
    	 List<Student> students=StudentDao.getAllStudents();
    	 Map<String, Double> stdMap=stdFuncIntf.apply(students);
    	 for(Entry<String, Double> entry:stdMap.entrySet())
    	 {
    		 System.out.println(entry.getKey()+":::::::"+entry.getValue());
    	 }
     }
   }
