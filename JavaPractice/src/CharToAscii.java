import java.util.Scanner;
public class CharToAscii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		int Ascii = (int)input;
		System.out.printf("The Value of character is %c and its ASCII value is %d", input, Ascii);
	}
}
