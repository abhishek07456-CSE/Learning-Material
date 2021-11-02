package JAVA.OOPS.Inheritence;
interface vehicles extends Model {
    String type = "electric";
    default void drive(String type){
        System.out.println(type + " is Running");
    }
    void getType();
}
interface Model {
    void getModel();
}
public class Interface {
   public static void main(String[] args) {
       vehicles c = new bikes("R15");
       c.getType();
       c.getModel();
   }
}
class jeep implements vehicles
{
     String model;
     String type = "jeep";
     jeep(String model){
        this.model = model;
     }
     @Override
     public void getType(){
        System.out.println("Type of vehicle is " + this.type);
        this.drive(type);
     }
     @Override
     public void getModel() {
         System.out.println("Type of Model is " + this.model);
     }
}
class bikes implements vehicles {
    String type = "bike";
    String model;
    bikes(String model){
        this.model = model;
    }
    @Override
    public void getType(){
       System.out.println("Type of vehicle is " + this.type);
       this.drive(type);
    }
    @Override
    public void getModel() {
        System.out.println("Type of Model is " + this.model);
    }
}