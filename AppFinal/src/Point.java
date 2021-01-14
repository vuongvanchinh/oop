public class Point {
   private double x;
   private double y;


   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public double getX() {
      return this.x;
   }

   public void setX(double x) {
      this.x = x;
   }

   public double getY() {
      return this.y;
   }

   public void setY(double y) {
      this.y = y;
   }

   public double distance(Point p) {
      return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
   }

   public boolean same(Point p) {
      return p.x == x && p.y == y;
   }
}

