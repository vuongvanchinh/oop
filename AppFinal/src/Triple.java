public class Triple<T extends Comparable<T>> {
   T ag1;
   T ag2;
   T ag3;

   public Triple(T ag1, T ag2, T ag3) {
      this.ag1 = ag1;
      this.ag2 = ag2;
      this.ag3 = ag3;
   }

   public T getMax() {
      T max1 = (ag1.compareTo(ag2)> 0)? ag1 : ag2;
      return (ag3.compareTo(max1)> 0)? ag3 : max1;
   }

}
