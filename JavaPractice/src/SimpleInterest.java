import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principal = sc.nextDouble();
		double rot = sc.nextDouble();
		double time = sc.nextDouble();
		double SI = (principal * rot * time)/100;
		double total = SI + principal;
		System.out.println("Pricipal is: "+principal+" Total Amount is: "+total);
		
	}
}
