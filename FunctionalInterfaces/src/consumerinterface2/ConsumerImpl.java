package consumerinterface2;

import java.util.function.Consumer;

public class ConsumerImpl {
	static Consumer<Student> consumer = (student) -> System.out.println(student);
	static Consumer<Student> namesConsumer = (student) -> System.out.println(student.getName());
	static Consumer<Student> activitiesConsumer = (student) -> System.out.println(student.getActivities());

	public static void printStudents() {
		StudentDao.getAllStudents().forEach(consumer);
	}

	public static void printNameAndActivities() {

		StudentDao.getAllStudents().forEach(namesConsumer.andThen(activitiesConsumer));
	}

	public static void printNamesAndActivitiesWithCondition() {
		StudentDao.getAllStudents().forEach(student -> {
              if(student.getGpa()>=8)
              {
            	  namesConsumer.andThen(activitiesConsumer).accept(student);
              }
		});
	}

	public static void main(String args[]) {
		printStudents();
		printNameAndActivities();
		System.out.println("Name and activities with conditions");
		printNamesAndActivitiesWithCondition();
	}

}
