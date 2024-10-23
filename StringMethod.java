public class StringMethod
{
	public static void main(String args[])
	{
		String firstname="Sameeksha";
		String concatenatedValue = firstname.concat(" Poojary");
		System.out.println(concatenatedValue);

		String institute="xworkz";
		String uppercaseValue = institute.toUpperCase();
		System.out.println(uppercaseValue);

		String company="winman software";
		String lowercaseValue = company.toLowerCase();
		System.out.println(lowercaseValue);

		String flowerName="   jasmine  ";
		String trimedValue = flowerName.trim();
		System.out.println(trimedValue);

		String house="";
		boolean emptychecking=house.isEmpty();
		System.out.println(emptychecking);

		String wordreverse="sama";
		char[] palin=wordreverse.toCharArray();
		String value="";
		for(int i=palin.length-1;i>=0;i--)

		{
			value =value + palin[i];
		}
		
		if(value.equals(wordreverse))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		//Second Smallest
		System.out.println("");
		System.out.println("Second Smallest Number");
		int[] arr = {56, 8, 45, 2, 99, 4, 75 , 10 };
		int smallValue = secondSmallestNum(arr);
		System.out.println(smallValue);

	}
	public static int secondSmallestNum(int arr[]) 
	{
		int smallestValue = arr[0];
		int secondSmallestValue = arr[0];
		for(int i = 1; i < arr.length; i++) 
		{
			if(arr[i] < smallestValue) 
			{
				secondSmallestValue = smallestValue;
				smallestValue = arr[i];
			}
			else if(arr[i]< secondSmallestValue)
			{
				secondSmallestValue = arr[i];
			}
		}
		return secondSmallestValue;
	}
}