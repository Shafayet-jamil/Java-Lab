import java.util.Random;

public class SimulatingDiceRoll {
    public static void main(String[] args) {
       Random rand = new Random();
//       int one = rand.nextInt(10);
       int num = rand.nextInt(6, 100);

       System.out.println("The number rolled is " + num);
//        System.out.println("The number rolled is " + one);
    }
}