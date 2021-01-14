public class Circle extends Shape {
   private Point center;
   private double radius;


   public Circle(Point center, double radius, boolean solid, Color color) {
      super(solid, color);
      this.center = center;
      this.radius = radius;
   }

   public double getArea() {
      return Math.PI * radius * radius;
   }

   public void draw() {

   }

   public Point getCenter() {
      return this.center;
   }

   public void setCenter(Point center) {
      this.center = center;
   }

   public double getRadius() {
      return this.radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   @Override
   public boolean same(Shape p) {
      if (p instanceof Circle) {
         return center.same(((Circle)p).center);
      }
      return false;
   }


}
