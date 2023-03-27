
public class MethodReferencesRunner {
public static void main(String[] args) {
	List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
	.map(s -> s.length())
	.forEach(s -> System.out.println(s))

}
}
