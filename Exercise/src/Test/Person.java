package Test;

import java.util.ArrayList;
import java.util.List;

public class Person{

   private String name;
   private String address;
   private List<Vehicle> vehicleList;

   /**
    * c.
    */
   public Person(String name, String address) {
      this.name = name;
      this.address = address;
      vehicleList = new ArrayList<>();
   }

   /**
    * c.
    */
   public String getName() {
      return this.name;
   }

   /**
    * c.
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * c.
    */
   public String getAddress() {
      return this.address;
   }

   /**
    * c.
    */
   public void setAddress(String address) {
      this.address = address;
   }

   /**
    * c.
    */
   public void removeVehicle(String registrationNumber) {
      int i = 0;
      while (i < vehicleList.size()) {
         if (vehicleList.get(i).registrationNumber.equals(registrationNumber)) {
            vehicleList.remove(i);
            return;
         }
          i++;
      }
   }
   
   /**
    * c.
    */
   public void addVehicle(Vehicle vehicle) {
      this.vehicleList.add(vehicle);
   }

   /**
    * c.
    */
   public String getVehiclesInfo() {
      if (vehicleList.isEmpty()) {
         return this.name + " has no vehicle!";
      }

      StringBuilder sb = new StringBuilder();
      sb.append(this.name + " has:\n\n");
      for (Vehicle v : vehicleList) {
         sb.append(v.getInfo());
      }
      return sb.toString();
   }
}