//Program to demonstrate life cycle method of thread
class A extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			if(i==1)   yield();                //If value of i becomes 1, then yield method is invoked
			System.out.println("i= "+i);
		}
		System.out.println("Exit from A");
	}
}
class B extends Thread {
	public void run() {
		for(int j=1;j<=5;j++) {
			System.out.println("j= "+j);
			if(j==3)   stop();                  //As soon as value of j becomes 3, this thread will be terminated
		}
		System.out.println("Exit from B");
	}
}
class C extends Thread {
	public void run() {
		for(int k=1;k<=5;k++) {
			if(k==1)                             //When k becomes 1, this thread will sleep for 1000ms
			try{Thread.sleep(1000);}   //sleep method can generate an exception
			catch(Exception e) { }
			System.out.println("k= "+k);
		}
		System.out.println("Exit from C");
	}
}
class ThreadDemo2 {
	public static void main(String args[]) {
		new A().start();
		new B().start();
		new C().start();
	}
}
		