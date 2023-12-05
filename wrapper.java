import java.io.*;
import java.util.*;
 
public class wrapper {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();
       Scanner k=new Scanner(System.in);
       System.out.println("Enter non zero intergers value");
       int number=k.nextInt();
       while(number!=0){
        list.add(number);
        number=k.nextInt();
       }
        System.out.println("Your numbers in reverse are: ");
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        
       }
    }
}
