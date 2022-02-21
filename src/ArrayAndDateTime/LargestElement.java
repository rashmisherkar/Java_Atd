/* Write a Java program to find the second largest element in an array.*/

package ArrayAndDateTime;

import java.util.Arrays;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
	System.out.println("Original numeric array : "+Arrays.toString(a));            
	Arrays.sort(a);
	int index = a.length-1;
	while(a[index]==a[a.length-1]){
	index--;
	}
	System.out.println("Second largest value: " + a[index]);

	}

}
