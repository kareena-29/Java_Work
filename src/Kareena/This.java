package Kareena;

public class This {
    public static void main(String[] args) {


        Student s1 = new Student(10,"Kareena", 80.5f);
        Student s2 = new Student(15,"Abc", 80.3f);
        Student s3 = new Student();
//        System.out.println(s1.rno);
//        System.out.println(s1.name);
//        System.out.println(s1.marks);
//
//        System.out.println(s2.rno);
//        System.out.println(s2.name);
//        System.out.println(s2.marks);


        System.out.println(s3.rno);
        System.out.println(s3.name);
        System.out.println(s3.marks);

        Student s4 = new Student(s3);
        System.out.println(s4.rno);
        System.out.println(s4.name);
        System.out.println(s4.marks);

        s4.greeting();


    }
}
class Student {
    int rno;
    String name;
    float marks;
    Student (){
        this.rno = 12;
        this.name = "hey";
        this.marks = 55.5f;
    }
    Student(int rno, String naam, float m){
        this.rno = rno;
        name = naam;
        marks = m;
    }
    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    void greeting(){
        System.out.println("Name:  "+this.name);
    }
}


