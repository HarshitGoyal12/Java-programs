import java.util.Scanner;
import java.lang.*;

public class string {
    public static void main(String[] args) {
        String [] tokens="JAVA#HTML#PERL".split("#",-2);

        for(int i=0;i<tokens.length;i++) {
               System.out.println(tokens[i]+"");
        }

         System.out.println("Harshit Goyal good boy hai".matches("Harshit.*"));
         System.out.println("Harshit".equals("Goyal"));
         String temp="a+b$#c".replaceAll("[$+#]","ayush");
         System.out.println(temp);
      String [] token="JAVA,C?C#,C++".split("[.,:;?]");

  for(int i=0;i<token.length;i++) {
               System.out.println(token[i]+"");
        }

         System.out.println("JAVA".indexOf('H'));
         System.out.println("JAVA".indexOf('A',2));
         System.out.println("JAVA".indexOf("java"));

      char[] chars="Java".toCharArray();
      String str=new String(new char[]{'J','a','v','a'});

 for(int i=0;i<chars.length;i++) {
               System.out.print(chars[i]);

        }
        System.out.println();
      System.out.println(str);
    
    }
}
