package edu.handong.csee.java.lab14.prob1;
import java.util.Scanner;	//possible Scanner function
import java.util.Random;	//possible Random function

public class Visualize {	//declare public class Visualize

	public static void main(String[] args) {	//declare public static void main method
		Scanner keyboard= new Scanner(System.in);	//keyboard possible to type 
		Random random = new Random();	//random possible to set random number
		int limit= 0;	//declare int limit is 0
		int speed=0;	//declare int speed is 0

		System.out.println("Set the speed limit, officer:");	//printout Set the speed limit , officer:
		limit = keyboard.nextInt();	//put value about limit
		speed= random.nextInt(101);	//set random numbers is 101

		SpeedLimit lim = new SpeedLimit (limit,speed);	//lim member has limit and speed value in SpeedLimit class

		lim.warnSpeedLimit();	//lim call WarnSpeedLimit

		keyboard.close();	//close keyboard 

	}

}
