package AssignmentQuestion;

import java.util.*;
public class BinaryToOctal {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=0;
        int mul=1;
        while(num>0)
        {
            int rem=num%8;
            ans+=(rem*mul);
            mul=mul*10;
            num=num/8;
        }
        System.out.println(ans);

    }
}