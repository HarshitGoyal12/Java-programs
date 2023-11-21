import java.util.Scanner;
import java.lang.*;
public class subt_prac {
    public static void main(String[] args) {
        int number1=(int)(System.currentTimeMillis()%10);
        int number2=(int)(System.currentTimeMillis()*7%10);
        Scanner input = new Scanner(System.in);

    System.out.println("what is the "+number1+"- "+number2+"?");
    int ans=input.nextInt();

    // System.out.println(number1+" "+number2+"="+ans+" is " + Math.abs(number1-number2)==ans);
    input.close();

    }
}