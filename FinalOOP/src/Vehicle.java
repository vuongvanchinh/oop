package src;

public class Vehicle implements Cloneable {
   
   String color;
   String brand;

   public Vehicle() {

   }

   public Vehicle(String c, String b) {
      color = c;
      brand = b;
   }

   public Vehicle clone() {
     try {
         return (Vehicle) super.clone();
     } catch (Exception e) {
         e.printStackTrace();
     }
     return null;
   }
}
