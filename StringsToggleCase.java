package AssignmentQuestion;

import java.util.Scanner;

public class StringsToggleCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
	togglecase(str);
	}

	public static String togglecase(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
				sb.setCharAt(i, ch);
			} else

			{
				ch = Character.toUpperCase(ch);
				sb.setCharAt(i, ch);
			}

		}
		return sb.toString();
	}


}
