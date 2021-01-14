import java.util.ArrayList;
import java.util.List;

public class Driver {
   private static final class A {
      public A() {
         System.out.println("Hello");
      }
   }

   static class B extends A {
      public B() {

      }
   }
   public static void main(String[] args) {
      new B();
   }
}
