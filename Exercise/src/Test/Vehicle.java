package Test;

public abstract class Vehicle {
   
   protected String brand;
   protected String model;
   protected String registrationNumber;
   protected Person owner;

   /**
    * c.
    */
   public Vehicle(String brand, String model, String registrationNumber, Person owner) {
      this.brand = brand;
      this.model = model;
      this.registrationNumber = registrationNumber;
      this.owner = owner;
   }

   /**
    * c.
    */
   public abstract String getInfo();

   /**
    * c.
    */
   public void transferOwnership(Person newOwner) {
      this.owner = newOwner;
   }

   /**
    * c.
    */
   public String getBrand() {
      return this.brand;
   }

   /**
    * c.
    */
   public void setBrand(String brand) {
      this.brand = brand;
   }

   /**
    * c.
    */
   public String getModel() {
      return this.model;
   }

   /**
    * c.
    */
   public void setModel(String model) {
      this.model = model;
   }

   /**
    * c.
    */
   public String getRegistrationNumber() {
      return this.registrationNumber;
   }

   /**
    * c.
    */
   public void setRegistrationNumber(String registrationNumber) {
      this.registrationNumber = registrationNumber;
   }

   /**
    * c.
    */
   public Person getOwner() {
      return this.owner;
   }

   /**
    * c.
    */
   public void setOwner(Person owner) {
      this.owner = owner;
   }
}
