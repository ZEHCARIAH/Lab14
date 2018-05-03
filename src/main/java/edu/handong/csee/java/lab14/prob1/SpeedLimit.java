package edu.handong.csee.java.lab14.prob1;

public class SpeedLimit {	//declare public class SpeedLimit
	private int speed=0;	//declare private int speed equal 0
	private int limit=0;	//declare private int limit equal 0

	public SpeedLimit(int speed, int limit)	//declare public SpeedLimit method with int speed and int limit
	{
		this.limit =limit;	//initialize limit
		this.speed=speed;	//initialize speed
	}
	public void warnSpeedLimit()	//declare public void warnSpeedLimit
	{
		try {	//contain code where something could possibly go wrong
			if(this.speed>this.limit)	//if speed lager than limit
			{
				throw new Exception("Speed limit" + this.limit+ "km exceeded");	//if previous if sentence is true, printout Speed limit+this.limit+km exceeded 
			}
			System.out.println("You are a law abiding citizen!");	//printout You are a law abiding citizen!
		} catch(Exception e)	//if try block is false, work catch statement and this statement equal Exception e
		{
			System.out.println(e.getMessage());	//printout Exception statement
			System.out.println("You are being fiend");	//printout You are being friend
		}
		System.out.println("Your current speed: " + this.speed);	//printout Your current speed + this speed
	}
}

