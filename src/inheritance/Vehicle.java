package inheritance;

public class Vehicle {
    String color ;
    String model ;
     public Vehicle(String color, String model)
     {
        this.color = color ;
        this.model = model ;
     }
     public void showDetails()
     {
         System.out.println("Color is : "+ color);
         System.out.println("Model is : "+model);
     }
}
