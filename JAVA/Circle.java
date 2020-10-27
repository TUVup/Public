public class Circle {
   int radius;
   String name;

   public Circle() { }

   public double getArea(){
       return 3.14*radius*radius;
   }

   public static void main(String[] args){
       Circle pizza;
       pizza = new Circle();
       pizza.radius = 10;
       pizza.name = "Java-pizza";
       double area = pizza.getArea();
       System.out.println("Area of" + pizza.name + ": " + area);

       Circle dount = new Circle();
       dount.radius = 2;
       dount.name = "Java-Dount";
       area = dount.getArea();
       System.out.println("Area of " + dount.name + ": " + area);
   }
}
