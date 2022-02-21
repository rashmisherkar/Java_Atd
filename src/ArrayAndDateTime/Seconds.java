/*Write a Java program to find seconds since 1970.*/

package ArrayAndDateTime;

public class Seconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long seconds = System.currentTimeMillis() / 1000l;
	     System.out.println("\nSeconds since 1970: "+seconds+"\n");
	}

}
