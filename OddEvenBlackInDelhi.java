package AssignmentQuestion;

import java.util.*;

public class OddEvenBlackInDelhi {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		while (count > 0) {
			int num = sc.nextInt();
			int odd = 0;
			int even = 0;

			while (num > 0) {
				int rem = num % 10;
				if (rem % 2 == 0) {
					even = even + rem;
				} else 
					odd = odd + rem;
					num = num / 10;
				
			}

			if (even % 4 == 0 || odd % 3 == 0) {
				System.out.println("Yes");
			} else 
				System.out.println("No");
			count--;
			

			
		}

	}
}