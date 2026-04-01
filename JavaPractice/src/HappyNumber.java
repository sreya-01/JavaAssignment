import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int hnum = num;
		
		// A number is unhappy if it enters a loop that includes the number 4
		while(hnum != 1 && hnum != 4) {
			int sum = 0;
			while(hnum != 0) {
				int rem = hnum % 10;
				sum = sum + (rem * rem);
				hnum = hnum / 10;
			}
			hnum = sum;
		}
		
		if(hnum == 1) {
			System.out.println("The given number is Happy number");
		}
		else {
			System.out.println("The given number is not Happy number");
		}
		
		sc.close();
	}
}