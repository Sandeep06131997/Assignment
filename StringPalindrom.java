package AssignmentQuestion;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(ispal(str));
	}
	public static boolean ispal(String str)
	{
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
		char ch=str.charAt(i);
		char ch2=str.charAt(j);
		if(ch!=ch2)return false;
		i++;
		j--;
		
		}return true;
	}
	

}



