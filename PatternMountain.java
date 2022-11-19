package AssignmentQuestion;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		int row = 1;
		int nst1 = 1;
		int nsp = (2 * n) - 3;
		while (row <= n) {
			
			int cst = 1;
			while (cst <= nst1) {
				System.out.print(cst + "\t");
				cst++;
			}
			
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" \t");
				csp++;
			}
			
			int cst1 = cst-1;
			if(row==n) cst1--;
			while (cst1 >= 1) {
				System.out.print(cst1 + "\t");
				cst1--;
			}

			System.out.println();
			nsp = nsp - 2;
			row++;
			nst1++;
	}

}
}
