public class Square extends Expression {

   private Expression expression;

   /**
    * c.
    * @param expression c.
    */
   public Square(Expression expression) {
      this.expression = expression;
   }

   /**
    * c.
    */
   public String toString() {
      return String.format("(%s) ^ 2", expression.toString());
   }

   /**
    * c.
    */
   public double evaluate() {
      return expression.evaluate() * expression.evaluate();
   }
}
