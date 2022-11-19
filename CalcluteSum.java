package AssignmentQuestion;

import java.util.Scanner;

public class CalcluteSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int k = sc.nextInt();

		while (k-- > 0) {

			int x = sc.nextInt();

			int brr[] = new int[n];

			for (int i = 0; i < arr.length; i++) {

				int idx = i - x;
				if (idx < 0) {
					idx = idx + n;
				}
				brr[i] = arr[i] + arr[idx];
			}

			arr = brr;
		}
		int c = 1000000007;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] % c;
		}
		System.out.println(sum);

	}

}
