public class Xworkz{
	
	public static void main (String[] args){

		byte[] odd = {1,3,5,7,9,11,13,15,17,19};
		short[] scores = {90,80,60,70,80,70,100,120,80,60};
		int[] marks = {70,65,75,77,87,85,80,82,90,78};
		char[] grades = {'A','H','B','C','D','E','F','G','I','J'};
		float[] length = {2.5f, 5.6f, 10.12f,15.4f,16.2f,18.9f,6.15f,25.4f,27.15f,30.15f};
		long[] longArray = {10L,20L,30L,40L,50L,30L,60L,70L,80L,40L};
        double[] squareroot = {1.0,1.41,1.73,2.0,2.24,2.45,2.65,2.83,3.0,3.16};


        //FOR conditions for byte

        for(byte i=0; i<10; i++)
        	System.out.println(odd[i]);
        for(byte i=9; i>=0; i--)
        	System.out.println(odd[i]);
        for(byte i=5; i<10; i++)
        	System.out.println(odd[i]);
        for(byte i=9; i>=4; i--)
        	System.out.println(odd[i]);
        for(byte i=0; i<10; i +=2)
        	System.out.println(odd[i]);

        //FOR conditions for short

         for(short i=0; i<10; i++)
        	System.out.println(scores[i]);
        for(short i=9; i>=0; i--)
        	System.out.println(scores[i]);
        for(short i=7; i<10; i++)
        	System.out.println(scores[i]);
        for(short i=9; i>=5; i--)
        	System.out.println(scores[i]);
        for(short i=0; i<10; i +=2)
        	System.out.println(scores[i]);

        //FOR conditions for int

        for(int i=0; i<10; i++)
        	System.out.println(marks[i]);
        for(int i=9; i>=0; i--)
        	System.out.println(marks[i]);
        for(int i=7; i<10; i++)
        	System.out.println(marks[i]);
        for(int i=9; i>=5; i--)
        	System.out.println(marks[i]);
        for(int i=0; i<10; i +=2)
        	System.out.println(marks[i]);

        //FOR conditions for char
         
         for(char i=9; i>=0; i--)
        	System.out.println(grades[i]);
        for(char i=7; i<10; i++)
        	System.out.println(grades[i]);
        for(char i=9; i>=5; i--)
        	System.out.println(grades[i]);
        for(char i=0; i<10; i +=2)
        	System.out.println(grades[i]);
         for(char i=0; i<10; i++)
        	System.out.println(grades[i]);
        

        //FOR condition for long

        for(short i=7; i<10; i++)
        	System.out.println(longArray[i]);

        //FOR condtions for double

        for(short i=9; i>=5; i--)
        	System.out.println(squareroot[i]);


	}
}