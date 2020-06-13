package defaultpackage;

import java.util.List;

public interface DefaultIntf {
	default int multiply(List<Integer> intList) {
		return intList.stream().reduce(1, (a, b) -> (a * b));
	}

	static int add(List<Integer> intList) {
		return intList.stream().reduce(0, (a, b) -> (a + b));
	}
}
