package terminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import util.Student;
import util.StudentDao;

public class StreamsMinByMaxBy {
   public static void main(String args[])
   {
	   Optional<Student> studentWithLeastGpa=StudentDao.getAllStudents().stream().collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	   if(studentWithLeastGpa.isPresent())
	   {
		   System.out.println("Student with least gpa "+studentWithLeastGpa.get());
	   }
	   
	   
	   Optional<Student> studentWithMaxGpa=StudentDao.getAllStudents().stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	   if(studentWithMaxGpa.isPresent())
	   {
		   System.out.println("Student with max gpa "+studentWithMaxGpa.get());
	   }
   }
}
