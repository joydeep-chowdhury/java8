package parallelstream;

import java.util.List;
import java.util.stream.Collectors;

import util.Student;
import util.StudentDao;

public class StreamParallelStream2 {
	public static void main(String args[]) {
		long start=System.currentTimeMillis();
		List<String> stdNames=StudentDao.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().sorted()
				.collect(Collectors.toList());
		long end=System.currentTimeMillis();
		System.out.println("Sequential operation time taken "+(end-start)/1000F+" secs Names: "+stdNames);
		
		 start=System.currentTimeMillis();
		 stdNames=StudentDao.getAllStudents().stream().parallel().map(Student::getActivities).flatMap(List::stream).distinct().sorted()
				.collect(Collectors.toList());
		 end=System.currentTimeMillis();
		System.out.println("Parallel operation time taken "+(end-start)/1000F+" secs Names: "+stdNames);
		
	}
}
