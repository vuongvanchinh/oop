import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Pairs {
    // Complete the pairs function below.
    static int pairs(int k, Map<Integer, Integer> hashTable) {
      int count = 0;
      Set<Integer> keys = hashTable.keySet();
      for (int i : keys) {
          if (hashTable.get(i + k) != null) {
              count ++;
          }
      }
      return count;
  }

  public static void main(String[] args) {
     int[] a = {1,5,3,4,2};
     Map<Integer, Integer> hashTable = new Hashtable<>();
     for (int i : a) {
        hashTable.put(i, i);
     }
     int k = 2;
     System.out.println(pairs(k, hashTable));

  }
}
