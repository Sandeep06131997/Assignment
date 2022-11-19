package AssignmentQuestion;

import java.util.Scanner;

public class PrintNUmnber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the tnumber:");
		int num = sc.nextInt();
		int i = 2;
		int flag = 0;
		while (i < num) {
			if (num % i == 0) {
				flag++;
				break;
			}
			i++;

		}
		if (flag == 0) {
			System.out.println("prime:");
		} else {
			System.out.println("not prime:");
		}
	}

}
