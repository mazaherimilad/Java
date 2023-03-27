package generics;

public class GenericsRunner {
	public static void main(String[] args) {
		/*
		 * MyCustomList<Long> list = new MyCustomList<>();
		 *
		 * list.addElement(256L); list.addElement(214L); Long value = list.get(0);
		 * System.out.println(value);
		 */
		MyCustomList<String> list = new MyCustomList<>();

		list.addElement("element 1");
		list.addElement("element 2");
		String value = list.get(0);
		System.out.println(value);

		MyCustomList<Integer> list2 = new MyCustomList<>();

		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer number = list2.get(0);
		System.out.println(number);

	}
}
