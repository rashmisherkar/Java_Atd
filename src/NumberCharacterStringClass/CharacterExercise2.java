/*Write a program to determine if the input character is a digit or a alphabet.
 * Use Character.isDigit() method.*/
package NumberCharacterStringClass;

import java.util.Scanner;

public class CharacterExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter input character:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt(); 
		boolean check = Character.isDigit(num);  
		if(check) {
			System.out.println("The input\'" +num+ "\' is a digit.\n");  
		}
		else {
			System.out.println("The input\'" +num+ "\' is a not digit.\n");
		}

	}

}
