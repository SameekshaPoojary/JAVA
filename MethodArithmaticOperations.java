
public class MethodArithmaticOperations
{
	public static void main(String args[])
	{	
		greeting();
		Addition();
		Subtraction();
		Multiplication();
		Division();
	}
	public static void greeting()
	{
		System.out.println("WELCOME");
	}

	public static void Addition()
	{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println("Sum is:"+sum);
	}

	public static void Subtraction()
	{
	int a=10;
	int b=20;
	int sub=a-b;
	System.out.println("Sum is:"+sub);
	}

	public static void Multiplication()
	{
	int a=10;
	int b=20;
	int mul=a*b;
	System.out.println("Sum is:"+mul);
	}

	public static void Division()
	{
	int a=100;
	int b=20;
	int div=a/b;
	System.out.println("Sum is:"+div);
	}


}