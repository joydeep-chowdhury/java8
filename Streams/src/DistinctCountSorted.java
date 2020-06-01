import java.util.List;
import java.util.stream.Collectors;

import util.Student;
import util.StudentDao;

public class DistinctCountSorted {
	public static void main(String args[]) {
		List<String> distinct = StudentDao.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().collect(Collectors.toList());
		System.out.println(distinct);
		long count=StudentDao.getAllStudents().stream().map(Student::getActivities)
		.flatMap(List::stream).distinct().count();
		System.out.println(count);
		List<String> sorted = StudentDao.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
	}
}
