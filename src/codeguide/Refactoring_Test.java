package codeguide;

import java.util.Arrays;
import java.util.List;

/**
 * Practice about refactoring code.
 * 
 * @author Totsapon Menkul.
 *
 */
public class Refactoring_Test {
	// TODO clean up non-scene variable and improving readability
	public static void str(int i, int j) {
		System.out.println("index " + i + " of asdasdassadasd = index " + j + " of fflwqe113");
	}

	public static void main(String[] args) {
		Integer[] asdasdassadasd = { 1, 2, 3, 4, 5, 7, 6, 8, 9, 0, 1, 3, 5, 67, 8 };
		Integer[] fflwqe113 = { 2, 7, 4, 9, 0, 1, 5, 4, 6, 5, 8, 0, 3, 2, 5, 6, 5 };

		for (int i = 0; i <= asdasdassadasd.length - 1; i++) {
			for (int j = 0; j <= fflwqe113.length - 1; j++) {
				if (asdasdassadasd[i] == fflwqe113[j]) {
					str(i, j);
				}
			}
		}

	}

}
