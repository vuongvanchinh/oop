import java.util.Scanner;

public class Find {
   
   
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int m = s.nextInt();
      int[] a = new int[n];
      int[] b = new int[m];

      for (int i = 0; i < n; i++) {
         a[i] = s.nextInt();
      }
      
      for (int i = 0; i < m; i++) {
         b[i] = s.nextInt();
      }
      int result[] = new int[n];
      for (int i = 0; i < n; i++) {
         result[i] = -1;
         boolean find = false;
         for (int j = 0; j < m; j++) {
            if (!find && a[i] == b[j]) {
               find = true;
               continue;
            }
            if (find && b[j] > a[i]) {
               result[i] = b[j];
               break;
            }
         }
      }
      s.close();
      for (int i : result) {
         System.out.print(i + " ");
      }
   }
}