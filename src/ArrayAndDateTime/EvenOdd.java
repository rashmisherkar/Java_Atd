/* Write a Java program to find the number of even and odd integers in a given array of integers.*/

package ArrayAndDateTime;

import java.util.Arrays;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {5, 7, 2, 4, 9};
		System.out.println("Original Array: "+Arrays.toString(num)); 
		int a = 0;
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] % 2 == 0)
				a++;
		}
		System.out.println("Number of even numbers : "+a);
		System.out.println("Number of odd numbers  : "+(num.length-a));
	}

}
