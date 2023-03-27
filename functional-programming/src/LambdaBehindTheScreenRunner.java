import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvanNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		// TODO Auto-generated method stub
		return number % 2 == 0;
	}
}

class NumberSquareMapper implements Function<Integer, Integer> {
	@Override
	public Integer apply(Integer number) {
		return number * number;
	}
}

class PrintNumberConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}

}

public class LambdaBehindTheScreenRunner {
	public static void main(String[] args) {

		Predicate<? super Integer> evenPredicate = n -> n % 2 == 0;// local variable which contains the code that we
																	// will run.
		List.of(12, 48, 154, 158, 19).stream().filter(evenPredicate).map(n -> n * n)
				.forEach(e -> System.out.println(e));

		List.of(12, 48, 154, 158, 19).stream().filter(new EvanNumberPredicate()).map(new NumberSquareMapper())
				.forEach(new PrintNumberConsumer());

	}
}
