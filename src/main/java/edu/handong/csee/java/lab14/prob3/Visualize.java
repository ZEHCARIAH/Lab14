package edu.handong.csee.java.lab14.prob3;
import java.util.Scanner;	//possible Scanner function

public class Visualize {	//declare public class Visualize
	public static final PowerCalculator my_calculator = new PowerCalculator();	//public static final powerCalculator class's my_calcualtor member has function about PowerCalculator
	public static final Scanner In = new Scanner(System.in);	//public static final Scanner In can possible to type

	public static void main(String[] args) {	//declare public static void main method

		while(In.hasNextInt()) {	//while In can call nextint
			int n = In.nextInt();	//integer n can put value about n
			int p = In.nextInt();	//integer p can put value about p

			try {	//contain code where something could possibly go wrong
				System.out.println(my_calculator.power(n,p));	//printout condition about n and p
			}
			catch (Exception e)	//if try block is false, work catch statement and this statement equal Exception e
			{
				System.out.println(e);	//printout e(Exception)
			}
		}
	}
}


