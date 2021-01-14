public class Triangle extends Shape {
   private Point p1;
   private Point p2;
   private Point p3;

   public Triangle(Point p1, Point p2, Point p3, boolean solid, Color color) {
      super(solid, color);
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
   }

   public double getArea() {
      double a = p1.distance(p2);
      double b = p1.distance(p3);
      double c = p2.distance(p3);
      double p = (a+b+c) /2.0;

      return Math.sqrt(p * (p - a) * (p - b) * (p - c));
   }

   public void draw() {

   }


   public Point getP1() {
      return this.p1;
   }

   public void setP1(Point p1) {
      this.p1 = p1;
   }

   public Point getP2() {
      return this.p2;
   }

   public void setP2(Point p2) {
      this.p2 = p2;
   }

   public Point getP3() {
      return this.p3;
   }

   public void setP3(Point p3) {
      this.p3 = p3;
   }

   @Override
   public boolean same(Shape p) {
      if ( p instanceof Triangle) {
         Triangle t = (Triangle) p;
         return p1.same(t.p1) && p2.same(t.p2) && p3.same(t.p3);
      }
      return false;
   }
   

}
