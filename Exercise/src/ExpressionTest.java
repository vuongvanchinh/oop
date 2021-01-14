public class ExpressionTest {

   /**
    * c.
    * @param args c.
    */
   public static void main(String[] args) {
      Expression ten = new Numeral(10);
      Expression three = new Numeral(3);
      Expression four = new Numeral(4);
      Square tenSquare = new Square(ten);
      Subtraction sub = new Subtraction(tenSquare, three);
      Addition sum = new Addition(sub, new Multiplication(four, three));
      Square result = new Square(sum);
      
      System.out.println(result.toString());
   }
}
