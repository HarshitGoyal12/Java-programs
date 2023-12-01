
import java.io.*;
public class HexToDec{    
public static int getDecimal(String hex){  
    // String digits = "0123456789ABCDEF";  
    //          hex = hex.toUpperCase();  
    //          int val = 0;  
    //          for (int i = 0; i < hex.length(); i++)  
    //          {  
    //              char c = hex.charAt(i);  
    //              int d = digits.indexOf(c);  
    //              val = 16*val + d;  
    //          }  
    //          return val;  
   int val=0;
   int base=1;
   for(int i=hex.length()-1;i>=0;i--){
    if(hex.charAt(i)>='0' && hex.charAt(i)<='9'){
        val+=(hex.charAt(i)-48)*base;
    }
    
    else{
     val+=(hex.charAt(i)-55)*base;
    }
   base=base*16;

   }
    return val;
}  
public static void main(String args[]){    
// System.out.println("Decimal of a is: "+getDecimal("a"));  
// System.out.println("Decimal of f is: "+getDecimal("f"));  
// System.out.println("Decimal of 121 is: "+getDecimal("121"));  

System.out.println("the decimal value will be: "+getDecimal("1A"));
}}    