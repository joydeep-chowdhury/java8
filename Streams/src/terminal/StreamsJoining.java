package terminal;

import java.util.stream.Collectors;

import util.Student;
import util.StudentDao;

public class StreamsJoining {
  public static void main(String args[])
  {
	  String mergedStudentNames=StudentDao.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
	  String mergedStudentNamesWithDelimiter=StudentDao.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-"));
	  String mergedStudentNamesWithDelimiterPrefSuffix=StudentDao.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-","[","]"));
	  System.out.println("Merjing "+mergedStudentNames);
	  System.out.println("Merging with delimiter "+mergedStudentNamesWithDelimiter);
	  System.out.println("Merging with delimiter and prefix and suffix "+mergedStudentNamesWithDelimiterPrefSuffix);
  }
}
