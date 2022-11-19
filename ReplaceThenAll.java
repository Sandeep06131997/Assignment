package AssignmentQuestion;

import java.util.Scanner;

public class ReplaceThenAll {

	    public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
	        long n=sc.nextLong();
	        System.out.println(func(n));
	    }
	    public static long func(long n)
	    {
	        if(n==0) return 5;
	        long mul=1;
	        long ans=0;
	        while(n>0)
	        {
	            long rem=n%10;
	            if(rem==0) rem=5;
	            ans=ans+rem*mul;
	            mul=mul*10;
	            n=n/10;
	            
	        }
	        return ans;
	    }

}

