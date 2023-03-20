package Kareena;

import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n){
        if(n <= 1)
            return n;

        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {

        System.out.println("Enter n : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(fibo(n));

    }



}
