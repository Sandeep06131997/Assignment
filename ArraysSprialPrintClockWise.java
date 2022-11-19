package AssignmentQuestion;

import java.util.Scanner;

public class ArraysSprialPrintClockWise {

	public static void main(String[] args) {
		int arr[][] = takeinput();
		spiral(arr);
	}

	public static void spiral(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		int count = 1;
		int total = arr.length * arr[0].length;
		while (count <= total) {
			for (int col = mincol; col <= maxcol && count <= total; col++) {
				System.out.print(arr[minrow][col] + ", ");
				count++;
			}
			minrow++;

			for (int row = minrow; row <= maxrow && count <= total; row++) {
				System.out.print(arr[row][maxcol] + ", ");
				count++;
			}
			maxcol--;
			for (int col = maxcol; col >= mincol && count <= total; col--) {
				System.out.print(arr[maxrow][col] + ", ");
				count++;

			}
			maxrow--;
			for (int row = maxrow; row >= minrow && count <= total; row--) {
				System.out.print(arr[row][mincol] + ", ");
				count++;

			}
			mincol++;

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
