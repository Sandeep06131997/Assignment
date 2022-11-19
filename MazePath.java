package AssignmentQuestion;

import java.util.Scanner;

public class MazePath {
	static int count;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];

		mazepath(arr, 0, 0, n, m, "");
		System.out.println("\n" + count);

	}

	public static void mazepath(int arr[][], int cr, int cc, int dr, int dc, String ans) {
		if (cr == dr - 1 && cc == dc - 1) {
			System.out.print(ans + " ");
			count++;
			return;
		}

		if (cr < 0 || cc < 0 || cr >= dr || cc >= dc)
			return;

		mazepath(arr, cr + 1, cc, dr, dc, ans + "V");
		mazepath(arr, cr, cc + 1, dr, dc, ans + "H");
		mazepath(arr, cr + 1, cc + 1, dr, dc, ans + "D");

	}

}
