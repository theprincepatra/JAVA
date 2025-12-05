// Create numebrs form 1 to 100 then replace 6 with 9 and print the numbers

public class cnvrt6to9 {
    public static void main(String[] args) {
        int num[] = new int[100];
        int j = 1;

        for (int i = 0; i <= 99; i++) {
            num[i] = j;
            j++;
        }

        for(int n : num){
            System.out.print(n + " ");
        }
        System.out.println();
        for (int i = 0; i <= 99; i++) {
            int check = num[i];
            String str = Integer.toString(check);
            str = str.replace('6', '9');
            num[i] = Integer.parseInt(str);
        }
        for(int n : num){
            System.out.print(n + " ");
        }
    }
}
