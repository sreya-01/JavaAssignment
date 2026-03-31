import java.util.Scanner;
public class PositiveElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizee = sc.nextInt();
		int[] arr = new int[sizee];
		int positiveNo = 0;
		for(int i=0; i<sizee; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<sizee; i++) {
			if(arr[i] > 0) {
				positiveNo += 1;
			}
		}
		System.out.println(positiveNo);
	}
}
