public class Multiplication extends BinaryExpression {
   /**
    * com.
    * @param left .
    * @param right .
    */
   public Multiplication(Expression left, Expression right) {
      super(left, right);
   }

   @Override
   public String toString() {
      
      return String.format("(%s * %s)", left.toString(), right.toString());
   }

   @Override
   public double evaluate() {
      return left.evaluate() * right.evaluate();
   }
}
