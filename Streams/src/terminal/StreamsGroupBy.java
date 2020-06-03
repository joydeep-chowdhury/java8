package terminal;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import util.Student;
import util.StudentDao;

public class StreamsGroupBy {
   public static void main(String args[])
   {
	   Map<String, List<Student>> stdMap= StudentDao.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
	   System.out.println("Group students by gender");
	   for(Entry<String, List<Student>> entry:stdMap.entrySet())
	   {
		   System.out.println("Group: "+entry.getKey()+" Student List: "+entry.getValue());
	   }
	   Map<String, List<Student>> stdMapByGpaCustomized= StudentDao.getAllStudents().stream().collect(Collectors.groupingBy(s->s.getGpa()>=9?"EXCELLENT":"GOOD"));
	   System.out.println("Group students by gpa");
	   for(Entry<String, List<Student>> entry:stdMapByGpaCustomized.entrySet())
	   {
		   System.out.println("Group: "+entry.getKey()+" Student List: "+entry.getValue());
	   }
   }
}
