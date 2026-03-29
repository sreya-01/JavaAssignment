import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 = sc.nextInt();
		System.out.println("Enter second number:");
		int n2 = sc.nextInt();
		System.out.println("Enter third number:");
		int n3 = sc.nextInt();
		double average = (n1+n2+n3)/3;
		System.out.println("The average of three numbers in whole number form is" + " " + (int)average);
	}
}
