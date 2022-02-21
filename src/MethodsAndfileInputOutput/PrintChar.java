/*Write a Java method to print characters between two characters (i.e. A to P ).
Print each character on new line.*/

package MethodsAndfileInputOutput;

public class PrintChar {

	public static void main(String[] args) {
	// TODO Auto-generated method s
		   print_Chars('(', 'z', 20);
    }
 public static void print_Chars(char char1, char char2, int n) {
        for (int ctr = 1; char1 <= char2; ctr++, char1++) {
            System.out.println(char1 + " ");
            if (ctr % n == 0) System.out.println("");
        }
		System.out.println("\n");


	}

}
