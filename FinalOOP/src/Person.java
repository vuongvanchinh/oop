package src;

public abstract class Person {
   String name;
   int age;

   protected Person(String n, int a) {
      name = n;
      age = a;
   }

   public String getInfo() {
      return name + " " + age + " years old ";
   }

   private void sayHello() {
      System.out.println("Hello Viet Nam");
   }

}