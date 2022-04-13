package com.bridgelabz.day1;

public class UseStatic {
	 static int a = 10;
     static int b;
      static void meth(int x) {
    	  System.out.println("x = " + x);
    	  System.out.println("a = " + a);
    	  System.out.println("b = " + b);
      }
      static {
    	  System.out.println("static block initialized");
    	  b= a*4;
      }

}
