public class sub_arrays_UsingFun {

    public static void printsubarrays(int num[]){
        for(int i= 0; i<num.length; i++){      ////loop used for first element
            int start= i;
            for(int j= i; j<num.length; j++){   //loop used for last element
                int end= j;
                for(int k= start; k<=end; k++){  //loop used for the logic to print
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int  num[]= {2, 4, 6, 8, 10};
        printsubarrays(num);
    }
}
