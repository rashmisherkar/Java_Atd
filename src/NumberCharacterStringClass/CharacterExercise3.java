/*Write a program to print all input characters to upper case. 
 Use method Character.toUpperCase(). 

eg input 'b' output B
input 'h' output H*/
package NumberCharacterStringClass;

public class CharacterExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char ch = 'b';
        char ch1 = 'h';
        System.out.println("The uppercase of the character"+ " " +ch+ " " + "is" + " "+(Character.toUpperCase(ch)));
        System.out.println("The uppercase of the character"+ " " +ch1+ " " + "is"+ " " + (Character.toUpperCase(ch1)));
	}

}
