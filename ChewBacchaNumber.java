package AssignmentQuestion;

import java.util.Scanner;

public class ChewBacchaNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long ans=0;
		long mul=1;
		while(n>10)
		{
		    long rem=n%10;
		    long min=Math.min(rem,9-rem);
		    ans=min*mul+ans;
		    mul=mul*10;
		    n=n/10;
		} 
		if(n==9) ans=9*mul+ans;
		else ans=Math.min(n,9-n)*mul+ans;
		System.out.print(ans);
	}
}