package collecations;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
	public static void main(String[] args) {
		String str = "This is really good internship. I've learned a lot.";
		Map<Character, Integer> internship = new HashMap<>();
		char[] characters = str.toCharArray();
		for (char character : characters) {
			Integer integer = internship.get(character);
			if (integer == null) {
				internship.put(character, 1);

			} else {
				internship.put(character, integer + 1);
			}
		}
		System.out.println(internship);

		Map<String, Integer> internshipWords = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {
			Integer integer = internship.get(word);
			if (integer == null) {
				internshipWords.put(word, 1);

			} else {
				internshipWords.put(word, integer + 1);
			}
		}
		System.out.println(internshipWords);
	}
}
