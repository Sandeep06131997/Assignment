package AssignmentQuestion;

import java.io.*;
import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt(); 
		int  b = sc.nextInt();
		System.out.println( gcd(b, a));
	}
	public static int gcd(int a, int b) {
		int i;
		if (a < b)
			i = a;
		else
			i = b;

		for (i = i; i > 1; i--) {

			if (a % i == 0 && b % i == 0)
				return i;
		}

		return 1;
	}
}
