package AssignmentQuestion;

import java.util.Scanner;

public class ArraysLinerSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int item = scan.nextInt();
		System.out.println(search(arr, item));
	}

	public static int search(int[] arr, int item)

	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}

		}
		return -1;
	}

}
