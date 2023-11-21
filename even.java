import java.util.Scanner;;
public class even {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int integer=input.nextInt();
        if(integer%5==0){
            System.out.println("the number is divisible by 5 "+" HiFive");
        }
        if(integer%2==0){
            System.out.println("the number is divisible by 2 "+" HiEven");
        }

        
    }
}
