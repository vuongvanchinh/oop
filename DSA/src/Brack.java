import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Brack {
   static boolean isTrue(String s) {
      Stack<Character> open = new Stack<>();
      int l = s.length();
      for (int i = 0; i < l; i++) {
         if (s.charAt(i) == '(') {
            open.push(s.charAt(i));

         } else {
            if (open.isEmpty()) return false;
            // if (open.pop() == ')') {
            //    return false;
            // }
            open.pop();

         }
      }
      //System.out.println();
      return open.isEmpty();
   }
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = Integer.parseInt(s.nextLine());
      for (int i = 0; i < n; i++) {
         String k = s.nextLine();
         if (isTrue(k)) {
            System.out.println("yes");
         } else {
            System.out.println("no");
         }
      }
      s.close();
   }
}
