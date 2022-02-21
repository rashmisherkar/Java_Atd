/*Write a Java program to check whether a given string ends with the contents of another string.
Sample Output: "Python Exercises" ends with "se"? false  ,"Python Exercise" ends with "se"? true*/

package NumberCharacterStringClass;

public class StringExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Python Exercises";
        String str2 = "Python Exercise";
        String end_str = "se";

        boolean ends1 = str1.endsWith(end_str);
        boolean ends2 = str2.endsWith(end_str);

        System.out.println("\"" + str1 + "\" ends with " + "\"" + end_str + "\"? " + ends1);
            System.out.println("\"" + str2 + "\" ends with " + "\"" + end_str + "\"? " + ends2);
	}

}
