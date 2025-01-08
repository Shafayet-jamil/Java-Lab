import java.util.Scanner;
import java.math.*;

public class MinMax {
	public static void main(String[] args) {
		System.out.println("Enter Two number: ");
		int one;
		int two;
		System.out.println("Enter Number one: ");

		Scanner cin = new Scanner(System.in);
		one = cin.nextInt();
		System.out.println("Enter Number two: ");
		two = cin.nextInt();

		System.out.println("Max of two number is: " + Math.max(one, two));
	}
}