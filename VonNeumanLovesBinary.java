package AssignmentQuestion;

import java.util.Scanner;

public class VonNeumanLovesBinary {
	static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {
		long n = scn.nextInt();
		while (n > 0) {
			long num = scn.nextLong();
			long res = binarytodecimal(num);
			System.out.println(res);
			n--;
		}
	}

	public static long binarytodecimal(long n) {
		long ans = 0, mul = 1;
		while (n != 0) {
			long rem = n % 10;
			ans = ans + (rem * mul);
			n = n / 10;
			mul = mul * 2;
		}
		return ans;
	}
}