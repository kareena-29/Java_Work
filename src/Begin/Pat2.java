package Begin;

import java.util.Scanner;

public class Pat2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //3
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=n){
//                System.out.print(j + " ");
//                j++;
//            }
//            i++;
//            System.out.println();
//        }

        //4
//        int i=1;
//        while(i<=n){
//            int j=n;
//            while(j>=1){
//                System.out.print(j + " ");
//                j--;
//            }
//            i++;
//            System.out.println();
//        }

        //5
//        int i=1;
//        int c = 1;
//        while(i<=n){
//            int j=1;
//            while(j<=n){
//                System.out.print(c + " ");
//                j++;
//                c++;
//            }
//            i++;
//            System.out.println();
//        }

        //6
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                System.out.print("* ");
//                j++;
//            }
//            i++;
//            System.out.println();
//        }

//        7
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                System.out.print(i+" ");
//                j++;
//            }
//            i++;
//            System.out.println();
//        }

//        8
//        int i=1;
//        int count = 1;
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                System.out.print(count+" ");
//                j++;
//                count++;
//            }
//            i++;
//            System.out.println();
//        }

//        9
//        int i=1;
//        while(i<=n){
//            int j=1;
//            int count = i;
//            while(j<=i){
//                System.out.print(count+" ");
//                j++;
//                count++;
//            }
//            i++;
//            System.out.println();
//        }

//        without count!
    /*    int i=1;
        while(i<=n){
            int j=1;
//            int count = i;
            while(j<=i){
                System.out.print((i+j-1)+" ");
                j++;
//                count++;
            }
            i++;
            System.out.println();
        }

     */

//        10
/*        int i=1;
        while(i<=n){
            int j=1
            while(j<=i){
//                System.out.print(count+" ");
                System.out.print((i-j+1)+" ");
                j++;
//                count--;
            }
            i++;
            System.out.println();
        } */

//        11
//        int i = 0;
//        while(i < n){
//            int j=0;
//           while(j < n){
//               System.out.print((char)(65+i) + " ");
//               j++;
//           }
//            System.out.println();
//           i++;
//        }

//        12
//        int i=0;
//        while(i<n){
//            int j=0;
//
//            while(j<n){
//                System.out.print((char)(65+j) + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        13
//        int i=0;
//        int count = 65;
//        while(i<n){
//            int j=0;
//
//            while(j<n){
//                System.out.print((char)(count) + " ");
//                j++;
//                count++;
//            }
//            System.out.println();
//            i++;
//        }

//        14
//        int i=0;
//        while(i<n){
//            int j=0;
//            while(j<n){
//                System.out.print((char)(65+i+j) + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        15
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                System.out.print((char)(65+i-1) + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        16
//        int i=1;
//        int count = 0;
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                System.out.print((char)(count+65) + " ");
//                j++;
//                count++;
//            }
//            System.out.println();
//            i++;
//        }

//        17
//        int i=1;
////        int count = 0;
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                System.out.print((char)(i+j-2+65) + " ");
//                j++;
////                count++;
//            }
//            System.out.println();
//            i++;
//        }

//        18
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=i){
//                System.out.print((char)(n-i+j-1+65) + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        19
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=n-i){
//                System.out.print("  ");
//                j++;
//            }
//            j=1;
//            while(j<=i){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        20
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=n-i+1){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        21
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=i-1){
//                System.out.print("  ");
//                j++;
//            }
//            while(j<=n) {
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        22
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=i-1){
//                System.out.print("  ");
//                j++;
//            }
//            while(j<=n) {
//                System.out.print(i+" ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //23
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=n-i){
//                System.out.print("  ");
//                j++;
//            }
//            while(j<=n) {
//                System.out.print(i+" ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //24
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=i-1){
//                System.out.print("  ");
//                j++;
//            }
//            while(j<=n) {
//                System.out.print(j+" ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        25
//        int i=1;
//        int count = 1;
//        while(i<=n){
//            int j=1;
//            while(j<=n-i){
//                System.out.print("  ");
//                j++;
//            }
//            while(j<=n) {
//                System.out.print(count+" ");
//                j++;
//                count++;
//            }
//            System.out.println();
//            i++;
//        }

//        26
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=n-i){
//                System.out.print("  ");
//                j++;
//            }
//            j=1;
//            while(j<=i) {
//                System.out.print(j+" ");
//                j++;
//            }
//            j=1;
//            while(j<=i-1){
//                System.out.print(i-j+" ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        27
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print(j+" ");
                j++;
            }
            j=1;
            while(j<=i-1) {
                System.out.print("* ");
                j++;
            }
            j=1;
            while(j<=i-1){
                System.out.print("* ");
                j++;
            }
            while(j<=n){
                System.out.print((n-j+1)+" ");
                j++;
            }
            System.out.println();
            i++;
        }



    }
}
