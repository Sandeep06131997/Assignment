package AssignmentQuestion;

import java.util.Scanner;

public class ArrayTargetSuTriplet {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		sort(n, arr);
		sum(n, arr, tar);
	}

	private static void sort(int n, int[] arr) {
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}

			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}

	}

	private static void sum(int n, int[] arr, int tar) {
		for (int i = 0; i < n; i++) {
			for (int x = i + 1; x < n; x++) {
				for (int j = x + 1; j < n; j++) {
					if (arr[i] + arr[j] + arr[x] == tar) {
						System.out.println(arr[i] + ", " + arr[x] + " and " + arr[j]);
					}

				}
			}

		}

	}

}
