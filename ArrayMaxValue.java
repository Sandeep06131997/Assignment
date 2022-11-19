package AssignmentQuestion;

import java.util.Scanner;

public class ArrayMaxValue {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(max(arr));

	}

	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}
}
