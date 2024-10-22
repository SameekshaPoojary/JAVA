public class Student1{
      
      String studentname;
      int reg_no;
      int mark1;
      int mark2;


      public Student1()
      {
        System.out.println("no parmtzed constructor");
      }

      public Student1( String studentname,int reg_no,int mark1,int mark2)
      {
         this.studentname = studentname;
         this.reg_no = reg_no;
         this.mark1 = mark1;
         this.mark2 = mark2;
      }

      
      public void displayStudentDetails() { 
        System.out.println("Student name: " + studentname);
        System.out.println("reg_no : " + reg_no);
        System.out.println("mark1 : " + mark1);
        System.out.println("mark2: " + mark2);
    }
}