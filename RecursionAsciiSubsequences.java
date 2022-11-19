package AssignmentQuestion;

import java.util.*;

public class RecursionAsciiSubsequences {
	static int temp = 1;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res = "";
		int N = str.length();
		System.out.print(" ");
		Ascii(str, res, 0);
		subsequence(str, res, 0);
		System.out.print("\n" + temp);

	}

	public static void Ascii(String str, String res, int index) {

		if (index == str.length()) {

			if (res.length() > 0) {

				System.out.print(res + " ");
			}
			return;
		}

		char ch = str.charAt(index);

		Ascii(str, res, index + 1);

		Ascii(str, res + ch, index + 1);

		Ascii(str, res + (int) ch, index + 1);

	}

	public static void subsequence(String str, String res, int index) {

		if (index == str.length()) {

			if (res.length() > 0) {

				temp++;
			}
			return;
		}

		char ch = str.charAt(index);

		subsequence(str, res, index + 1);

		subsequence(str, res + ch, index + 1);

		subsequence(str, res + (int) ch, index + 1);

	}
}