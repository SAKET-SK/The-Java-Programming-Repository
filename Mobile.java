class Mobile
{
	String Cname;
	int size;
	Mobile(String c,int s)
	{
		Cname=c;
		size=s;
		System.out.print(Cname+" ");
		System.out.println(size);
	}
public static void main(String args[])
{
	Mobile [] m=new Mobile[5];
	m[0]=new Mobile("Lenovo",5);
	m[1]=new Mobile("Motorola",7);
	m[2]=new Mobile("MI",4);
	m[3]=new Mobile("LYF",5);
	m[4]=new Mobile("Samsung",6);
}
}
