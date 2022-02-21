/*Write a program to create a Student class with properties name , courseEnrolled . 
Write method getCourseEnrolled() that gives the result of the course enrolled by the student. 
eg Ram has enrolled for Java course ,
Vicky has enrolled for HTML course and Reena has enrolled for Spring course.*/

package ObjectAndClasses;

public class StudentClass {

	String Name;
	String CourseEnrolled;
	
	public StudentClass(String name) {
		this.Name = name;
	}
	
	public void getCourseEnrolled(String courseEnrolled) {
		CourseEnrolled = courseEnrolled;
	}
	
	public void StudentDetails() {
		System.out.println(" " +Name+ " " + "has Enrolled for"+ " " +CourseEnrolled  );
		

	}
	
}
