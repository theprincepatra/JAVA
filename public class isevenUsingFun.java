// Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test
// your method using function and methods.


import java.util.Scanner;
public class isevenUsingFun{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        boolean result = isEven(a);
        System.out.println(result);
    }
    public static boolean isEven(int x){
        if(x%2==0){
            System.out.println("The number reurns: ");
            return true;
        }
        else{
            return false;
        }
    }
}
