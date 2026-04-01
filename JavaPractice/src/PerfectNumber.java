import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num/2; i++) {
			if(num%i == 0) {
				sum = sum + i;
			}
		}
		
		if(sum == num && num!=0) {
			System.out.println("The given number is a Perfect Number");
		}
		else {
			System.out.println("The given number is not a Perfect Number");
		}
		sc.close();
	}
}
