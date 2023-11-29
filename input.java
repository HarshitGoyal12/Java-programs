import java.util.Scanner;
import java.lang.*;

public class input {
    public static void main(String[] args) {
        System.out.println("Enter two number");
        int n1=input.nextInt();
        int sum=0;
        int flag=1;

        while(flag==0 && n1==0){
            sum+=n1;
            n1=input.nextInt();
            if(n1==0){
                flag=0;
            }
        }
        System.out.println("Enter two number"+sum);

    }
}
