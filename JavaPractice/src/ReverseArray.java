import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizee = sc.nextInt();
		int[] arr = new int[sizee];
		for(int i=0; i<sizee; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=sizee-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
}
