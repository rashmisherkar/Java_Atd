/*Write a Java program to find the duplicate values of an array of integer values.
*/
package ArrayAndDateTime;

public class DuplicateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] a = {1, 2, 5, 5, 6, 6, 7, 2};
		  
	        for (int i = 0; i < a.length-1; i++)
	        {
	            for (int j = i+1; j < a.length; j++)
	            {
	                if ((a[i] == a[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+a[j]);
	                }
	            }
	        }
	}

}
