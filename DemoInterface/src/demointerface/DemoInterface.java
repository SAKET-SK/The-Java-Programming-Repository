package demointerface;
// Demonstrating Interface 
import java.lang.*;
import java.util.*;
interface Myinter
{
	public abstract void f1();
	public abstract void f2();
	public abstract void f3();
	public abstract void f4();
}
class TestInterface implements Myinter
{
	// over-riding all the interface provided abstract methods
	public void f1()
	{
		System.out.println("I'm in over-rided f1");
	}
	public void f2()
	{
		System.out.println("I'm in over-rided f2");
	}
	public void f3()
	{
		System.out.println("I'm in over-rided f3");
	}
	public void f4()
	{
		System.out.println("I'm in over-rided f4");
	}
}
class  DemoInterface
{
	public static void main(String[] args) 
	{
		TestInterface ti=new TestInterface();
		ti.f1();
		ti.f2();
		ti.f3();
		ti.f4();
	}
}

