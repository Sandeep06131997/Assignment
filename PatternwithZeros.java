package AssignmentQuestion;

import java.util.Scanner;

public class PatternwithZeros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();	
		int row = 0;
		int nst =1;
		while (row <= n) {
			int i = 1;
			while (i < nst) {
				if(i==1||i==row) {
				System.out.print(row+"\t");
				}else {
					System.out.print("0\t");
				}
				i++;
			}
			row++;
			System.out.println();
			nst++;
	}
		
	}
		


	}


