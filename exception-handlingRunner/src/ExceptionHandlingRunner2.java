
public class ExceptionHandlingRunner2 {
	public static void main(String[] args) {
		method1();
		System.out.println("main");
	}

	private static void method1() {
		method32();
		System.out.println("method1");
	}

	private static void method32() {
		try {
//			String str = null;
//			str.length();
			int[] i = { 1, 2 };
			int number = i[3];
			System.out.println("method2");
		} catch (NullPointerException ex) {
			System.out.println("nullPointerException");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array exception");
			ex.printStackTrace();

		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}