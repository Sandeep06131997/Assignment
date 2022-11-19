package AssignmentQuestion;

import java.util.*;

public class NthRoot {
	static long x;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long n, k;
		double z;
		int i;
		for (i = 0; i < t; i++) {
			n = sc.nextLong();
			k = sc.nextLong();

			x = (long) (Math.pow(n, (double) (long) (1) / k));
			System.out.println("\n"+x);
		}
		

	}
	
}
