import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Cookie {
   static int cookies(int k, Queue<Integer> q) {
      int result = 0;
      int m1;
      int m2;
      while (q.size() >= 2 && q.peek() < k) {
         m1 = q.remove();
         m2 = q.remove();
         q.add(m1 + 2* m2);
         result ++;
      }
      if (q.peek() < k) return -1;
      return result;
   }
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int k = s.nextInt();
      Queue<Integer> q = new PriorityQueue<>();
      for (int i = 0; i < n; i++) {
         q.add(s.nextInt());
      }
      s.close();
      System.out.println(cookies(k, q));
   }
}
