package AssignmentQuestion;

import java.util.Scanner;
public class PatternMagic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {

				System.out.print("* ");
			}

			for (int k = 1; k <= (2 * i) - 1; k++) {

				System.out.print(" ");
			}

			if (i == 0) {

				for (int j = i; j < n - 1; j++) {

					System.out.print("* ");
				}

			}

			else {

				for (int j = i; j < n; j++) {

					System.out.print("* ");
				}
				System.out.println();

			}
			System.out.println();

		}

		for (int i = n - 2; i >= 0; i--) {

			for (int j = i; j < n; j++) {

				System.out.print("* ");
			}

			for (int k = 1; k <= (2 * i) - 1; k++) {

			}

			if (i == 0) {

				for (int j = i; j < n - 1; j++) {

					System.out.print("* ");
				}
			}

			else {

				for (int j = i; j < n; j++) {

					System.out.print("* ");
				}
				System.out.println();

			}
		}

	}
}
