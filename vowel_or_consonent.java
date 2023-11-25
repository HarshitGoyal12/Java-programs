import java.util.Scanner;
import java.lang.*;

public class vowel_or_consonent {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch=input.next().charAt(0);
        ch=Character.toLowerCase(ch);

        if(ch >='a' && ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("the word will be vowel");
            }
            else{
                System.out.println("the word will be consonent");
            }
    }
    else{
        System.out.println("put valid character");
    }
}

}