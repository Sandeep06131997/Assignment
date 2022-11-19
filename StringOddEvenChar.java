package AssignmentQuestion;

import java.util.*;
public class StringOddEvenChar {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(oddeven(str));

    }
    public static String oddeven(String str)
    {
        String ans=" ";
        for(int i=0;i<str.length();i++)
        {
            int ch=str.charAt(i);
            if(i%2==0)
            {
                ch+=1;

            }
            else ch--;
            char a=(char)ch;
            ans+=a;
                    }
                    return ans;
    }
}
