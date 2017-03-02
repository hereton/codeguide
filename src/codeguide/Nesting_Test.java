package codeguide;

import java.util.Arrays;
import java.util.List;

/**
 * Practice about nesting code.
 * 
 * @author Totsapon Menkul.
 *
 */
public class Nesting_Test {
	public static void main(String[] args) {
		List<String> vowel = Arrays.asList("a", "e", "i", "o", "u");
		// TODO make a code easier.
		if (vowel.contains("a")) {
			if (vowel.contains("e")) {
				if (vowel.contains("i")) {
					if (vowel.contains("o")) {
						if (vowel.contains("u")) {
							System.out.println("yes");
						}

					}

				}
			}
		}

	}
}
