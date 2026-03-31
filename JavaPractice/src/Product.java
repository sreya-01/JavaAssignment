import java.util.Scanner;
public class Product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizee = sc.nextInt();
		int[] arr = new int[sizee];
		int product = 1;
		for(int i=0; i<sizee; i++) {
			arr[i] = sc.nextInt();
			product *= arr[i];
		}
		System.out.println(product);
		
	}
}
