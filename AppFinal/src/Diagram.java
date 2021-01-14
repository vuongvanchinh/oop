import java.util.Arrays;
import java.util.List;

public class Diagram extends Shape {
   private double width;
   private double height;
   private List<Shape> shapes;


   public Diagram(double width, double height, List<Shape> shapes, boolean solid, Color color) {
      super(solid, color);
      this.width = width;
      this.height = height;
      this.shapes = shapes;
   }

   public double getWidth() {
      return this.width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getHeight() {
      return this.height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   public List<Shape> getShapes() {
      return this.shapes;
   }

   public void setShapes(List<Shape> shapes) {
      this.shapes = shapes;
   }

   @Override
   public double getArea() {
      return width * height;
   }

   @Override
   public void draw() {
      for (Shape shape : shapes) {
         shape.draw();
      }
   }

   public boolean contains(Shape p) {
      for (Shape shape : shapes) {
         if (shape.same(p)) return true;
      }
      return false;
   }

   public static <T extends Comparable<T>> Pair<T, T> getMaxMin(T[] arr) {
      Arrays.sort(arr);
      return new Pair<>(arr[0], arr[arr.length - 1]);
   }

   public static void main(String[] args) {
      Integer[] arr = {0, 5, 4};
      Pair<Integer, Integer> a = getMaxMin(arr);
      System.out.println(a.getKey());
      System.out.println(a.getValue());
   }

   @Override
   public boolean same(Shape p) {
      // TODO Auto-generated method stub
      return false;
   }
}
