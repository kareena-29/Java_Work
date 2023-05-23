package Begin;

import java.util.Scanner;

public class Pat1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //1
//        int i = 0;
//        while(i < n){
//            int j=0;
//           while(j < n){
//               System.out.print("*");
//               j++;
//           }
//            System.out.println();
//           i++;
//        }

        //2
        int i=1;
        while(i<=n){
            int j=1;

            while(j<=n){
                System.out.print(i);
                j++;
            }
            System.out.println();
           i++;
        }

    }
}
