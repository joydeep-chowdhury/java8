package defaultpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import util.Student;
import util.StudentDao;

public class DefaultMethods2 {
    public static void main(String args[])
    {
    	List<Student> stdList=StudentDao.getAllStudents();
    	stdList.forEach(System.out::println);
    	stdList.sort(Comparator.comparing(Student::getName));
    	System.out.println("------------------------------------------------------");
    	stdList.forEach(System.out::println);
    	stdList.sort(Comparator.comparingDouble(Student::getGpa));
    	System.out.println("------------------------------------------------------");
    	stdList.forEach(System.out::println);
    	
    	stdList.sort(Comparator.comparingDouble(Student::getGpa).thenComparing(Comparator.comparing(Student::getName)));
    	System.out.println("------------------------------------------------------");
    	stdList.forEach(System.out::println);
    	List<String> stdListNull=Arrays.asList(new String[] {"Joydeep","Ankit","Preshika","Arunabha","Arnab"});
    	stdListNull.add(null);
    	stdListNull.add(null);
    	stdListNull.forEach(System.out::println);
    	System.out.println("------------------------------------------------------");    	
    	
    	
    	
    }
}
