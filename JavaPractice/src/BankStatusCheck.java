import java.util.Scanner;
public class BankStatusCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		String result = amount >= 1000 ? "Good Standing" : 500 <= amount && amount <= 999 ? "Low Balance" : "Account Overdrawn";
		System.out.println(result);
	}
}
