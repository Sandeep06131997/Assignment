package Session8Prectice;

public class LinerSearch {

	public static void main(String[] args) {
		int[] arr = {5,2,4,6,9,17,17};
		System.out.println(search(arr, 17));
	}

	public static void display(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
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
