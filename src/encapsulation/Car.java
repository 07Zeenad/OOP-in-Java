package encapsulation;
public class Car {
     private String color ;
     private int speed ;
  public Car(String color , int speed)
  {
      this.color = color;
      this.speed = speed;
  }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


  public int getSpeed()
  {
      return  speed;
  }
    public void setSpeed(int speed) {
        if(speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed must be positive!");
        }
    }

    public  void drive()
  {
      System.out.println("The " + color + " car is driving at " + speed +" km/h" );
  }
}
