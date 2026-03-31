import java.util.Scanner;
public class MaximumElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizee = sc.nextInt();
		int[] arr = new int[sizee];
		int max;
		for(int i=0; i<sizee; i++) {
			arr[i] = sc.nextInt();
		}
		max = arr[0];
		for(int i=0; i<sizee; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			else {
				continue;
			}
		}
		
		System.out.println(max);
		
	}
}
