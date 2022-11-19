package AssignmentQuestion;

public class PatternInvertedHourGlass {

	public static void main(String[] args) {
		int n = 5;
	    int nsp = 2 *n - 1;	 
	    int nst = 2 *n + 1;
	    int num = n;
	    int a = 0;	 
	    for (int i = 1; i <= nst; i++)
	    {
	      if (i > n + 1)
	        a = nst - i + 1;
	      else
	        a = i;
	 
	      //numbers
	      for (int cst = 1; cst <= a; cst++)
	      {
	        System.out.print(num+" ");
	        num--;
	      }
	 
	      //Spaces
	      for (int csp = 1; csp <= nsp; csp++)
	      {
	        System.out.print("  ");
	      }
	 
	      for (int cst = 1; cst <= a; cst++)
	      {
	        num++;
	        if (num != 0)
	          System.out.print(num+" ");
	      }
	 
	      if (i <= (nst) / 2)
	        nsp -= 2;
	      else
	        nsp += 2;
	 
	      System.out.println();

	}

}
}
