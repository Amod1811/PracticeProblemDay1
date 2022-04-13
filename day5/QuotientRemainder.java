package com.bridgelabz.day5;
import java.util.Scanner;
/*
 * calculate the quotient and remainder
 */
import utility.UtilityFunction;

public class QuotientRemainder {
	public static void main(String[] args) {
		System.out.println("Enter dividend number: ");
       
        Scanner sc =new Scanner(System.in);
       int dividend=  sc.nextInt();
       System.out.println("Enter divisior number: ");
       Scanner scanner =new Scanner(System.in);
      int divisor= scanner.nextInt();
		 

	    int quotient =UtilityFunction.Quotient(dividend, divisor);
	    int remainder =UtilityFunction.Remainder(dividend, divisor);

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);

	}
}

		
