package com.bridgelabz.day5;
import java.util.Scanner;
import utility.UtilityFunction;
/*
 * check number is odd or even
 */

public class EvenOddNumber {
public static void main(String[] args) {
	System.out.print("Enter any number : ");
	Scanner sc =new Scanner(System.in);
    int Number= sc.nextInt();	
    
    String CheckEvenOdd =UtilityFunction.Checkevenodd(Number);
    System.out.println(CheckEvenOdd);
	    }
}
