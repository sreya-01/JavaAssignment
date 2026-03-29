import java.util.Scanner;
public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principal = sc.nextDouble();
		double rot = sc.nextDouble();
		double time = sc.nextDouble();
		double amount = principal * Math.pow(1 + rot/100, time);
		double ci = amount - principal;
		System.out.printf("The compound interest is %.2f%n and the total amount is %.2f%n", ci, amount);
	}
}
