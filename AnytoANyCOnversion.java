package AssignmentQuestion;

import java.util.Scanner;

public class AnytoANyCOnversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int src = sc.nextInt();
		int db = sc.nextInt();
		int num = sc.nextInt();
		int num1 = base10(num, src);
		System.out.println(Disbase(num1, db));

	}

	public static int base10(int num, int s) {
		int ans = 0;
		int mult = 1;
		while (num != 0) {
			int rem = num % 10;
			ans = ans + rem * mult;
			mult *= s;
			num /= 10;
		}
		return ans;

	}

	public static int Disbase(int num, int dis) {
		int ans = 0;
		int mul = 1;
		while (num != 0) {
			int rem = num % dis;
			ans = ans + rem * mul;
			mul *= 10;
			num /= dis;
		}
		return ans;

	}

}
