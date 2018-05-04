package edu.handong.csee.java.lab14.prob4;

public class Boundary {	//declare public class Boundary

	private static int [] boundary = new int[5];	//declare private static int boundary has six range
	private static int count =0;	//priavte static int count equal zero
	public void call (int num) throws ArrayIndexOutOfBoundsException	//declare public void call method with int num and throw ArrayIndexOutOfBoundsException 
	{
		int i =count;	//int i equal count
		boundary[i] = num;	//boundary has i range and equal num
		count++;	//count increase each 1
		System.out.printf("arr[%d] < -%d\n ",i,num);	//printout arr[i]<- num
	}
}