package Kareena;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);


        //type casting
        int num = (int)(66.56f);
        System.out.println(num);

        //automatic type promotion into expressions
//        int a = 513;
//        byte b = (byte)(a);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b / c;
//        System.out.println(d);

//        byte x = 10;
//        x = x*10;

        int num1 = 'a';
        System.out.println(num1);

        System.out.println("वाहेगुरू");
        System.out.println(3*5.5f);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println((f*b)+" " + (i/c) + " " + (d*s));
        //float+int-double = double
        System.out.println(result);
    }
}
