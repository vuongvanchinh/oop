import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
   
   /**
    * c.
    * @throws NullPointerException c.
    */
   public static void nullPointerEx() throws NullPointerException {
      throw new NullPointerException("Lỗi Null Pointer");
      
   }

   /**
    * c.
    */
   public static String nullPointerExTest() {
      try {
         nullPointerEx();
      } catch (NullPointerException e) {
         return e.getMessage();
      }
      return "";
   }

   /**
    * c.
    */
   public static void arrayIndexOutOfBoundsExceptionEx() throws ArrayIndexOutOfBoundsException {
      throw new ArrayIndexOutOfBoundsException("Lỗi Array Index Out of Bounds");
   }

   /**
    * c.
    */
   public static String arrayIndexOutOfBoundsExTest() {
      try {
         arrayIndexOutOfBoundsExceptionEx();
      } catch (ArrayIndexOutOfBoundsException e) {
        return e.getMessage();
      }
      return "";
   }

   /**
    * c.
    * @throws ArithmeticException c.
    */
   public static void arithmeticEx() throws ArithmeticException {
      throw new ArithmeticException("Lỗi Arithmetic");
   }

   /**
    * c.
    */
   public static String arithmeticExTest() {
      try {
         arithmeticEx();
      } catch (ArithmeticException e) {
         return e.getMessage();
      }
      return "";
   }

   /**
    * c.
    * @throws FileNotFoundException c.
    */
   public static void fileNotFoundEX() throws FileNotFoundException {
      throw new FileNotFoundException("Lỗi File Not Found");
   }

   /**
    * c.
    */
   public static String fileNotFoundExTest() {
      try {
         fileNotFoundEX();
      } catch (FileNotFoundException e) {
         return e.getMessage();
      }
      return "";
   }

   /**
    * c.
    * @throws IOException c.
    */
   public static void ioEX() throws IOException {
      throw new IOException("Lỗi IO");
   }

   /**
    * c.
    */
   public static String ioExTest() {
      try {
         ioEX();
      } catch (IOException e) {
         return e.getMessage();
      }
      return "";
   }

   /**
    * c.
    * @param args c.
    */
   public static void main(String[] args) {
      nullPointerExTest();
   }
}
