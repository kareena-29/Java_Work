package Begin;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        System.out.println(n);

        int i = 2;
        while(i<=n){
            if(n%i == 0){
                break;
            }
            i++;
        }
        if(i==n)
            System.out.println("prime");
        else
            System.out.println("Not prime");

    }
}
