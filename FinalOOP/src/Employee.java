package src;

public class Employee extends Person {

   int salary;

   protected Employee(String n, int a, int salary) {
      super(n, a);
      this.salary = salary;
   }
   
   @Override
   public String getInfo() {
      
      showInfo();
      return super.getInfo() + " " + salary;
   }

   private static void showInfo() {
      System.out.println("Hello");
   }
}
