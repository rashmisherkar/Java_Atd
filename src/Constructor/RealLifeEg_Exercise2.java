/*Write a class student who is having Name, Roll number, Fathers’ Name, 
Contact Number, Address as fields. The out put of the program should be 
Student Name is: Mr. Abhishek
Roll Number is: 123
Fathers' Name is: Mr. Sulekh
Contact Number is: +1-8745733445
Student Address is: #321, South Street, No-3, Ontario
*/

package Constructor;

public class RealLifeEg_Exercise2 {
	String Name,RollNo, FatherName, ContactNo, Address;
	
	public RealLifeEg_Exercise2(String name,String rollno, String fathername, String contactno, String address) {
		Name = name;
		RollNo = rollno;
		FatherName = fathername;
		ContactNo = contactno;
		Address = address;
	}
	public void StudentInfo() {
		System.out.println("Student Name is:"+Name);
		System.out.println("Student Roll Number is:"+RollNo);
		System.out.println("Student Father's Name is:"+FatherName);
		System.out.println("Student Contact No is:"+ContactNo);
		System.out.println("Student Address is:"+Address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealLifeEg_Exercise2 stud = new RealLifeEg_Exercise2("Mr.Abhishek","123","Mr.Sulekh","+1-8745733445","#321, South Street, No-3, Ontario");
        stud.StudentInfo();
	}

}
