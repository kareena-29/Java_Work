package Begin;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a = 0, b = 1;
        if(n==1){
            System.out.println(a);
            return;
        }
        if(n==2){
            System.out.print(a + " ");
            System.out.print(b + " ");
            return;
        }
        System.out.print(a + " ");
        System.out.print(b + " ");
        int fib;
        for(int i=2; i<n; i++){
            fib = a+b;
            a = b;
            b = fib;
            System.out.print(fib + " ");

        }
    }
}
