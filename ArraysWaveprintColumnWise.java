package AssignmentQuestion;
import java.util.Scanner;
public class ArraysWaveprintColumnWise {
	public static void main(String[] args) {

		int arr[][] = takeinput();
		wave(arr);
	}
	public static void wave(int[][] arr) {
		for (int j = 0; j < arr.length; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < arr[0].length; i++) {
					System.out.print(arr[i][j] + ", ");
				}
			} else {
				for (int i = arr.length - 1; i >= 0; i--) {
					System.out.print(arr[i][j] + ", ");
				}
			}
		}
		System.out.println("END");

	}

	public static int[][] takeinput() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();

			}

		}
		return arr;

	}

}
