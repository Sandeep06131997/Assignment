package AssignmentQuestion;

import java.util.Scanner;

public class NthFibonacchiNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the number :");
		n = sc.nextInt();
		int a = 0;
		int b = 1;
		if (n <= 0) {
			System.out.println("N not negative");
			return;
		}
		if (n == 0)
			System.out.println(a);
		else if (n == 1)
			System.out.println(b);
		else {
			int c = 0;
			for (int i = 2; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;

			}
			System.out.println(c);
		}

	}

}
