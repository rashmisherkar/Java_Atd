/*Create a class named 'Programming'. 
 While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed. 
 If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed.
*/

package Constructor;

public class Exercise4 {
    String ss;
     String name;
 
   public Exercise4(String ss) {
    	name = ss; 
    }
   public Exercise4() {
	   name = "I love programming languages ";
  }
   public static void main(String[] args) {
		 Exercise4 pro = new Exercise4();
		 pro.ss = "Java";
		 System.out.println("I love" + pro.ss);
		 System.out.println(pro.name);
	 }
 
}
