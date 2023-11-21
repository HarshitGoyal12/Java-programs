import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        int number1=(int)(System.currentTimeMillis()%10);
        int number2=(int)(System.currentTimeMillis()*7%10);
        Scanner input = new Scanner(System.in);

    System.out.println("what is the "+number1+" "+number2+"?");
    int ans=input.nextInt();

    System.out.println(number1+" "+number2+"="+ans+"is" + (number1+number2==ans));
    input.close();
    
    }
}