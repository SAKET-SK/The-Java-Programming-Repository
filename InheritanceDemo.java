class Book
{
	String author;
	String title;
	String publisher;
	Book(String a,String t,String p)
	{
		author=a;
		title=t;
		publisher=p;
	}
	void put()
	{
		System.out.println("Author Name:- "+author);
		System.out.println("Title of the book:- "+title);
		System.out.println("Published by:- "+publisher);
	}
}
class BookInfo extends Book
{
	float price;
	int stock_position;
	BookInfo(float pr,int sp,String a,String t,String p)
	{
		super(a,t,p);
		price=pr;
		stock_position=sp;
	}
	void output()
	{
		put();
		System.out.println("Price:- "+price);
		System.out.println("Stock position:- "+stock_position);
	}
}
class InheritanceDemo
{
	public static void main(String args[])
	{
		BookInfo b1=new BookInfo(7500.0f,300,"Yashwant Kanetkar","Let Us C","XYZ");
		b1.output();
		System.out.println( );
		BookInfo b2=new BookInfo(6500.0f,550,"Dennis Ritchie","The C programming language","ABC");
		b2.output();
		System.out.println( );
		BookInfo b3=new BookInfo(8000.0f,100,"Herbert Schildt","The complete reference of C","PQR");
		b3.output();
	}
}