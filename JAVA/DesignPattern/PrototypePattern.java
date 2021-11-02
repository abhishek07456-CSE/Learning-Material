package JAVA.DesignPattern;

import java.util.ArrayList;
import java.util.List;

class Vehicles implements Cloneable {
  private List<String> VehiclesList;

  public Vehicles() {
    this.VehiclesList = new ArrayList<String>();
  }

  public Vehicles(List<String> list) {
    this.VehiclesList = list;
  }

  public void insertData() {
    VehiclesList.add("Honda amaze");
    VehiclesList.add("Audi A4");
    VehiclesList.add("Hyundai Creta");
    VehiclesList.add("Maruti Baleno");
    VehiclesList.add("Renault Duster");
  }

  public List<String> getVehiclesList() {
    return this.VehiclesList;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    List<String> tempList = new ArrayList<String>();

    for (String s : this.getVehiclesList()) {
      tempList.add(s);
    }

    return new Vehicles(tempList);
  }
}

public class PrototypePattern {

  public static void main(String[] args) throws CloneNotSupportedException {
    Vehicles a = new Vehicles();
    a.insertData();

    Vehicles b = (Vehicles) a.clone();//shallow copy by default both list point to same memory location , so make deep copy we must overide clone
    List<String> list = b.getVehiclesList();
    list.add("Honda new Amaze");

    System.out.println(a.getVehiclesList());
    System.out.println(list);

    b.getVehiclesList().remove("Audi A4");
    System.out.println(list);
    System.out.println(a.getVehiclesList());
  }

}