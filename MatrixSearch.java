package AssignmentQuestion;

import java.util.Scanner;

public class MatrixSearch {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int matrix[][]=takeinput();
		System.out.println(searchMatrix(matrix, 62));
	}
	public static int [][] takeinput()
	{
		int N=sc.nextInt();
		int M=sc.nextInt();
		int [][]matrix=new int [N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				matrix[i][j]=sc.nextInt();
				
			}
			
		}
		return matrix;
	}
	public static int  searchMatrix(int[][] matrix, int target) {
	      int i = 0, j = matrix[0].length - 1;
	      while(i < matrix.length && j >= 0) {
	        if(matrix[i][j] == target)
	          return 1;
	        else if(matrix[i][j] > target)
	          j --;
	        else if(matrix[i][j] < target)
	          i ++;
	      }
	    	  
	      return -1;
	      
	    }
	}

