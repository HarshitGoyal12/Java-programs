import java.util.Scanner;;
public class tax_cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
         int income=input.nextInt();
         double tax=0;
        //  if(number1>0 && number1<8350 ||number1>0 && number1<16700 ||number1>0 && number1<8350 ||number1>0 && number1<11950 )
        //  {
     
        //  }
      int status=input.nextInt();

        
      switch(status){
        case 0:
       if(income<8380){
        System.out.println("tax"+0.1*income);
       }
       else if(income>8380 && income<33950){
          tax=835+0.15*(income-8350);
        System.out.println("tax"+tax);
       }
       else if(income>33950 && income <82250){
        tax=835+0.25*(income-33950) +0.15*(33950-8350) ;
        System.out.println("tax"+tax);
       }
       else if(income >82250 && income<171550){
         
        tax=835+0.33*(income-82250) +0.15*(33950-8350)+0.25*(82250-33950);
        System.out.println("tax"+tax);
       }
       else if( income>171550 && income<372950){
        tax=835+0.33*(income-171550) +0.15*(33950-8350)+0.25*(82250-33950)+0.33*(171550-82250);
        System.out.println("tax"+tax);
       }
       else{
          tax=835+0.33*(income-372950) +0.15*(33950-8350)+0.25*(82250-33950)+0.33*(372950-171550);
        System.out.println("tax"+tax);
       }
       break;
      case 1:
       if(income<8380){
        System.out.println("tax"+0.1*income);
       }
       else if(income>8380 && income<33950){
          tax=835+0.15*(income-8350);
        System.out.println("tax"+tax);
       }
       else if(income>33950 && income <82250){
        tax=835+0.25*(income-33950) +0.15*(33950-8350) ;
        System.out.println("tax"+tax);
       }
       else if(income >82250 && income<171550){
         
        tax=835+0.33*(income-82250) +0.15*(33950-8350)+0.25*(82250-33950);
        System.out.println("tax"+tax);
       }
       else if( income>171550 && income<372950){
        tax=835+0.33*(income-171550) +0.15*(33950-8350)+0.25*(82250-33950)+0.33*(171550-82250);
        System.out.println("tax"+tax);
       }
       else{
          tax=835+0.33*(income-372950) +0.15*(33950-8350)+0.25*(82250-33950)+0.33*(372950-171550);
        System.out.println("tax"+tax);
       }
       break;
      case 2:
       if(income<8380){
        System.out.println("tax"+0.1*income);
       }
       else if(income>8380 && income<33950){
          tax=835+0.15*(income-8350);
        System.out.println("tax"+tax);
       }
       else if(income>33950 && income <82250){
        tax=835+0.25*(income-33950) +0.15*(33950-8350) ;
        System.out.println("tax"+tax);
       }
       else if(income >82250 && income<171550){
         
        tax=835+0.33*(income-82250) +0.15*(33950-8350)+0.25*(82250-33950);
        System.out.println("tax"+tax);
       }
       else if( income>171550 && income<372950){
        tax=835+0.33*(income-171550) +0.15*(33950-8350)+0.25*(82250-33950)+0.33*(171550-82250);
        System.out.println("tax"+tax);
       }
       else{
          tax=835+0.33*(income-372950) +0.15*(33950-8350)+0.25*(82250-33950)+0.33*(372950-171550);
        System.out.println("tax"+tax);
       }
       break;
       case 3:
       if(income<8380){
        System.out.println("tax"+0.1*income);
       }
       else if(income>8380 && income<33950){
          tax=835+0.15*(income-8350);
        System.out.println("tax"+tax);
       }
       else if(income>33950 && income <82250){
        tax=835+0.25*(income-33950) +0.15*(33950-8350) ;
        System.out.println("tax"+tax);
       }
       else if(income >82250 && income<171550){
         
        tax=835+0.33*(income-82250) +0.15*(33950-8350)+0.25*(82250-33950);
        System.out.println("tax"+tax);
       }
       else if( income>171550 && income<372950){
        tax=835+0.33*(income-171550) +0.15*(33950-8350)+0.25*(82250-33950)+0.33*(171550-82250);
        System.out.println("tax"+tax);
       }
       else{
          tax=835+0.33*(income-372950) +0.15*(33950-8350)+0.25*(82250-33950)+0.33*(372950-171550);
        System.out.println("tax"+tax);
       }
       break;
       default:
        System.out.println("Invalid information");


   input.close();

      }
         
    }
}
