package defaultpackage;

import util.StudentDao;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import util.Student;

public class DefaultMethods {

	public static void main(String args[])
	{
		List<String> namesList=StudentDao.getAllStudents().stream().map(Student::getName).collect(Collectors.toList());
		System.out.println(namesList);
		namesList.sort(Comparator.naturalOrder());
		System.out.println(namesList);
	}
	
}
