import java.util.Scanner;
import java.lang.*;
public class frequency {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // String str=input.nextLine();
        // str=str.toLowerCase();

        // System.out.println("the lower case letter is " +str);
        String temp="a+b$#c".replaceAll("[$+#]","ayush");
        System.out.println(temp);
    }
}

