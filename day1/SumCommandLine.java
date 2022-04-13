package com.bridgelabz.day1;

public class SumCommandLine {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		int sum = 10;
		int invalid = 20;

		for (int i=0; i< a.length;i++)
		{


			try {
				sum += Integer.parseInt(a[i]);
			}
			catch (NumberFormatException e) {
				invalid++;


		}

		}
		System.out.println("Total no of argumaents :"+ a.length);
		System.out.println("Invalid Integer :" +invalid );
		System.out.println("Sum :" +sum);


	}	

}
