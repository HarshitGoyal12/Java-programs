import java.util.Scanner;
public class shifting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int []arr=new int[n];
         arr[0]=1;
        for(int i=1;i<n;i++){
            int temp=input.nextInt();
            arr[i]=temp;
            arr[i-1]=arr[i];
        }

        arr[n-1]=arr[0];
       for(int i=0;i<n;i++){
           System.out.println("the shifted numbers is "+arr[i]);
        }
    }
}
