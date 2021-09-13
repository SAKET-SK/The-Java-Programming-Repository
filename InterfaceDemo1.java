//Multiple inheritance in java using interfaces
interface Student {
	final static int rollno=12;
	final static String name="ABC";
	void display();
}
interface Exam {
	final static int m1=76;
	final static int m2=84;
	void show();
}
class Result implements Student,Exam {
	int total;
	public void display() {
		System.out.println("Roll No:- "+rollno);
		System.out.println("Name:- "+name);
	}
	public void show() {
		System.out.println("Marks of subject 1:- "+m1);
		System.out.println("Marks of subject 2:- "+m2);
	}
	void output() {
		total=m1+m2;
		System.out.println("Total marks:- "+total);
	}
}
class InterfaceDemo1 {
	public static void main(String [] args) {
		Result r=new Result();
		r.display();
		r.show();
		r.output();
	}
}