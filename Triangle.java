import java.util.Scanner;
import java.lang.Math;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1,x2,x3,y1,y2,y3;
        
        x1=input.nextInt();
        y1=input.nextInt();
        x2=input.nextInt();
        y2=input.nextInt();
        x3=input.nextInt();
        y3=input.nextInt();
       double a,b,c;

       a=Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),1/2);
       b=Math.pow(Math.pow(x1-x3,2)+Math.pow(y1-y3,2),1/2);
       c=a=Math.pow(Math.pow(x2-x3,2)+Math.pow(y2-y3,2),1/2);

     double A=a*Math.cos((a*a-b*b-c*c)/(-2*b*c));
     double B=a*Math.cos((b*b-a*a-c*c)/(-2*a*c));
     double C=a*Math.cos((c*c-b*b-a*a)/(-2*a*b));

     System.out.println("angles are"+A *(180/Math.PI)+B*(180/Math.PI)+C*(180/Math.PI));
     input.close();
    }
}
