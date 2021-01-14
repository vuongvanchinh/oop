package Test;

public class Car extends Vehicle {
   
   private int numberOfDoors;

   /**
    * c.
    */
   public Car(String brand, String model, String registrationNumber, Person owner, int doors) {
      super(brand, model, registrationNumber, owner);
      this.numberOfDoors = doors;
   }

   /**
    * c.
    */
   public String getInfo() {
      StringBuilder sb = new StringBuilder();
      sb.append("Car:\n");
      sb.append("\tBrand: " + this.brand + "\n");
      sb.append("\tModel: " + this.model + "\n");
      sb.append("\tRegistration Number: " + this.registrationNumber + "\n");
      sb.append("\tNumber of Doors: " + this.numberOfDoors + "\n");
      sb.append("\tBelongs to " + owner.getName() + " - " + owner.getAddress() + "\n");
   
      return sb.toString();
   }

   /**
    * c.
    */
   public int getNumberOfDoors() {
      return this.numberOfDoors;
   }

   /**
    * c.
    */
   public void setNumberOfDoors(int numberOfDoors) {
      this.numberOfDoors = numberOfDoors;
   }
  
}
