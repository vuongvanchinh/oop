package src;

public class Driver {
   
   static void change(String h) {
      h = "kk";
   }
   public static void main(String[] args) throws MyException {
      Person p = new Employee("Chinh", 19, 50);
      Person p2 = (Person) new Employee("Chinh Vuong", 19, 100);
      
      System.out.println(((Employee) p2).salary);
      System.out.println(((Employee)p).salary);
   }
}
