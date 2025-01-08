import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		System.out.println("Here we find the Square root value of a number: ");
		System.out.println("Enter a numebr: ");
		Scanner cin = new Scanner(System.in);
		double num;
		num = cin.nextDouble();
		System.out.println("The absolute value of Num is: " + Math.sqrt(num));

	}
}