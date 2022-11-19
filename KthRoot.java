package AssignmentQuestion;

import java.util.Scanner;

public class KthRoot {
	static long x;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(t<11 && t>0)
		while(t-->0) {
			long n = sc.nextLong();
			if(n>0) {
			int k = sc.nextInt();
			if(k>0) {
		 x = (long) Math.exp(Math.log(n)/k);
			System.out.print(x);
			}
			}
		}
    }
}
