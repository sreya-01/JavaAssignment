import java.util.Scanner;
public class Discount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int amount = num >= 1000 ? 800 : 500 <= num && num < 999 ? num - num/10 : num;
		System.out.println(amount);
	}
}
