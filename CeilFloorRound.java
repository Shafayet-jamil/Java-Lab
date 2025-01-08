import java.util.Scanner;

public class CeilFloorRound {
	public static void main(String[] args) {
		System.out.println("Here we find the Ceil, Floor and Round value of a number: ");
		System.out.println("Enter a numeber: ");
		Scanner cin = new Scanner(System.in);
		double num;
		num = cin.nextDouble();
		System.out.println("The Ceil, Floor and Round value of "+ num +" is: " + Math.ceil(num) + " " + Math.round(num)+" " + Math.round(num));

	}
}