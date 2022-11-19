package Session8Prectice;

import java.util.Scanner;

public class MaximumInArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int []arr=new int[n];
		for(int i = 1;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(max(arr));	
	}
	public static int max(int []arr)
	{
		int max=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			max=Math.max(max, arr[i]);
		}
		return max;
	}

}
