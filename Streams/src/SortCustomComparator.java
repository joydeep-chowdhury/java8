import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import util.Student;
import util.StudentDao;

public class SortCustomComparator {
   public static void main(String args[])
   {
	   List<Student> sortedByName=StudentDao.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	   List<Student> sortedByGpa=StudentDao.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
	   List<Student> sortedByGpaDesc=StudentDao.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed()).collect(Collectors.toList());
	   System.out.println(sortedByName);
	   System.out.println(sortedByGpa);
	   System.out.println(sortedByGpaDesc);
   }
}
