package AssignmentQuestion;

import java.util.*;
public class StarDimondPrint {
    public static void main(String args[]) {

		Scanner ak=new Scanner (System.in);
		System.out.println("enter ther number :");
		int n=ak.nextInt();
		int row=1;
		int nsp=n-1;
		int nst=1;
		int val=1;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" "+"\t");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print(val+"\t");
				if(cst<=nst/2) {
					val++;
				}else {
					val--;
				}
				cst++;
			}
			nsp--;
			nst+=2;
			row++;
			val=row;
			System.out.println();
		}
	
    }
}