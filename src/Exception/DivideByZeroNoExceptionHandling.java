package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
    public static int quotient(int numerator, int denominator)throws ArithmeticException{
        return numerator/denominator;
    }
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       boolean continueloop=true;
       do {
           try {
               System.out.println("Please enter an integer numerator:");
               int numerator = input.nextInt();
               System.out.println("Please enter an integer denominator:");
               int denominator = input.nextInt();
               int result = quotient(numerator, denominator);
               System.out.println("Result is:" + result);
               continueloop = false;
           } catch (InputMismatchException ex) {
               System.err.println("Exception is:" + ex);
               input.nextLine();
               System.out.println("You must enter integer.Please try again.");
           } catch (ArithmeticException arEx) {
               System.err.println("Exceptions is:" + arEx);
               System.out.println("Zero is an invalid denominator.Please try again.");
           }
       }while(continueloop);
    }
}

