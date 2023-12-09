import java.util.Scanner;
public class Loan{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
 System.out.print(
 "Enter annual interest rate ");
 double annualInterestRate = input.nextDouble();
 System.out.print("Enter number of years as an integer: ");
 int numberOfYears = input.nextInt();

 System.out.print("Enter loan amount");
 double loanAmount = input.nextDouble();

Loan_Class loan = new Loan_Class(annualInterestRate, numberOfYears, loanAmount);
 System.out.printf("The loan was created on %s\n" +
 "The monthly payment is %.2f\nThe total payment is %.2f\n",
 loan .getLoanDate().toString(),

  loan .getMonthlyPayment(),
  loan .getTotalPayment());

 }
}