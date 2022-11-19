package AssignmentQuestion;

import java.util.Scanner;

public class ArraysWavePrintRowWise {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	
		int arr[][]=takeinput();
		wave(arr);
	}
	public static void wave(int [][]arr)
	{
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0)
			{
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j]+", ");
				}
			}
			else
			{
				for (int j = arr[0].length-1; j >=0; j--) {
					System.out.print(arr[i][j]+", ");
				}
			}
		}
		System.out.println("END");
			
	}
	
	public static int [][] takeinput()
	{
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][]arr=new int [n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j]=sc.nextInt();
				
			}
			
		}
		return arr;
		
	}
	
		
	}
	


