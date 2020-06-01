package terminal;

import java.util.stream.Collectors;

import util.StudentDao;

public class StreamsCounting {
   public static void main(String args[])
   {
	   long stdCount=StudentDao.getAllStudents().stream().collect(Collectors.counting());
	   long stdCountWithGpa=StudentDao.getAllStudents().stream().filter(s->s.getGpa()>=9).collect(Collectors.counting());
	   System.out.println("Student count "+stdCount);
	   System.out.println("Student count with gpa "+stdCountWithGpa);
   }
}
