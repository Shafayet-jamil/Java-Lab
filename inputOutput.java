import java.util.*;
import java.util.Scanner.*;
public class inputOutput
{
    public static void main(String[] args) {
        System.out.println("My name is jamil.\nWhat is your name?");
        Scanner cin = new Scanner(System.in);
        int num;
        num = cin.nextInt();
        System.out.println("My age is " + num + ".");
    }

}