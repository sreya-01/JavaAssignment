import java.util.Scanner;
public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sqnum = num*num;
		int rem;
		int sum = 0;
		while(sqnum != 0) {
			rem = sqnum%10;
			sqnum = sqnum/10;
			sum += rem;
		}
		if(sum == num) {
			System.out.println("The given number is Neon number");
		}
		else {
			System.out.println("The given number is not a Neon number");
		}
	}
}
