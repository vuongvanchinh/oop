public class Rectangle extends Shape {
   Point topLeft;
   double width;
   double height;

   public Rectangle(Point topLeft, double width, double height, boolean solid, Color color) {
      super(solid, color);
      this.topLeft = topLeft;
      this.width = width;
      this.height = height;
   }


   public Point getTopLeft() {
      return this.topLeft;
   }

   public void setTopLeft(Point topLeft) {
      this.topLeft = topLeft;
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

   @Override
   public double getArea() {
      return width * height;
   }

   @Override
   public void draw() {
      
   }

   public boolean same(Shape p) {
      if (p instanceof Rectangle) {
         Rectangle r = (Rectangle) p;
         return r.topLeft.same(topLeft) && width == r.width && height == r.height;
      }
      return false;
   }

}
