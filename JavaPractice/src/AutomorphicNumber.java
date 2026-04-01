import java.util.Scanner;
public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sqnum = num*num;
		boolean isAutomorphic = true;
		int temp = num;
		
		while(temp>0) {
			if(temp%10 != sqnum%10) {
				isAutomorphic = false;
				break;
			}
			temp = temp/10;
			sqnum = sqnum/10;
			
		}
		
		if(isAutomorphic) {
			System.out.println("The given number is Automorphic number");
		}
		else {
			System.out.println("The given number is not Automorphic number");
		}
	}
}
