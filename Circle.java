public class Circle {
   double radius;
   static int count = 0;
   Circle(){
    radius=10;
    count++;
   }
   
   public static void main(String[] args) {
      Circle c = new Circle();
      System.out.println(Circle.count +" "+ c.radius);
      Circle c1 = new Circle();
      System.out.println(Circle.count +" "+ c1.radius);
   }


}


