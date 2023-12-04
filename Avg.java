import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int n=input.nextInt();
     int []arr=new int[n];
  int avg=0;
     for(int i=0;i<n;i++){
      arr[i]=input.nextInt(); 
     avg+=arr[i];
    }

    avg/=n;
    for(int i=0;i<n;i++){
     if(avg<arr[i]){
     System.out.println("the number is "+ arr[i]);
    }
    else{
        continue;
    }
    }
    }
}
