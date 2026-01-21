package encapsulation;
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Red" , 20);
        Car car2 = new Car("Black" , 40);
        Car car3 = new Car("Black" , -40);

        car1.drive();

        car2.drive();
//        car3.drive();
        car3.setSpeed(-40);

    }
}