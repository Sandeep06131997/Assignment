package AssignmentQuestion;

import java.util.Scanner;

public class ConversionFahrenheittoCelsius {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=f;i<=a;i=i+b)
        {
            c=((i-32)*5)/9;
            System.out.println(i + "\t" + c);
         }

    }
}