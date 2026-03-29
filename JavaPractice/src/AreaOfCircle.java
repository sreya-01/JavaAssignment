import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double area = pi*Math.pow(2,r);
		System.out.println("The area of the circle is:" + area);
	}
}
