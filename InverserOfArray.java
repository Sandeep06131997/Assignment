package AssignmentQuestion;

import java.util.Scanner;

public class InverserOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(inverse(arr));
	}

	public static int[] inverse(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			arr[val] = i;
		}

		return arr;
	}

}
