package AssignmentQuestion;

import java.util.Scanner;

public class SUmOfDigitEvenAndOdd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pos=1;
        int even=0;
        int odd=0;
        while(num>0)
        {
           int count=num%10;
            if(pos%2==1)
            {
                odd+=count;
            }
            else
            {
                even+=count;
            }       
            pos++;
            num=num/10;
        }
        System.out.println(odd);
        System.out.println(even);

    }
}

