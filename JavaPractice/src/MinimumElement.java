import java.util.Scanner;
public class MinimumElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizee = sc.nextInt();
		int[] arr = new int[sizee];
		for(int i=0; i<sizee; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for(int i=0; i<sizee; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
