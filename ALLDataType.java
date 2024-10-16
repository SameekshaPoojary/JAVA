public class AllDataType
{
	public static void main(String args[])
	{
	
	getByteValue();
	getintValue();
	getshortValue();
	getlongValue();
	getfloatValue();
	getdoubleValue();
	getcharValue();
	getbooleanValue();

	}

public static byte getByteValue()
{
	System.out.println("Declaring byte value:");
	byte value=20;
	System.out.println("The byte value is:"+value);
	return value;
}
public static int getintValue()
{
	System.out.println("Declaring int value:");
	int value=10;
	System.out.println("The int value is:"+value);
	return value;
}
public static short getshortValue()
{
	System.out.println("Declaring short value:");
	short value=2;
	System.out.println("The short value is:"+value);
	return value;
}
public static long getlongValue()
{
	System.out.println("Declaring long value:");
	long value=2000;
	System.out.println("The long value is:"+value);
	return value;
}
public static float getfloatValue()
{
	System.out.println("Declaring float value:");
	float value=20.5f;
	System.out.println("The float value is:"+value);
	return value;
}
public static double getdoubleValue()
{
	System.out.println("Declaring double value:");
	double value=20.60;
	System.out.println("The double value is:"+value);
	return value;
}
public static char getcharValue()
{
	System.out.println("Declaring char value:");
	char value='a';
	System.out.println("The char value is:"+value);
	return value;
}
public static boolean getbooleanValue(){
        System.out.println("declareing a boolean value ");
        int  value=1;
        
        if(value == 1)
        {
        return true;
        }
        else{
           return false;
        }
}

}

