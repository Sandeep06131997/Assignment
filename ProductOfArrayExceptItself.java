package AssignmentQuestion;

import java.util.*;

public class ProductOfArrayExceptItself {
	public static void main(String[] args) {
		int arr[]=new int [4];
		System.out.println(productExceptSelf(arr));
	}

	public static int[] productExceptSelf(int[] arr) {
		int[] left = new int[arr.length];

		left[0] = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}

		int r = 1;

		for (int i = left.length - 1; i >= 0; i--) {
			left[i] = left[i] * r;
			r = r * arr[i];
		}

		return left;

	}

}
