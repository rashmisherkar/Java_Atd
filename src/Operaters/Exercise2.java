/*Write a program to print the result if result is combination of 
  a.true and true  .  b.true and false  c.false and true     Use && operator */

package Operaters;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		boolean b = false;
	
		System.out.println("true && true:" +(a && a));
		System.out.println("true && false:" +(a && b));
        System.out.println("false && true:" +(b && a));

		
         
		
	}

}
