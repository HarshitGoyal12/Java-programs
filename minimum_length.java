import java.util.Scanner;

public class minimum_length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER THE ACCERLATION");
       double a= input.nextDouble();
        System.out.print("ENTER THE VELOCITY");
        double v=input.nextDouble();

        double length=(v*v)/(2*a);
        System.out.println("cuurent length is"+length);
   input.close();
    }
}
