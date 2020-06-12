package optional;

import java.util.function.Supplier;
import java.util.Optional;
import util.Student;
import util.StudentDao;

public class OptionalOrElse 
   {
      private static Supplier<Student> stdSupp=()->StudentDao.getAllStudents().stream().findFirst().get();
      private static Supplier<Student> stdSupp2=()->null;
      public static void main(String args[])
      {
    	 String name=Optional.ofNullable(stdSupp.get()).map(Student::getName).orElse("Null String");
    	 System.out.println(name);
    	  name=Optional.ofNullable(stdSupp2.get()).map(Student::getName).orElse("Null String");
    	 System.out.println(name);
    	 name=Optional.ofNullable(stdSupp.get()).map(Student::getName).orElseThrow(()->new RuntimeException("Null String"));
    	 System.out.println(name);
    	 
      }
   }
