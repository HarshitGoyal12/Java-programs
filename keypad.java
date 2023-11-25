import java.util.Scanner;
import java.lang.*;

public class keypad {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch=input.next().charAt(0);
        ch=Character.toLowerCase(ch);

        if(ch >='a' && ch<='z'){
        if(ch=='a'||ch=='b'||ch=='c'){
            System.out.println("the word will be"+2);
        }
        else if(ch=='d'||ch=='e'||ch=='f'){
         System.out.println("the word will be"+3);
        }
      else if(ch=='g'||ch=='h'||ch=='i'){
         System.out.println("the word will be"+4);
        }
        else if(ch=='j'||ch=='k'||ch=='l'){
         System.out.println("the word will be"+5);
        }
        else if(ch=='m'||ch=='n'||ch=='o'){ 
         System.out.println("the word will be"+6);
        }
        else if(ch=='p'||ch=='q'||ch=='r'){
         System.out.println("the word will be"+7);
        }
        else if(ch=='s'||ch=='t'||ch=='u'){
         System.out.println("the word will be"+8);
        }
        else if(ch=='v'||ch=='x'||ch=='y'){
         System.out.println("the word will be"+9);
        }

    }
    else{
        System.out.println("put valid character");
    }
    }
}
