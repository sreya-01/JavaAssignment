import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int rem;
		int fact;
		int sum = 0;
		
		while(temp>0) {
			
			rem = temp%10;
			fact = 1;
			for(int i=1; i<=rem; i++) {
				fact = fact * i;
			}
			
			sum = sum + fact;
			temp = temp/10;
		}
		if(sum == num && num!=0) {
			System.out.println("The given number is a Strong number");
		}
		else {
			System.out.println("The given number is not a Strong number");
		}
	}
}
