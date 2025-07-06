package encapsulation;

public class Teacher {
public static void main(String[] args) {
	Student s=new Student(101);
	s.isAttendence=true;
	s.setStudentAttendece(true);
	s.getStudentAttendence();
	System.out.println("Teacher assigned attendence to a rollno is"+s.rollNumber);
}
}
