package AssignmentQuestion;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String []args)
    {	Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    System.out.println(mysqrt(x));
        
    }
    public static  int  mysqrt (int x){
        long lo=0;
        long hi=x;
        long ans=0;
        if(x==0) return 0;
        if(x==1) return 1;
        while(lo<=hi)
        {
            long mid=(lo+hi)/2;
            if(mid*mid>x) hi=mid-1;
            else if(mid*mid<x)
            {
                ans=mid;
                lo=mid+1;
            }
            else
               { ans=mid;
                break;
               }
               
        }
        return (int)ans;
        

    }
}
