package org.tns.program;

public class Appu
{
	void display1()
	{
		System.out.println("I am the Grandfather");
		
	}
}
class Jack extends Appu
{
	void display2()
	{
		System.out.println("I am the Father");
	}
}
class Bruce extends Jack
{
	void display3()
	{
		System.out.println("I am the Grandson");
	}
}