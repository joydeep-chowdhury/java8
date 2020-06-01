import java.util.Optional;

import util.Student;
import util.StudentDao;

public class StreamsReduce2 {
 public static void main(String args[])
 {
	 Optional<Student> studentOpt=StudentDao.getAllStudents().stream().reduce((s1,s2)->s1.getGpa()>s2.getGpa()?s1:s2);
	 
	 if(studentOpt.isPresent())
	 {
		 System.out.println("Student with higest gpa "+studentOpt.get());
	 }
 }
}
