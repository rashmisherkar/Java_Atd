/*. Write a program to print the names of students by creating a Student class. 
 * If no name is passed while creating an object of Student class, then the name should be "Unknown", 
 * otherwise the name should be equal to the String value passed while creating object of Student class.*/

package Constructor;

public class Exercise1 {
        String name;
        
  public Exercise1(String s) {
	  name = s;
  }
  
  public Exercise1() {
	  name = "unknown" ;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Exercise1 Sc = new Exercise1("Rashmi");
       Exercise1 SC = new Exercise1();
       System.out.println(Sc.name);
       System.out.println(SC.name);
       
	}

}
