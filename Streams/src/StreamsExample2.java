import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import util.Student;
import util.StudentDao;

public class StreamsExample2 {
	static Predicate<Student> filterPredGrade = student -> student.getGradeLevel() < 9;
	static Predicate<Student> filterPredGpa = student -> student.getGradeLevel() < 8;

	public static void main(String args[]) {
		Map<String, List<String>> detailsMap = StudentDao.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		for (Entry<String, List<String>> entry : detailsMap.entrySet()) {
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}

		System.out.println("STUDENTS WITH GRADE LEVEL > 8 and GPA >7 " + System.lineSeparator()
				+ "-----------------------------------");
		Map<String, List<String>> gradeDetailsMap = StudentDao.getAllStudents().stream()
				.peek(s -> System.out.println("Before condition " + s)).filter(filterPredGrade.and(filterPredGpa))
				.peek(s -> System.out.println("After condition " + s))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		for (Entry<String, List<String>> entry : gradeDetailsMap.entrySet()) {
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}

	}
}
