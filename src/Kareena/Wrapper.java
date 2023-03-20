package Kareena;

public class Wrapper {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer a = new Integer(10);
//        Integer b = new Integer(20);
//        swap(a,b);
//        System.out.println(" "+a);
//        System.out.println(" "+b);

        A obj;
        for (int i = 0; i <1000000; i++){
            obj = new A("RANDOM");

        }
    }
//    static void swap(int a, int b){
//        int temp = a;
//        a = b;
//        b = temp;
//    }


static void swap(Integer a, Integer b){
    Integer temp = a;
    a = b;
    b = temp;
}
}


class A{
    final int num = 10;
    String name;

    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
//        super.finalize();
    }
}
