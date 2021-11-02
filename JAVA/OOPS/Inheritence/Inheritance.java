package JAVA.OOPS.Inheritence;

public class Inheritance {
   public static void main(String[] args) {
       MusicPlayer mp = new MusicPlayer();
       mp.setBrand("SONY mp player");
       Vehicle vehicle = new Car("TATA MOTORS" , "BLACK");
       vehicle.setMp(mp);
       vehicle.drive();
   }
}

abstract class Vehicle {
    protected String color;
    protected String brand;
    protected MusicPlayer mp;
    public MusicPlayer getMp() {
        return mp;
    }
    public void setMp(MusicPlayer mp) {
        this.mp = mp;
    }
    Vehicle() {
        System.out.println("Vehicle default constructor called");
    }
    Vehicle(String brand , String color){
        this();
        this.brand = brand;
        this.color = color;
        System.out.println("Vehicle params constructor called");
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void drive(){
        System.out.println("Vehicle  Having Properties : " +"\nBrand = " + this.brand + "\nColor = "+this.color);
    }

}

class Car extends Vehicle {
    Car() {
        super();
        System.out.println("Car default constructor called");
    }
    Car(String brand , String color){
        super(brand , color);
        System.out.println("Car params constructor called");
    }
    @Override
    public void drive(){
        System.out.println("CAR  Having Properties : " +"\nBrand = " + this.brand + "\nColor = "+this.color);
        System.out.println("Car has as " + mp.getBrand());
    }
}
class Bike extends Vehicle {
    Bike() {
        super();
        System.out.println("Bike default constructor called");
    }
    Bike(String brand , String color){
        super(brand , color );
        System.out.println("Bike params constructor called");
    }
    @Override
    public void drive(){
        System.out.println("Bike  Having Properties : " +"\nBrand = " + this.brand + "\nColor = "+this.color);
    }
}
class MusicPlayer{
    protected String brand;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    protected MusicPlayer(){
        System.out.println("Music Player default constructor called");
    }

}