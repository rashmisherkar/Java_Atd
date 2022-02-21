/*Write a program to create a Accountant class with parameters name , emailId and contactNo. 
 * Write a method to view all the accountants information.
eg. Accountant Ravi has mail id ravi@gmail.com and contact No 9867785694 .
 Accountant Rutuja has mail id rutuja@gmail.com and contact No 9987565634.*/

package ObjectAndClasses;

public class Accountant {
	
	String Name;
	String emailId;
	String  ContactNo;
	
	public Accountant(String name) {
		this.Name = name;
	}
	
	public void emailId(String EmailId) {
		emailId = EmailId;
	}

	public void ContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	
	public void AccountantDetails() {
		System.out.println("Accountant"+" "+Name+ " "+ "has mail id"+" " +emailId+ " " +"and contact no."+" " +ContactNo );
	}

}


