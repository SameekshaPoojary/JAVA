public class StudentDetails 
{
    static Student[] studentData = new Student[5];

    public static void main(String[] args) 
    {
        Student student = new Student("sam", 101, 99, 99);
        Student student1 = new Student("janu", 102, 99, 99);
        Student student2 = new Student("janu", 103, 99, 99);
        Student student3 = new Student("tina", 104, 99, 99);
        Student student4 = new Student("racchu", 105, 99, 99);
        Student student5 = new Student("mudu", 106, 99, 99);

        
        saveDetails(student); 
        saveDetails(student1);
        saveDetails(student2);
        saveDetails(student3);
        saveDetails(student4);
        saveDetails(student5);

        
        updateStudentNameByRegNo("ganapa", 101);

        
        for (int i = 0; i < studentData.length; i++) {
            if (studentData[i] != null) {
                studentData[i].displayStudentDetails(); 
            }
        }

        deleteBystudentname("ganapa");

        
        for (int i = 0; i < studentData.length; i++) {
            if (studentData[i] != null) {
                studentData[i].deleteBystudentname(); 
            }
        }

        
        System.out.println("......find student by name........");
        Student findName = findByStudentName("janu");
        Student findName1 = findByStudentName("tina");
        
        if (findName != null) {
            findName.displayStudentDetails(); 
        }
        
        if (findName1 != null) {
            findName1.displayStudentDetails(); 
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

    public static boolean updateStudentNameByRegNo(String studentname, int reg_no) 
    {
        for (int i = 0; i < studentData.length; i++) 
        {
            if (studentData[i] != null && studentData[i].reg_no == reg_no) 
            {
                studentData[i].studentname = studentname; 
                System.out.println("Updated name for registration number " + reg_no);
                return true;
            }
        }
        System.out.println("Not updated");
        return false;
    }

    public static Student findByStudentName(String studentname) 
    {
        for (int i = 0; i < studentData.length; i++) 
        {
            if (studentData[i] != null) 
            {
                if (studentData[i].studentname.equals(studentname)) 
                {
                    System.out.println("Student name found");
                    return studentData[i]; 
                }
            }
        }
        System.out.println("Name not found");
        return null;
    }
    public static boolean deleteBystudentname(String studentname)
    {
    	for (int i = 0; i < studentData.length; i++) 
    	{
    		if(studentData[i]!=null
    		{
    			if(studentData[i].studentname.equals(studentname))
    			{
    				studentData[i]=null;
    				return true;
    			}
    		}
    		System.out.println("Name not found");
        return null;
		}
    }
}
