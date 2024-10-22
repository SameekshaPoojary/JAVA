public class Student
{
      
      String studentname;
      int reg_no;
      int mark1;
      int mark2;

      public void displayStudentDetails() 
      { 
        System.out.println("Student name: " + studentname);
        System.out.println("reg_no : " + reg_no);
        System.out.println("mark1 : " + mark1);
        System.out.println("mark2: " + mark2);
      }
      public static void main(String args[])
      {
        Student student = new Student("sam", 101, 99, 99);
        displayStudentDetails(student);
      }
}