package absclassdemo;
// Demonstracting Abstract Class 
import java.lang.*;
import java.util.*;
 abstract class MyAbstractBase 
{
	public abstract void f1(); 
	public void f2()
	{
		System.out.println("I'm in defined method of Abstract Base  f2");
	}
	public void f3()
	{
		System.out.println("I'm in defined method of Abstract Base  f3");
	}
}
class MyDerive extends MyAbstractBase
{
	// over-riding f1
	public void f1()
	{
		System.out.println("I'm in over-rided f1");
	}
	public void f4()
	{
		System.out.println("I'm in Derive class F4");
	}

}
class  AbsClassDemo
{
	public static void main(String[] args) 
	{
		MyDerive md=new MyDerive();
		md.f1();
		md.f2();
		md.f3();
		md.f4();

	}
}
