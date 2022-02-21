/*Write a Java program to compare a given string to another string, ignoring case considerations.
Sample Output: 
"Stephen Edwin King" equals "Walter Winchell"? false 
"Stephen Edwin King" equals "stephen edwin king"? true.
*/

package NumberCharacterStringClass;

public class StringExercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Stephen Edwin King";
        String b = "Walter Winchell";
        String c = "stephen edwin king";
        
        boolean equals1 = a.equalsIgnoreCase(b);
        boolean equals2 = a.equalsIgnoreCase(c);

        System.out.println("\"" + a + "\" equals \"" + b + "\"? " + equals1);
            System.out.println("\"" + a + "\" equals \"" + c + "\"? " + equals2);

	}

}
