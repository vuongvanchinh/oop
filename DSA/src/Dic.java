import java.util.Scanner;

public class Dic {
   
   static boolean canSolve(String str, String s) {
      int k = 0;
      int t = 0;
      for (int i = 0; i < s.length(); i++) {
         t = str.indexOf(s.charAt(i), k);
         if (t < 0) {
            return false;
         }
         k = t + 1;
      }
     // System.out.println("match");
      return true;
   }

   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
      int n = Integer.parseInt(s.nextLine());
      
      String[] dic = new String[n];
      for (int i = 0; i < n; i++) {
         dic[i] = s.nextLine();
      }
      s.close();

      String result = "";
      for (int i = 0; i < n; i++) {
         if (canSolve(str, dic[i]) && dic[i].length() > result.length()) {
            result = dic[i];
         }
      }
      System.out.println(result);
   }
}
