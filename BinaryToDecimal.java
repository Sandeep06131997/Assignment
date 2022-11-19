package AssignmentQuestion;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		int ans=0;
		int mul=1;
		while(num>0)
		{
			int rem=num%10;
			ans=ans+(rem*mul);
			mul=mul*2;
			 num=num/10;
			
		}
		System.out.println(ans);
	}
	}


