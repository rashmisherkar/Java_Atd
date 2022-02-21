/* Write a Java program to find the maximum and minimum value of an array.*/

package ArrayAndDateTime;

import java.util.Arrays;

public class MaxMInArray {
	static int max;
    static int min;

    public static void max_min(int a[]) {
        max = a[0];
        min = a[0];
        int len = a.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (a[i] > max) max = a[i];
                if (a[i] < min) min = a[i];
            }
            if (a[i] > a[i + 1]) {
                if (a[i] > max) max = a[i];
                if (a[i + 1] < min) min = a[i + 1];
            }
            if (a[i] < a[i + 1]) {
                if (a[i] < min) min = a[i];
                if (a[i + 1] > max) max = a[i + 1];
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	        max_min(a);
	        System.out.println(" Original Array: "+Arrays.toString(a));
	        System.out.println(" Maximum value for the above array = " + max);
	        System.out.println(" Minimum value for the above array = " + min);
	    }

	}


