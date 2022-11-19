package AssignmentQuestion;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N1 = s.nextInt();
		int N2 = s.nextInt();
		for (int n = 1; N1 > 0; n++) {
			int value = 3 * n + 2;
			if (value % N2 != 0) {
				System.out.print(value + " ");
				N1--;
			}
		}
	}

}
