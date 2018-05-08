package edu.handong.csee.java.lab14.prob6;

public class CustomID extends Exception{	//declare public class CustiomID and extends Exception class

	private String[] races = new String[] {"Vulcans", "Romulan", "Klingons"};	//declare private String races and races has Vulcans, Romulan, Klingons Strings
	private String name = " ";	//declare private String name " "
	private int age = 0;	//declare private integer value is zero
	private String race = " ";	//declare private String race " "
	private int state =0;	//declare public private integer state is zero

	public void Set_name(String str) throws Exception	//declare public void Set_name method with named String str and reserve for Exception class
	{
		if(str.length()<5)	//if String str's length smaller than 5
		{
			state = 0;	//state is zero
			throw new Exception("Your name is short! Try again! ");	//if str's length smaller 5, printout Your name is short! Try again!
		}
		else {
			this.name = str;	//initialize name as str
			System.out.println("Name is valid");	//printout Name is valid
			System.out.println("Name: "+name);	//printout Name: name
			state++;	//state increase each 1

		}
	}
	public void set_age(int num) throws Exception	//declare public void set_age method with named integer num and reserve for Exception class
	{
		if(num<18)	//if num smaller than 18
		{
			state =1;	//state is 1
			throw new Exception("Your are too young! Try again!");	//if num smaller 18, printout Your are too young! Try again!
		}
		else {
			this.age=num;	//initialize age as num
			System.out.println("Age is valid");	//printout Age is valid
			System.out.println("Age: "+age);	//printout Age: 
			state++;	//state increase each 1
		}

	}

	public void set_race(String race) throws Exception	//declare public void set_reace method with named String race and reserve for Exception class
	{
		for(int i=0; i<races.length; i++)	//integer i is zero and if i small races's length and i increase each 1 
		{
			if(races[i].equals(race))	//if races length i equal String race
			{
				this.race = races[i];	//race initialize races[i]
				System.out.println("Races is valid");	//printout Races is valid
				System.out.println("Race: "+races[i]);	//printout Race: races[i]
				state = 0;	//state is zero
				return;	//return this method
			}
		}
		state=2;	//state is two
		throw new Exception("Human! Try again.");	//if races do not satisfy races condition

	}


	public int get_state()	//declare public integer get_state method
	{
		return state;	//return state condition

	}
}