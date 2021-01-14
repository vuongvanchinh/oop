public class Pair<K extends Comparable<K>, V extends Comparable<V>> {
   K k;
   V v;

   public Pair(K key, V value) {
      k = key;
      v = value;
   } 

   public K getKey() {return k;}
   public V getValue() {return v;}
}
