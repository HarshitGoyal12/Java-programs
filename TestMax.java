import java.util.Scanner;
import java.lang.*;

public class TestMax {
    public static int maximum{
      Scanner input=new Scanner(System.in);
        int n=5;
        int ans=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the"+i+"number");
            int n1=input.nextInt();
            if(n1>ans){
                ans=n1;
            }
        }
        System.out.println("the value is"+ans);
        return ans;
    }
    public static void main(String[] args) {
       
    }
}
