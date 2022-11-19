package AssignmentQuestion;

import java.util.Scanner;

public class ArraysBinarySearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
System.out.println(search(arr, 6));
	}
	    public static int search(int[] nums, int target) {
	        int low=0;
	        int high=nums.length-1;
	      
	        
	        while(low<=high){
	            int mid=(low+high)/2;
	            if(nums[mid]==target) return mid;
	            else if(nums[mid]<target){
	                low=mid+1;
	            }
	            else {
	                high=mid-1;
	            }
	        }
	        return-1;
	        
	        
	        
	    }
	}


