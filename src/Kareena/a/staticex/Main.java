package Kareena.a.staticex;

public class Main {
    public static void main(String[] args) {
        Human Kareena = new Human(20, "Kar", 1000, false);
        Human Pooja = new Human(31, "Poo", 2000, true);

        System.out.println(Kareena.population);
        System.out.println(Pooja.population);
    }
}
