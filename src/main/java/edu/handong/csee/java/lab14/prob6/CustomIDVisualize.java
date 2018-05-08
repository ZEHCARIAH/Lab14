package edu.handong.csee.java.lab14.prob6;
import java.util.Scanner;	//possible Scanner function

public class CustomIDVisualize {	//declare public class CustomIDVisualize class

	public static void main(String[] args) {	//public static void main method 

		String name,race;	//declare String name and race
		int age=0;	//declare integer age is zero
		Scanner keyboard = new Scanner(System.in);	//keyboard possible to type	
		CustomID object = new CustomID();	//object has function as CustomID class  
		boolean repeat = true;	//if boolean repeat is true


		while(repeat)	//if become repeat condition
		{
			try {	//contain code where something could possibly go wrong
				if(object.get_state()==0)	//if object's get_state method is zero 
				{
					System.out.println("Enter your name: ");	//printout Enter your name: 
					name=keyboard.nextLine();	//put String name can type next line 
					object.Set_name(name);	//printout Set_name method condition
				}
				else if (object.get_state()==1)	//else if object's get_state method is one 
				{
					System.out.println("Enter your age: ");	//printout Enter your age: 
					age = keyboard.nextInt();	//put String name can type next line 
					object.set_age(age);	//printout Set_age method condition
				}
				else if (object.get_state()==2)	//else if object's get_state method is two 
				{
					System.out.println("Enter your race: ");	//printout Enter your race: 
					race =keyboard.nextLine();	//put String name can type next line 
					object.set_race(race);		//printout set_race method condition
				}

			}

			catch(Exception e)	//if try block is false, work catch statement and this statement equal Exception e
			{
				System.out.println(e.getMessage());	//printout Exception condition message
				continue;	//pass out next repeat
			}

		}
	}
}
