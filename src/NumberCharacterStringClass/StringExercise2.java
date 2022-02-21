/*Write a Java program to test if a given string contains the specified sequence of char values.
Sample Output: Original String: PHP Exercises and Python Exercises */

package NumberCharacterStringClass;

public class StringExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";
        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));
    }
	}


