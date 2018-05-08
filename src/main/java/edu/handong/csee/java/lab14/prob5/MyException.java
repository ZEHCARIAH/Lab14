package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception{	//declare public class Myexception and extend Exception class
	private String message = null;	//declare public private String message value is null

	public MyException()	//declare public MyException method
	{
		super();	//invoke of constructor of base class

	}

	public MyException(String message)	//declare public MyException method with String message
	{
		super(message);	//call message to MyException method
		this.message = message;	//initialize String message

	}

	public MyException(Throwable cause)	//declare public MyException method with Throwable cause
										//The Throwable class is the superclass of all errors and exceptions in the Java language
	{
		super(cause);	//call cause to MyException method

	}

	public String toString()	//declare public String toString
	{
		return message;	//return message value
	}
}