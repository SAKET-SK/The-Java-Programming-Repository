class Student {
	int rollno;
	void getNumber(int rn) {
		rollno=rn;
	}
	void putNumber() {
		System.out.println("Roll No:- "+rollno);
	}
}
class Test extends Student {
	float part1,part2;
	void getMarks(float m1,float m2) {
		part1=m1;
		part2=m2;
	}
	void putMarks() {
		System.out.println("Marks obtained: ");
		System.out.println("Marks of subject 1:- "+part1);
		System.out.println("Marks of subject 2:- "+part2);
	}
}
interface Sports {
	final static float sportwt=6.0f;
	void putWt();
}
class Result extends Test implements Sports {
	float total;
	public void putWt() {
		System.out.println("Sports marks:- "+sportwt);
	}
	void display() {
		total=part1+part2+sportwt;
		putNumber();
		putMarks();
		putWt();
		System.out.println("Total score:- "+total);
	}
}
class HybridInterface {
	public static void main(String args[]) {
		Result stud1=new Result();
		stud1.getNumber(15);
		stud1.getMarks(27.5f,33.0f);
		stud1.display();
	}
}
