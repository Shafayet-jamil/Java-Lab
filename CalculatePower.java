import java.util.Scanner;

public class CalculatePower {
	public static void main(String[] args) {
		System.out.println("Here we find the absulate value of a number: ");
		System.out.println("Enter a numebr: ");
		Scanner cin = new Scanner(System.in);
		double num, power;
		num = cin.nextDouble();
		System.out.println("Enter a power of this numebr: ");
		power = cin.nextDouble(); 
		System.out.println("The absolute power of " +  num +" is: " + Math.pow(num, power));

	}
}