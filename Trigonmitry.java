import java.util.Scanner;

public class Trigonmitry {
	public static void main(String[] args) {
		System.out.println("Here we find the triconmetry value of a Sin/cos/tan: ");
		System.out.println("Enter a degree: ");
		Scanner cin = new Scanner(System.in);
		double num;
		num = cin.nextDouble();
		System.out.println("The absolute value of Num is: "+Math.cos(num) + Math.toRadians(num));

	}
}