package multipleinheritance;

public interface Interface4 {
	default void methodA() {
		System.out.println("Inside method A"+Interface1.class);
	}
}
