/*Write a program using ternary operator to print value of x if x is less than 10 else 
 it should print yalue of y.(Input x=5,y=13)*/

package Operaters;

public class Exercise4 {
	
	public static void main(String[] args) {
		
	
	int x = 5;
    int y = 13;
    int z;
    z = (x < 10) ? x : y;
    System.out.println( "Value of x is : " +  z );

    z = (x > 10) ? x: y;
    System.out.println( "Value of x is : " + z );
 }
}
           
   
   

