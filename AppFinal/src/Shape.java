public abstract class Shape {
   
   private boolean solid;
   private Color color;


   public Shape(boolean solid, Color color) {
      this.solid = solid;
      this.color = color;
   }
   
   public abstract boolean same(Shape p);
   public abstract double getArea();
   public abstract void draw();
}

enum Color {
   BLUE, RED, YELLOW
}