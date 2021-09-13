interface Area {
	final static float PI=3.14f;
	void compute(float r);
}
class Circle implements Area {
	public void compute(float r) {
		System.out.println("Circle area for radius "+r+" is "+PI*r*r);
	}
}
class InterfaceDemo2 {
	public static void main(String args[]) {
		Circle cr=new Circle();
		cr.compute(5.2f);
	}
}