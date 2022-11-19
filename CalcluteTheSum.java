package AssignmentQuestion;

public class CalcluteTheSum {
	static int arr[] = { 6, 3, 5, 7, 9 };
	static int arr1[] = { 12, 6, 10, 14, 18 };


	static int sum() {
		int sum = 0;
		int i;

		for (i = 0; i < arr.length; i++)
			sum += arr[i];

		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Sum of given array is " + sum());
	}
}
