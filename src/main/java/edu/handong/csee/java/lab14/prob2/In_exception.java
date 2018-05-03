package edu.handong.csee.java.lab14.prob2;
import java.util.*;	//import all class in util directory

public class In_exception {	//declare public class In_exception

	private int x =0;	//declare private int x equal 0
	private int y=0;	//declare private int y equal 0

	public void In_exception(){	//declare public void In_exception method
	}
	public void error_detector()	//declare public void error_detector
	{
		try {	//contain code where something could possibly go wrong
			Scanner keyboard = new Scanner(System.in);	//keyboard possible to type 
			System.out.print("x: ");	//printout x:
			x=keyboard.nextInt();	//put value about x
			System.out.print("y: ");	//printout y:
			y=keyboard.nextInt();	//put value about y
			System.out.println(this.x/this.y);	//printout x/y(initialize)
		}
		catch(InputMismatchException e) {	//if try block is false, work catch statement and this statement equal InputMismatchException e
			System.out.println("java.util.InputMismatchException"+e.getMessage());	// printout java.util.InputMismatchException + Exception statement
		}
		catch(ArithmeticException e)	//if try block is false, work catch statement and this statement equal ArithmeticException e
		{
			System.out.println("java.lan.ArithmeticException");	//printout java.lan.ArithmeticException
		}	
		catch(Exception e)	//if try block is false, work catch statement and this statement equal Exception e
		{
			System.out.println("Some other exception has occurred:"+e.getMessage()); //printout Some other exception has occurred + Exception statement 
		}
	}
}
