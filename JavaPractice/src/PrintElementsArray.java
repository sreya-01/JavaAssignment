import java.util.Scanner;

public class PrintElementsArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizee = sc.nextInt();
		int[] arr = new int[sizee];
		for(int i=0; i<sizee; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
