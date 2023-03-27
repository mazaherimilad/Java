import java.util.Scanner;

public class FinallyRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			int[] numbers = { 1, 2, 3, 4 };
			int number = numbers[1];// exceptiopn

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("before close");
			scanner.close();
		}
		System.out.println("main close");

	}
}
