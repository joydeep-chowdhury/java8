package terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import util.Student;
import util.StudentDao;

public class StreamsPartitioningBy {
   public static void main(String args[])
   {
	   Map<Boolean, List<Student>> stdMap=StudentDao.getAllStudents().stream().collect(Collectors.partitioningBy(student->student.getGpa()>=8));
	   System.out.println(stdMap);
	   Map<Boolean, Set<Student>> stdMapSet=StudentDao.getAllStudents().stream().collect(Collectors.partitioningBy(student->student.getGpa()>=8,Collectors.toSet()));
	 
	   
	   System.out.println(stdMapSet);
   }
}
