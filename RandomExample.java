import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100); // Random number from 0 to 99
        System.out.println(num);
    }
}
