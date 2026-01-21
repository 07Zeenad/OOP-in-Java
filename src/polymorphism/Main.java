package polymorphism;

public class Main {
    public static void main(String[] args) {
        //method overloading
        Calculator c = new Calculator();
        c.add(2,3);
        c.add(2, 3 , 4);

        //method overriding

        Animals a = new Dog();
        a.sound();
    }
}
