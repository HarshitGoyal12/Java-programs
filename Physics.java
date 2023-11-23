import java.util.Scanner;
import java.lang.Math;


public class Physics {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the inital Velocity");
    double v0=input.nextDouble();
    System.out.println("Enter the inital acceelration");
   double a=input.nextDouble();
   System.out.println("Enter the inital time");
    int t=input.nextInt();
   

System.out.println("the displacement is"+(v0*t+1/2*a*Math.pow(t,2)));
input.close();
}

}