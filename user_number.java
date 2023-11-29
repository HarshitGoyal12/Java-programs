import java.util.Scanner;
import java.lang.*;

public class user_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1=(int)(System.currentTimeMillis()%10);
        System.out.println("Enter a number to match the following number "+number1);
        int number2=input.nextInt();
      System.out.println("Enter a number to match the following number"); 
        while(number1!=number2){
            System.out.println("number not matched please end again");
            if(number1>number2){
                 System.out.println("number should be greater than "+number2);
                 
            }
            else{
                  System.out.println("number should be less than "+number2);
                 
            }
            number2=input.nextInt();
        }
         System.out.println("number matched "+number2);
    }
}
