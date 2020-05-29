package biconsumer;

import java.util.List;
import java.util.function.BiConsumer;

import consumerinterface2.Student;
import consumerinterface2.StudentDao;

public class BiconsumerExample {
   public static void main(String args[])
   {
	   BiConsumer<String,String> biconsumer=(a,b)->System.out.println(a+"__"+b);
	   biconsumer.accept("Joydeep","Chowdhury");
	   BiConsumer<Integer,Integer> multiple=(a,b)->System.out.println(a*b);
	   BiConsumer<Integer,Integer> divide=(a,b)->System.out.println(a/b);
	   multiple.andThen(divide).accept(10, 5);
	   nameAndActivities();
   }
   
   
   
   public static void nameAndActivities()
   {
	   BiConsumer<String,List<String>> nameActivity=(name,activities)->System.out.println("Name: "+name+" Activities: "+activities);
	   List<Student> students=StudentDao.getAllStudents();
	   students.forEach(student->nameActivity.accept(student.getName(), student.getActivities()));
   }
}
