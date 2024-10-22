// declare one method without parameter and declare one method with parameter

public class Book

{
	int number;
	String name;
	public static void main(String args[])
	{
		
		greeting();
		Book b1=new Book(1,"book1");
		b1.Pages();		
	}
	public static void greeting()
	{
		System.out.println("Welcome");
	}

	public static void Pages(int number,String name)
	{

		this.number = number;
         this.name = name;
		
		System.out.println("Number:"+number);
		System.out.println("Name:"+name);
	}

}

