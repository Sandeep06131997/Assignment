package AssignmentQuestion;

import java.util.*;

public class CountNumber {
	public static int reverse(int n, int i) {

		int count = 0;
		while (n > 0) {
			int res = n % 10;
			if (res == i) {
				count++;
			}
			n = n / 10;
		}

		return count;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		System.out.println("enter the digit:");
		int i = sc.nextInt();
		System.out.println(reverse( n, i));
	}
}