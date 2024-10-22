public class StudentDetails12
{
    static Student1[] studentData = new Student1[5];

    public static void main(String[] args) 
    {
        Student1 student = new Student1("sam", 101, 99, 99);
        Student1 student1 = new Student1("janu", 102, 99, 99);
        Student1 student2 = new Student1("janu", 103, 99, 99);
        Student1 student3 = new Student1("tina", 104, 99, 99);
        Student1 student4 = new Student1("racchu", 105, 99, 99);
        Student1 student5 = new Student1("mudu", 106, 99, 99);

        
        saveDetails(student); 
        saveDetails(student1);
        saveDetails(student2);
        saveDetails(student3);
        saveDetails(student4);
        saveDetails(student5);     
        displayStudentDetails();   
    }

    public static boolean saveDetails(Student1 detail) 
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
