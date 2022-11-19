package AssignmentQuestion;

import java.util.Scanner;
import java.lang.Math;
public class RevisingQuadraticEquations {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int a =sc.nextInt();
int b =sc.nextInt();
int c =sc.nextInt();
int d = b*b - 4*a*c;
int r1 ,r2;
if(d<0)
System.out.println("Roots are Imaginary");
else if(d>0)
{
System.out.println("Real and Distinct ");
r1 = ((0-b + (int)(Math.sqrt(d)))/(2*a));
r2 = ((0-b - (int)(Math.sqrt(d)))/(2*a));
System.out.print(r2+" ");
System.out.print(r1+" " );
}
else
{
System.out.println("Real and Equal ");
r1 = (0-b)/(2*a);
System.out.print(r1);
}
}
}