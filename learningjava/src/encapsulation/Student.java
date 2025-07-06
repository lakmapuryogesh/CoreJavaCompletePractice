package encapsulation;

public class Student {
      int rollNumber;
      String name;
      boolean isAttendence;
      
      public Student(int rollNumber) {
    	  this.rollNumber=rollNumber;
      }
      public void setStudentAttendece(boolean flag) {
    	  isAttendence=flag;
    	  System.out.println("teacher assigned attendence to student");
      }
      public boolean getStudentAttendence() {
    	  System.out.println("Teacher accessed student attendence");
    	  return isAttendence;
      }
}
