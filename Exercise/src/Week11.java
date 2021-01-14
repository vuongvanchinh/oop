import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Week11 {
   
   /**
    * c.
    */
   public static <T extends Comparable<T>> List<T> sortGeneric(List<T> arr) {
      for (int i = 0; i < arr.size() - 1; i++) {
         for (int j = i + 1; j < arr.size(); j++) {
            if (arr.get(i).compareTo(arr.get(j)) > 0) {
               Collections.swap(arr, j, i);
            }         
         }
      }
      return arr;
   }

   /**
    * c. 
    */
   public static void main(String[] args) {
      List<Person> persons = new ArrayList<>();
      persons.add(new Person("Chinh", 19, "Bac Giang"));
      persons.add(new Person("D", 10, "W"));
      persons.add(new Person("Chinh", 20, "Bac Giang"));
      
      sortGeneric(persons);

      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(100);
      list.add(2);
      sortGeneric(list);
      for (Integer integer : list) {
         System.out.println(integer);
      }
      for (Person person : persons) {
         System.out.println(person.getInfo());
      }
   }

}
