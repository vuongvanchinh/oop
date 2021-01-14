import java.util.ArrayList;
import java.util.List;

public  class Employee {
   private String name;
   private List<String> listOfTask;

   public Employee() {
      listOfTask = new ArrayList<>();
   }

   public Employee(String name, List<String> task) {
      this.name = name;
      this.listOfTask = task;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<String> getListOfTask() {
      return this.listOfTask;
   }

   public void setListOfTask(List<String> listOfTask) {
      this.listOfTask = listOfTask;
   }

   public int countTask() {
      return listOfTask.size();
   }

   public static void main(String[] args) {
      System.out.println("Hello");
   }
}