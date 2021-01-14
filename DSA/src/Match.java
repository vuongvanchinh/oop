import java.util.Scanner;

public class Match {
   
   static boolean isMatch(String a, String b) {
      int k = 0;
      boolean[] map = new boolean[a.length()];
      for (int i = 0; i < b.length(); i++) {
         int t = a.indexOf(b.charAt(i), k);
         if (t < 0) {
            t = a.indexOf(Character.toLowerCase(b.charAt(i)), k);
         }
         if (t < 0) return false;
         map[t] = true;
         k = t + 1;
      }
      for (int i = 0; i < a.length(); i++) {
         if (!map[i] && Character.isUpperCase(a.charAt(i))) {
            return false;
         }
      } 
      return true;
   }
  
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = Integer.parseInt(s.nextLine());
      String a, b;
      for (int i = 0; i < n; i++) {
         a = s.nextLine();
         b = s.nextLine();
         if (isMatch(a, b)) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }
      s.close();
      //System.out.println(isMatch("adBcdCd", "ABC"));
   }
}
