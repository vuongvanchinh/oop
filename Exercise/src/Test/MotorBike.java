package Test;

public class MotorBike extends Vehicle {
   
   private boolean hasSidecar;

   /**
    * c.
    */
   public MotorBike(String brand, String model,
                     String registrationNumber, Person owner, boolean hasSidecar) {
      super(brand, model, registrationNumber, owner);
      this.hasSidecar = hasSidecar;
   }

   /**
    * c.
    */
   public String getInfo() {
      StringBuilder sb = new StringBuilder();
      sb.append("Motor Bike:\n");
      sb.append("\tBrand: " + this.brand + "\n");
      sb.append("\tModel: " + this.model + "\n");
      sb.append("\tRegistration Number: " + this.registrationNumber + "\n");
      sb.append("\tHas Side Car: " + this.hasSidecar + "\n");
      sb.append("\tBelongs to " + owner.getName() + " - " + owner.getAddress() + "\n");
      return sb.toString();
   }

   /**
    * c.
    */
   public boolean isHasSidecar() {
      return hasSidecar;
   }

   /**
    * c.
    */
   public void setHasSidecar(boolean hasSidecar) {
      this.hasSidecar = hasSidecar;
   } 
}
