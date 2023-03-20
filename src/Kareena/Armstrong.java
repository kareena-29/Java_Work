package Kareena;

import java.util.Scanner;

public class Armstrong {
    static void armstrong(int a, int b){
        for(int i = a; i <= b; i++){
            int num = i;
            int sum = 0;
            int rem;

            while (num > 0){
                rem = num % 10;
                sum = sum + (rem*rem*rem);
                num = num /10;
            }
            if(sum == i){
                System.out.println(sum);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        armstrong(a,b);
    }
}
