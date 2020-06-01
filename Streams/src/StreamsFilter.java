import java.util.List;
import java.util.stream.Collectors;

import util.Student;
import util.StudentDao;

public class StreamsFilter {
	public static void main(String args[]) {
		List<Student> femaleStudentList=StudentDao.getAllStudents().stream().filter(student -> student.getGender().equals("Female"))
				.collect(Collectors.toList());
		
		List<Student> filter=StudentDao.getAllStudents().stream().filter(student -> student.getGender().equals("Male"))
				.filter(student->student.getGpa()>8)
				.collect(Collectors.toList());
		
		femaleStudentList.forEach(s->System.out.println(s));
		filter.forEach(s->System.out.println(s));
	}
}
