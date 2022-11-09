package com.program.java;

import java.util.Scanner;


public class MathProgram {
	
public static void basicmathfunctions() { //void normal method
		
		Scanner value1 = new Scanner(System.in);
		System.out.println("enter your first integer value : ");
		int a = value1.nextInt();
		System.out.println("enter your second integer value : ");
		int b = value1.nextInt();
		
		System.out.println("addition of first and second integer value is " + Math.addExact(a, b));
		System.out.println("subraction of first and second integer value is "+ Math.subtractExact(a, b));
		System.out.println("multiplication of first and second integer value is " + Math.multiplyExact(a, b));
		System.out.println("divison of first and second integer value is " + Math.floorDiv(a, b));
		System.out.println( "modulo of first and second integer value is " + Math.floorMod(a, b));
		System.out.println("abs value of first integer value is " + Math.abs(a));
		System.out.println("ceil of first  integer value is " + Math.ceil(a));
		System.out.println("floor value of second integer number is " + Math.floor(b));
		System.out.println("floorDiv value of first integer number is " + Math.floorDiv(a, b) );
		System.out.println("minimum value of first and  second integer number is " + Math.min(a, b));
		System.out.println("maximum value of first and second integer  number  is " + Math.max(a, b));
		
 }

public void exponentialmathfunction() {
	
	Scanner sn = new Scanner(System.in);
	System.out.println("enter your double number :");
	double aa = sn.nextDouble();
	
	System.out.println("round value of your double number is " + Math.round(aa));
	System.out.println("random value of your double number is " + Math.random());
	//System.out.println("pow value of your double number is " + Math.pow(aa, aa));
	System.out.println("exp value of your double number is " + Math.exp(aa));
	System.out.println("log value of your double number is " + Math.log(aa));
	System.out.println("log()10 value of your double number is " + Math.log10(aa));
	System.out.println("exp value of your double number is " + Math.exp(aa));
	System.out.println("square root of your double number is " + Math.sqrt(aa));
	}

public static void trigonometricmath() {
	
	Scanner ss = new Scanner(System.in);
	System.out.println("enter your  double value");
	double aaa = ss.nextDouble();
	
	System.out.println("pi value " + Math.PI);
	System.out.println("sin value is " + Math.sin(aaa));
	System.out.println("cos value is " + Math.cos(aaa));
	System.out.println("tan value is " + Math.tan(aaa));
	System.out.println("asin value is " + Math.asin(aaa));
	System.out.println("acos value is " + Math.acos(aaa));
	System.out.println("atan value is " + Math.atan(aaa));
	//System.out.println("atan2 value is " + Math.atan2(aaa, aaa));
	System.out.println("sinh value is " + Math.sinh(aaa));
	System.out.println("cosh value is " + Math.cosh(aaa));
	System.out.println("tanh value is " + Math.tanh(aaa));
	System.out.println("toDegrees value is " + Math.toDegrees(aaa));
	System.out.println("toRadians value is " + Math.toRadians(aaa));
	
}
   
public static void main(String args[]) { //main method
		
		MathProgram.basicmathfunctions(); // access static void method by using class name
		MathProgram.trigonometricmath();  // access static void method by using class name
		
		MathProgram sn = new MathProgram(); // create object to access void normal method
		sn.exponentialmathfunction();
		
		
	}
	
	

}
