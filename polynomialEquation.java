import java.util.Scanner;

public class polynomialEquation {
    public static void main(String[] args) {
        System.out.println("Here is the polynomial equation: a^2 + bx + c=0");
        System.out.println("Enter the value of a, b, and c: ");
        Scanner cin = new Scanner(System.in);
        double a = cin.nextDouble();
        double b = cin.nextDouble();
        double c = cin.nextDouble();

        double one = b*b - 4*a*c;
        if(one < 0) {
            System.out.println("The equation has no real roots.");
        }
        else{
            double two = Math.sqrt(one);
            double three = (-b+two) / (2*a);
            double four = (-b-two) / (2*a);
            System.out.println("The roots are " + three + " and " + four);
        }

    }
}