import java.util.Scanner;
import java.lang.*;

public class TestConvesion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // int n1=input.nextInt();
        String str= input.nextLine();   

        // System.out.println("the dec t0 hex is "+DecToHex.toHex(n1));
        System.out.println("the hex to dec is "+HexToDec.getDecimal(str));
    }
}
