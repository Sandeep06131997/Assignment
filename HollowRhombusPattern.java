package AssignmentQuestion;

import java.util.Scanner;

public class HollowRhombusPattern {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int row=1;
		n=sc.nextInt();
		int nsp=n-1;
		
		while (row<=n) 
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=n)
			{
				if(row==1|| row==n)
				{
					System.out.print( "*");
					cst++;
				}
				else
				{
					if(cst==1|| cst==n)
						System.out.print("*");
					else
						System.out.print(" ");
						cst++;
				}								
			}
			
			System.out.println();
			nsp--;
			row++;
		      
		      }
		  }
}