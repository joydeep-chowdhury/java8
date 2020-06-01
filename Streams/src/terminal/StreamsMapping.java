package terminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import util.Student;
import util.StudentDao;

public class StreamsMapping {
   public static void main(String args[])
   {
	   List<String> stdNames=StudentDao.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toList()));
	   Set<String> stdNamesSet=StudentDao.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toSet()));
	   System.out.println(stdNames);
	   System.out.println(stdNamesSet);
   }
}
