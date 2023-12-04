import java.util.Scanner;
public class Randomshuffling {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){
         arr[i]=input.nextInt();

        }

        for(int i=0;i<n;i++){
            int index=(int)(Math.random()*n);

         //swapp
          int temp=arr[index];
          arr[index]=arr[i];
          arr[i]=temp;

        }
        for(int i=0;i<n;i++){
        System.out.println("the number in the array ar index "+i +" is "+arr[i]);
        }
    }
}

