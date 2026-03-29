import java.util.Scanner;
public class CompundInterestAndSimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principal = sc.nextDouble();
		double rotPercent = sc.nextDouble();
		double months = sc.nextDouble();
		double time = months/12;
		double SI = (principal * rotPercent * months)/100;
		double totalSI = principal + SI;
		double CI = principal*Math.pow(1+rotPercent/100, months) - principal;
		double totalCI = principal + CI;
		System.out.printf("The Simple Interest %.2f%n and Amount is %.2f%n ", SI, totalSI);
		System.out.printf("The Compound Interest %.2f%n and Amount is %.2f%n ", CI, totalCI);
		
	}
}
