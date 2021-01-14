public class Numeral extends Expression {
   private double value;

   /**
    * c.
    */
   public Numeral() {
      value = 0.0;
   }

   /**
    * c.
    */
   public Numeral(double value) {
      this.value = value;
   }

   /**
    * c.
    */
   public String toString() {
      if (value - (int) value == 0) {
         return (int) value + "";
      }
      return value + "";
   }

   /**
    * c.
    */
   public double evaluate() {
      return this.value;
   }
}
