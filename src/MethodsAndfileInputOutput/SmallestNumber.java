/*:Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output: The smallest value is 25.0*/

package MethodsAndfileInputOutput;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Input the Second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number: ");
        int z = in.nextInt();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
    }

   public static int smallest(int x, int y, int z)
    {
        return Math.min(Math.min(x, y), z);

	}

}
