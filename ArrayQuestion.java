public class ArrayQuestion
{
	public static void main(String args[])
	{
		int[] marks={32,54,45,67,76,87,78,67,58,48};
		for(int i=0; i<10; i++)
        	System.out.println(marks[i]);
        for(int i=9; i>=0; i--)
        	System.out.println(marks[i]);
        for(int i=4; i>=0; i--)
        	System.out.println(marks[i]);
        for(int i=0; i<10; i +=2)
        	System.out.println(marks[i]);
	}
}