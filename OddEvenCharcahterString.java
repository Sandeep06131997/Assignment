package AssignmentQuestion;

import java.util.Scanner;

public class OddEvenCharcahterString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  T = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < T; i++) {
			String myString = scan.nextLine();

			int evn = 0, odd = 0, len = myString.length();

			char strE[] = new char[50], strO[] = new char[50];

			for (int j = 0; j < len; j++) {
				if (j % 2 == 0) {
					strE[evn] = myString.charAt(j);
					evn++;
				}
				if (j % 2 == 1) {
					strO[odd] = myString.charAt(j);
					odd++;
				}
			}
			System.out.print("abcg");
			System.out.print(" ");
			System.out.println(strO);
		}
	}

}
