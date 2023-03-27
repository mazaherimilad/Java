import java.util.List;

public class FunctionalProgrammingRunner {
	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
		printWithPF(list);
		printWithFiltering(list);
	}

	private static void printBasic(List<String> list) {
		for (String listItem : list) {
			System.out.println(listItem);
		}
	}

	private static void printWithPF(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

	private static void printWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
	}// if logic is true do the loop
}
