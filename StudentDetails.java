
public class StudentDetails 
{
	
	static Student[] studentData=new Student[5];
	public static void main(String[] args)
	{

		Student student = new Student("sam",101,99,99);
		Student student1 = new Student("ram",102,99,99);
		Student student2= new Student("janu",103,99,99);
		Student student3 = new Student("tina",104,99,99);
		Student student4 = new Student("racchu",105,99,99);
		Student student5 = new Student("mudu",106,99,99);

		

        saveDetails(student); 
  		saveDetails(student1);
  		saveDetails(student2);
  		saveDetails(student3);
  		saveDetails(student4);
  		saveDetails(student5);


		for (int i=0;i<studentData.length;i++) 
		{
			if(studentData!=null)
			{
				studentData[i].displayStudentDetails();

			}

		}
	}
		public static boolean saveDetails(Student detail)

		{
			for (int i = 0; i < studentData.length; i++)
			 {
            if (studentData[i] == null) 
            {
                studentData[i] = detail;
                System.out.println("Details saved");
                return true;
            }
		}

		System.out.println("Space full");
        return false;
	}
}

 
