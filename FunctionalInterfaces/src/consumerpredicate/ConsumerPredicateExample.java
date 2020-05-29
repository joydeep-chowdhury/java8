package consumerpredicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import consumerinterface2.Student;
import consumerinterface2.StudentDao;

public class ConsumerPredicateExample 
{
     static Predicate<Student> gradePredicate=student->student.getGradeLevel()<9;
     static Predicate<Student> gpaPredicate=student->student.getGpa()>7;
     static BiPredicate<Integer,Double> biPredicate=(grade,gpa)->grade<9&&gpa>7;
     static BiConsumer<String,List<String>> nameActivitiesBicons=(name,activities)->System.out.println("Name: "+name+" Activities: "+activities);
     static Consumer<Student> stdConsumer=student->{
    	 if(gradePredicate.and(gpaPredicate).test(student))
    	  {
    		 nameActivitiesBicons.accept(student.getName(), student.getActivities()); 
    	  }
     };
     
     static Consumer<Student> stdConsumer2=student->{
    	 if(biPredicate.test(student.getGradeLevel(), student.getGpa()))
    	  {
    		 nameActivitiesBicons.accept(student.getName(), student.getActivities()); 
    	  }
     };
     
     public static void main(String args[])
     {
    	 List<Student> students=StudentDao.getAllStudents();
    	 students.forEach(s->stdConsumer.accept(s));
    	 
    	 System.out.println("Bi predicate");
    	 students.forEach(s->stdConsumer.accept(s));
     }
}
