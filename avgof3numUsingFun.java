// Write a Java method to compute the average of three numbers using function and methods.
import java.util.Scanner;

public class avgof3numUsingFun{
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avgof3(a, b, c);
    }
    public static void avgof3(int x, int y, int z){
        int avg = (x+y+z)/3;
        System.out.println("Average of "+x+", "+y+" & "+z+" is: "+avg);
    }
}
