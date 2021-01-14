// using Comparable interface
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number implements Comparable<Number> {
   int value;

   public Number(int value) {
      this.value = value;
   }

   @Override
   public int compareTo(Number o) {
      return this.value - o.value;
   }

   public static void main(String[] args) {
      Number one = new Number(1);
      Number two = new Number(2);
      List<Number> numbers = new ArrayList<>();
      numbers.add(two);
      numbers.add(one);
      Collections.sort(numbers);
      for (Number number : numbers) {
         System.out.println(number.value);
      }
      Integer a = new Integer(5);
      Integer b = new Integer(5);
      System.out.println(a == b);
      System.out.println(a.equals(b));
   }
}
