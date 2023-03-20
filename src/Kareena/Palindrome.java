package Kareena;

import java.util.Scanner;

public class Palindrome {
    static boolean pali(String s){
        int n = s.length()-1;
        for(int i = 0; i < (n/2)+1; i++,n--){
            if(s.charAt(i) != s.charAt(n)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner input = new Scanner(System.in);
        String s = input.next();

        if(pali(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
