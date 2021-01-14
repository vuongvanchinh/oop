import java.util.ArrayList;
import java.util.List;

public class Manage extends Employee {
   List<Employee> employees;

   public Manage() {
      employees = new ArrayList<>();
   }
   
   public int countTask() {
      
      int result = 0;
      for (Employee employee : employees) {
         result += employee.countTask();
      }
      return result;
   }
}
