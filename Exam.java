// create a class and declare 5 variable and 4 methods and crete 4 objects
public class Exam
{
	int regno;
	String name;
	int m1;
	int m2;
	int m3;


	public static void clgName()
	{
		System.out.println("Devi");
	}

    public Exam( int reg_no,String name,int m1,int m2,int m3)
      {
         this.reg_no = studentname;
         this.name = reg_no;
         this.m1 = m1;
         this.m2 = m2;
         this.m3= m3;
      }

    public void displayStudentDetails() 
    { 
        System.out.println("reg_no: " + reg_no);
        System.out.println("name : " + name);
        System.out.println("mark1 : " + m1);
        System.out.println("mark2: " + m2);
        System.out.println("mark3: " + m3);
    }

	public static void main(String args[])
	{
        Exam E1 = new Exam(1,"sam",99,99,99);
        displayStudentDetails(E1);
       
	}

	
}


