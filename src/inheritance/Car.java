package inheritance;

public class Car extends Vehicle{

    public Car(String color , String model)
    {
        super(color,model);
    }

    public void getModel()
    {
        System.out.println(color);
    }
}
