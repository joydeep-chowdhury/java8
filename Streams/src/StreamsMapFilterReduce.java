import util.Student;
import util.StudentDao;

public class StreamsMapFilterReduce {

	public static int getTotalNotebookCount() {
		return StudentDao.getAllStudents().stream().map(Student::getNotebooks).reduce(0, (a, b) -> (a + b));
	}

	public static int getTotalNotebookCount2() {
		return StudentDao.getAllStudents().stream().map(Student::getNotebooks).reduce(0, Integer::sum);
	}

	public static int getTotalNotebookCountforGradeLevelgreaterthanequalto9() {
		return StudentDao.getAllStudents().stream().filter(s -> s.getGradeLevel() >= 9).map(Student::getNotebooks)
				.reduce(0, Integer::sum);
	}

	public static void main(String args[]) {
		System.out.println("Total notebooks" + getTotalNotebookCount());
		System.out.println("Total notebooks " + getTotalNotebookCount2());
		System.out
				.println("Total notebooks grade level >=9 " + getTotalNotebookCountforGradeLevelgreaterthanequalto9());
	}
}
