package AssignmentQuestion;

import java.util.Scanner;

public class PacalTrangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();	
		int row = 0;
		int nst =1;
		while (row <= n) {
			int i = 1;
			int val = 1;
			while (i < nst) {
				System.out.print(row + "\t");
				val = ((row - i) * val) / (i + 1);
				i++;
			}

			row++;
			System.out.println();
			nst++;
	}
		
	}
		

}

