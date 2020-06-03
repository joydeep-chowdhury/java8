package terminal;

import java.util.stream.Collectors;

import util.Student;
import util.StudentDao;

public class StreamsSumAvg {
   public static void main(String args[])
   {
	   int stdNotebookSum=StudentDao.getAllStudents().stream().collect(Collectors.summingInt(Student::getNotebooks));
	   double stdNotebookAvg=StudentDao.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNotebooks));
	   System.out.println("Student total notebook count "+stdNotebookSum);
	   System.out.println("Student total notebook average "+stdNotebookAvg);
   }
}
