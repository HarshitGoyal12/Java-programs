// package 4-10-23;

public class Circle2 {
    private double radius=1;
    private static int numOfObjects=0;
    public Circle2(){
        numOfObjects++;
    }
    public Circle2(double newRadius){
        radius=newRadius;
        numOfObjects++;
    
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius=(newRadius>=0)?newRadius:0;


    }
    public static int getNumber(){
        return numOfObjects;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    // public static void main(String[] args) {
    //     Circle2 c=new Circle2();
    //     c.getRadius();
    // }

}

