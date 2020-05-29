package predicate;

import java.util.List;
import java.util.function.Predicate;

import consumerinterface2.Student;
import consumerinterface2.StudentDao;

public class PredicateStudentExample {

	static Predicate<Student> gpaPred=student->student.getGpa()>8;
	static Predicate<Student> gradePred=student->student.getGradeLevel()<9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Student> students=StudentDao.getAllStudents();
        students.forEach((s->{
        	if(gpaPred.and(gradePred).test(s)){
        		System.out.println("Student "+s.getName()+" has gpa "+s.getGpa()+" has grade "+s.getGradeLevel());
        }
        	
        }));
        
        students.forEach((s->{
        	if(gpaPred.or(gradePred).test(s)){
        		System.out.println("Student "+s.getName()+" has gpa "+s.getGpa()+" has grade "+s.getGradeLevel());
        }
        	
        }));
        
        students.forEach((s->{
        	if(gpaPred.or(gradePred).negate().test(s)){
        		System.out.println("Student "+s.getName()+" has gpa "+s.getGpa()+" has grade "+s.getGradeLevel());
        }
        	
        }));
	}

}
