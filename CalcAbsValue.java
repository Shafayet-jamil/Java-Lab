import java.util.Scanner;

public class CalcAbsValue {
	public static void main(String[] args) {
		System.out.println("Here we find the absulate value of a number: ");
		System.out.println("Enter a numebr: ");
		Scanner cin = new Scanner(System.in);
		double num;
		num = cin.nextDouble();
		System.out.println("The absolute value of Num is: " + Math.abs(num));

	}
}