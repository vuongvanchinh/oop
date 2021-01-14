import java.util.List;

public class Developer extends Employee {
   public Developer() {
      super();

   }

   public Developer(String name, List<String> tasks) {
      super(name, tasks);
   }

   public void sayHello() {
      System.out.println("Hello");
   }
}


