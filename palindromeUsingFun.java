// Write a Java program to check if a number is a palindrome in Java using funnctions and methods? ( 121 is
// a palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is
// a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.

import java.util.Scanner;

public class palindromeUsingFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check: ");
        int p = sc.nextInt();
        isPal(p);
    }
    public static void isPal(int x) {
        int org = x;
        int rev = 0;
        while(x>=0){       
            int pow = 0;
            int digit = x%10;
            rev = rev + digit*(int)Math.pow(10,pow);
            x = x/10;
            pow++;
        }

        if(org==rev){
            System.out.println("number is a palindrome");
        }
        else{
            System.out.println("number is not a palindrome");
        } 
        
    }
}
