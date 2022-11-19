package AssignmentQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTargetSumPairs {
		public static void main(String[]args)
	    {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int []num=new int[n];
	        for(int i=1;i<n;i++)
	        {
	            num[i]=sc.nextInt();
	        }
	        int target=sc.nextInt();
	        findPair(num,target);

	    }
	public static void  findPair(int[] num,int target) {
	Arrays.sort(num);
	int lo=0;
	int hi= num.length-1;
	while(lo<hi)
	{
	if (num[lo] +num[hi]==target){
	    System.out.println(num[lo]+" and "+num[hi]);
	}
	if (num[lo]+num[hi]<target)
	{
	    lo++;
	}
	else{
	    hi--;
	}
	 }

	}

}