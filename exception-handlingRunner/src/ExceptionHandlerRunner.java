
public class ExceptionHandlerRunner {
	public static void main(String[] args) {
		method1();

	}

	private static void method1() {
		method32();
	}

	private static void method32() {
		String str = null;
		str.length();
	}
}
