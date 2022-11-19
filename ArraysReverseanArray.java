package AssignmentQuestion;

import java.util.Scanner;

public class ArraysReverseanArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		reverse(arr, 0, 3);
		display(arr);

	}
	public static void reverse(int[] arr, int i, int j) {
		j = arr.length - 1;
		while (i <= j) {
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
			i++;
			j--;
		}
	}
	public static void display(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

	}

}
