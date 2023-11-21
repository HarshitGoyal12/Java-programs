import java.util.Scanner;

public class logical_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int number=input.nextInt();
        if(number%2==0 &&number%3==0){
            System.out.println("no is divible by both");
        }
        if(number%2==0 ||number%3==0){
             System.out.println("no is divible by one of the number");
        }

        if((number%2==0 ||number%3==0) && number%6==0){
        System.out.println("no is divible by 6");
        }
        input.close();
    }
}
