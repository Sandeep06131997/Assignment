package Session8Prectice;

import java.util.Scanner;

public class RiverseArray1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr= new int[n];	
		for(int i = 0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		int lo=0 ;
		int hi=4 ;

		reverse(arr,hi,lo);
		display(arr);
		
	}
	public static void reverse(int[] arr,int hi,int lo) {
		int j = lo;
		int i = hi;
		while(i>j) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			j+=1;
			i--;

		}
	}

	public static void display(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
