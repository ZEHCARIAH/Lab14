package edu.handong.csee.java.lab14.prob3;

public class PowerCalculator {	//declare public class PowerCalculator

	public long power(int n, int p) throws Exception	//declare public long power with int n and p, and throw Exception
	{
		long result =0;	//long value result equal zero

		result= (long)Math.pow(n, p);	//result equal (long value) n's p pow
		if(n<0||p<0)	//if n or p less than 0
		{
			throw new Exception("n or p should not be negative");	//printout n or p should not be negative
		}
		if(n==0&&p==0)	//if n and p equal 0
		{
			throw new Exception("n and p should not be zero");	//printout n and p should not be zero
		}
		return result;	//return result
	}
}



