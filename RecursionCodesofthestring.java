package AssignmentQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionCodesofthestring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.next();

		ArrayList<String> list = new ArrayList<>();
		possible_codes(str, "", list);
		System.out.println(list);

	}

	private static void possible_codes(String str, String ans, ArrayList<String> list) {

		if (str.length() == 0) {
			list.add(ans);
			return;
		}

		String ch = str.charAt(0) + "";
		int a = Integer.parseInt(ch);
		char c = (char) ((a - 1) + 97);
		possible_codes(str.substring(1), ans + c, list);

		if (str.length() >= 2) {
			String ch2 = str.substring(0, 2);
			int b = Integer.parseInt(ch2);
			char c2 = (char) ((b - 1) + 97);
			if (str.length() >= 2 && b <= 26)
				possible_codes(str.substring(2), ans + c2, list);
		}

	}

}
