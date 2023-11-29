import java.util.Scanner;
import java.lang.*;

public class gcd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two number");
        int n1=input.nextInt();
        int n2=input.nextInt();
       int temp;
        //find gcd of two number

        if(n1<n2){
        temp=n1;
         n1=n2;
         n2=temp;

        }
        temp=n1%n2;

        while(temp!=0){
            n1=n2;
            n2=temp;
            temp=n1%n2;
        }

    System.out.println("GCD "+n2);
    }
}
