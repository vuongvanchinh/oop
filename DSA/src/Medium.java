import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Medium {
   
   static double[] runningMedian(int[] a) {
      double[] result = new double[a.length];
      Queue<Integer> max = new PriorityQueue<>();
      Queue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
      min.add(a[0]);
      result[0] = a[0];
      for (int i = 1; i < a.length; i++) {
         if (max.size() == min.size()) {
            int t = max.peek();
            if (t < a[i]) {
               max.remove();
               max.add(a[i]);
               min.add(t);
            } else {
               min.add(a[i]);
            }
            result[i] = (double) min.peek();
         } else if (min.size() > max.size()) {
            int t = min.peek();
            if (t > a[i]) {
               min.remove();
               min.add(a[i]);
               max.add(t);
            } else {
               max.add(a[i]);
            }
            result[i] = (min.peek() + max.peek()) / 2.0;
         }
      }
      return result;
   }
   public static void main(String[] args) {
      int[] a = {1,2,3,4,5,6,7,8,9,10};
      double[] result = runningMedian(a);
      for (double d : result) {
         System.out.print( d + " ");
      }
   }
}
