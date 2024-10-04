public class Method{
	
	public static void main(String[] args){

    area();
    substract();
    division();
    square();
    greeting();
    addition();
    multiply();
    triangle();
    sum();
    maximum();

	}

	public static void area(){

	int length = 4;
	int width = 2;
	int areaOfRect = length * width;
	System.out.println(areaOfRect);
	}

	public static void substract(){

		int numOne=10;
		int numTwo=4;
		int substractOfNum=numOne-numTwo;
		System.out.println(substractOfNum);
	}

	public static void division(){

		int valueOne=20;
		int valueTwo=5;
		int divisionOfNum=valueOne/valueTwo;
		System.out.println(divisionOfNum);
	}

	public static void square(){

		int side=4;
		int areaOfSquare=side*side;
		System.out.println(areaOfSquare);
	}

	public static void greeting(){

		System.out.println("Hello !");
	}

	public static void addition(){

		int num1=150;
		int num2=250;
		int additionOfNum=num1+num2;
		System.out.println(additionOfNum);
	}

	public static void multiply(){

		int value1=2;
		int value2=10;
		int multiplicationOfNum=value1*value2;
		System.out.println(multiplicationOfNum);
	}

	public static void triangle(){

		float breadth=4;
		float height=13;
		float area=(breadth*height)/2;
		System.out.println(area);
	}

	public static void sum(){

		short a=2;
		short b=4;
		short c=6;
		int sumOfNum=a+b+c;
		System.out.println(sumOfNum);
	}

	public static void maximum(){

		int number1=5;
		int number2=3;
		int max=(number1>number2)?number1:number2;
		System.out.println(max);
	}
}