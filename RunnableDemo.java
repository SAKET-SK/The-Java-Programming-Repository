//Multithreading by implementing runnable interface
class A implements Runnable {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("i = "+i);
		}
		System.out.println("Exit from A");
	}
}
class B implements Runnable {
	public void run() {
		for(int j=1;j<=5;j++) {
			System.out.println("j = "+j);
		}
		System.out.println("Exit from B");
	}
}
class C implements Runnable {
	public void run() {
		for(int k=1;k<=5;k++) {
			System.out.println("k = "+k);
		}
		System.out.println("Exit from C");
	}
}
class RunnableDemo {
	public static void main(String args[]) {
		A aobj = new A();
		Thread t1=new Thread(aobj);
		t1.start();
		B bobj = new B();
		Thread t2=new Thread(bobj);
		t2.start();
		C cobj = new C();
		Thread t3=new Thread(cobj);
		t3.start();
	}
}