import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizee = sc.nextInt();
		int[] arr = new int[sizee];
		int sum = 0;
		for(int i=0; i<sizee; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<sizee; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
