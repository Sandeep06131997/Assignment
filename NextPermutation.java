package AssignmentQuestion;

import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int[] A = new int[n];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}
			nextPermutation(A);

		}
	}

	public static void nextPermutation(int[] nums) {
		int i = nums.length - 2;
		while (i >= 0 && nums[i] >= nums[i + 1])
			i--;
		int j = nums.length - 1;
		if (i >= 0) {
			while (nums[i] >= nums[j])
				j--;
			swap(nums, i, j);
		}
		reverse(nums, i + 1);
	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void reverse(int[] nums, int i) {
		int j = nums.length - 1;
		while (i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}

	}

}
