import java.util.List;
import java.util.stream.Collectors;

import util.Student;
import util.StudentDao;

public class StreamFlatMapOperation {
	public static void main(String args[]) {
		List<String> flatMapList=StudentDao.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flatMapList);
	}
}
