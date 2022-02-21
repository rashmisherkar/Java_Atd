/* Write a Java program to declare a Boolean variable with initial value of “true” and 
 * later change it to “false” before printing it.*/
package Datatypes;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
        // Test true and false booleans.
        boolean value = true;
        if (value) {
            System.out.println("A");
        }
        value = false;
        if (!value) {
            System.out.println("B");
        }
	}

}
