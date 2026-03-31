import java.util.Scanner;
public class divisibleByFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = num%5 == 0 ? "The number is divisible by five": "The number is not divisible by five";
		System.out.println(result);
	}
}
