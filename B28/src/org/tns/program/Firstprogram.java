package org.tns.program;

public class Firstprogram {
	int year_of_purchase;//data members
	String make;
	int model;
	double cost;
	public void display()//member function
	{
		System.out.println("Year of Purchase "+2020);
		System.out.println("Make "+" R15 ");
	}
	void display2()
	{
		System.out.println("Model "+ 2016);
		System.out.println("Make "+180000);
	}
    public static void main (String [] args)
    {
    Firstprogram ob1 = new Firstprogram();
    ob1.display();
    ob1.display2();
    }
}
