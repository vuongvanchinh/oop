public class Person implements Comparable<Person> {
   
   private String name;
   private int age;
   private String address;

   /**
    * c.
    */
   public Person() {

   }
   
   /**
    * c.
    */
   public Person(String name, int age, String address) {
      this.name = name;
      this.age = age;
      this.address = address;
   }

   /**
    * c.
    */
   @Override
   public int compareTo(Person o) {
      int nameC = name.compareTo(o.name);
      int ageC = this.age - o.age;
      if (nameC == 0) {
         if (ageC == 0) {
            return 0;
         } else {
            return ageC;
         }
      } else {
         return nameC;
      }
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
   public int getAge() {
      return this.age;
   }

   /**
    * c.
    */
   public void setAge(int age) {
      this.age = age;
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
   public String getInfo() {
      return this.name + " " + this.age + " " + this.address;
   }
}
