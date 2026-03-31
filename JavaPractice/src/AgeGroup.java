import java.util.Scanner;
public class AgeGroup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String result = age < 12 ? "Child" : 12 <= age  && age< 19 ? "Teenager" : 20 <= age && age <= 64 ? "Adult" : "Senior";
		System.out.println(result);
	}
}

// learnt that 12<=age > 19 is invalid since it is compaing a boolean with integer, so re write it as 12<=age && age<19;