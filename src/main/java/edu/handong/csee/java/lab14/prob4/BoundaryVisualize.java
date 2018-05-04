package edu.handong.csee.java.lab14.prob4;
import java.util.Scanner;	//possible Scanner function

public class BoundaryVisualize {	//declare public class BoundaryVisualize

	public static void main(String[] args) {	//declare public static void main method
		Scanner keyboard = new Scanner(System.in);	//keyboard possible to type
		int num=0;	//declare int num equal zero
		Boundary array = new Boundary();	//array member has Boundary class function
		boolean result =true;	//boolean value result has true result
		while(result)	//process result 
		{
			try	//contain code where something could possibly go wrong
			{
				System.out.print("Enter on integer: ");	//printout Enter on integer:
				num = keyboard.nextInt();	//put value about num
				array.call(num);	//array call call method(num)
			}
			catch(ArrayIndexOutOfBoundsException e)	//if try block is false, work catch statement and this statement equal ArrayIndexOutOfBoundsException e
			{
				System.out.println("Invalid array index access!");	//printout Invalid array index access!
				result = false;	//result equal false
			}
		}

	}

}
