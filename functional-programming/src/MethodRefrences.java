import java.util.List;

public class MethodRefrences {
	public static void print(Integer number) {
		System.out.println(number);
	}

	public static boolean isEven(Integer i) {
		return i % 2 == 0;
	}

	public static void main(String[] args) {

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length()).forEach(System.out::println);
		// .forEach(s -> System.out.println(s));

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length).forEach(MethodRefrences::print);// (name
																														// of
																														// the
																														// class::method)
		int max = List.of(13, 15, 19, 20, 34).stream().filter(MethodRefrences::isEven).max(Integer::compare).orElse(0);
		System.out.println(max);
	}

}
