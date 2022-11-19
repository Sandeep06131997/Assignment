package AssignmentQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazepathDCountPrint {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N1 = scn.nextInt();
		int N2 = scn.nextInt();
		ArrayList<String> ans = mazepath(0, 0, N1-1, N2-1);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
			
		}
		System.out.println(output(0, 0, N1-1, N2-1));

		

	}
	

	public static ArrayList<String> mazepath(int currentrow, int currentcol, int endrow, int endcol) {
		if (currentrow == endrow && currentcol == endcol) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		if (currentrow > endrow || currentcol > endcol) {
			ArrayList<String> list = new ArrayList<>();
			return list;
		}
		ArrayList<String> list = new ArrayList<>();

		ArrayList<String> resultv = mazepath(currentrow + 1, currentcol, endrow, endcol);

		for (String val : resultv) {
			list.add("V" + val);
		}

		ArrayList<String> resulth = mazepath(currentrow, currentcol + 1, endrow, endcol);

		for (String val : resulth) {
			list.add("H" + val);
		}
		
		ArrayList<String> resultd = mazepath(currentrow+1, currentcol+1, endrow, endcol);
		
		for(String val: resultd) {
			list.add("D" + val); 
		}

		return list;

	}

	public static int output(int currentrow, int currentcol, int endrow, int endcol) {
		int count = 0;
		if (currentrow == endrow && currentcol == endcol) {
			return 1;
		}
		if (currentrow > endrow || currentcol > endcol) {
			return 0;
		}

		count = count + output(currentrow + 1, currentcol, endrow, endcol);
		count = count + output(currentrow, currentcol + 1, endrow, endcol);
		count = count + output(currentrow+1, currentcol+1, endrow, endcol);

		return count;
	}

}
