import java.util.Scanner;

public class twistedprime {

    //check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= num / 2; i++) { // Check divisors up to num / 2
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //reverse the digits of a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (isPrime(num)) {
            // Reverse the number
            int reversedNum = reverseNumber(num);

            // Check if the reversed number is also prime
            if (isPrime(reversedNum)) {
                System.out.println(num + " is a twisted prime number.");
            } else {
                System.out.println(num + " is not a twisted prime number.");
            }
        } else {
            System.out.println(num + " is not a twisted prime number.");
        }

        scanner.close();
    }
}
