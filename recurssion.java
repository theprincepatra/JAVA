import java.util.Scanner;
class recurssion{
    public static void fact(int fac, int  n){
        if(n == 1){
            int fac *= n;
            System.out.println(fac);
            return;
        }
        int fac *= n;
        fact(fac, n-1);
    }

    public static void main(Strings[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number you want to factorial: ");
        int n = sc.nextInt();
        fact(1, n);
    }
}
