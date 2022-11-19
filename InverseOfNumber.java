package AssignmentQuestion;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=1;
        int ans=0;
        while(num>0)
        {
            int rem=num%10;
            num=num/10;
            ans=ans+count*(int )Math.pow(10,rem-1);
            count++;

        }
        System.out.println(ans);
    }
}