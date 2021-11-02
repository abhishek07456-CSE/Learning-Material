package JAVA.DesignPattern;
abstract class Vehicle{
    abstract int  getWheel();
    @Override
    public String toString(){
        return "wheel " + this.getWheel();
    }
}
class Car extends Vehicle{
    int wheel;
    Car(int wheel){
        this.wheel = wheel;
    }
    @Override
    int getWheel() {
        return this.wheel;
    }

}
class Bike extends Vehicle{
    int wheel;
    public Bike(int wheel){
        this.wheel = wheel;
    }
    @Override
    int getWheel() {
        return this.wheel;
    }

}

class VehicleFactory {
    //factory of object
    static public Vehicle getInstance(String type , int wheel){
        if(type == "car")
          return new Car(wheel);
        else if(type == "bike")
          return new Bike(wheel);
        return null;
    }
}
public class FactoryDesign {
      public static void main(String[] args) {
          //client code not aware of logic of code creation
          Vehicle car = VehicleFactory.getInstance("car", 4);
          Vehicle bike = VehicleFactory.getInstance("bike", 2);
          System.out.println(car);
          System.out.println(bike);
      }
}
