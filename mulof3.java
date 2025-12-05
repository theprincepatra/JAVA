// WAP to print multiple of 3 upto n terms

import java.util.Scanner;

public class mulof3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms will be present: ");
        int n = sc.nextInt();
        for(int x= 0; x<n; x++){
            System.out.print((int)Math.pow(3, x) + " ");
        }
    }
}
