package AssignmentQuestion;

import java.util.Scanner;

public class CountPalindromicSubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		System.out.println(countSubstrings(str));
	}
	
    static int count = 0;
    
    public static int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        
        for (int i = 0; i < s.length(); i++) { 
            extendPalindrome(s, i, i); 
            extendPalindrome(s, i, i + 1); 
        }
        
        return count;
    }
    
    private static void extendPalindrome(String s, int left, int right) {
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++; left--; right++;
        }
    }
}