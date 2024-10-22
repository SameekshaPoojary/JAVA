public class StringCreator
{
	public static void main(String[] args) 
	{


		String mobile = "Vivo";

		String phone = "MI";

		String cellPhone = "Vivo";

		String device = new String("MI");

		String watch = "Fastrack";

		String smartWatch = "Boat";

		String clock = "Fastrack";

		

		char[] charArray = watch.toCharArray();
		String value = "";

		for(int i = charArray.length-1 ; i >= 0 ; i--)
		{

			value = value + charArray[i];
		}

		System.out.println(value);
		
	}

}

