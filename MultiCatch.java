class MultiCatch {
	public static void main(String args[]) {
		int a[]={5,10};
		int b=5;
		try {
			int x=a[2]/b-a[1];
			System.out.println("x= "+x);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArrayStoreException e) {
			System.out.println(e);
		}
		int y=a[1]/a[0];
		System.out.println("y= "+y);
	}
}