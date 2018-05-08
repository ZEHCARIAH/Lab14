package edu.handong.csee.java.lab14.prob5;
import java.util.Scanner;	//possible Scanner function

public class VisualizeCustomize {	//declare public class VisualizeCustomize

	public static void main(String[] a) {	//declare public static void main 
		try	//contain code where something could possibly go wrong
		{
			Scanner keyboard = new Scanner(System.in);	//keyboard possible to type	
			String str = keyboard.nextLine();	//put String str can type next line 
			VisualizeCustomize.Test(str);	//VisualizeCustomize call Test method str member 
		}
		catch(MyException mae)	//if try block is false, work catch statement and this statement equal Exception mae
		{
			System.out.println("Inside catch block: " + mae);	//printout Inside catch block + mae member

		}


	}

	static void Test(String str) throws MyException	//declare static void Test with String str
	{
		if(str.equals("null"))	//if str member equal null value
		{
			throw new MyException("String val is null");	//MyException printout String val is null
		}
		else	//else
			System.out.println("String va is:" +str);	//printout String val is + str member
	}

}
