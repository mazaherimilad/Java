import java.util.List;

public class FPNummberRunner {

	private static int normalSum(List<Integer> numbers) {

		int sum = 0;
		for (int number : numbers) {
			sum += number; // mutations
		}
		return sum;
	}

	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, ((n1, n2) -> n1 + n2));// just add them up- we avoid mutation of variables

	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(2, 45, 6, 7, 8);
		fpSum(numbers);
		normalSum(numbers);
	}

}
