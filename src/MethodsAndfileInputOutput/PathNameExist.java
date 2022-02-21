/*Exercise 1 : Write a Java program to check if a file or directory specified by path name exists or not.*/

package MethodsAndfileInputOutput;

import java.io.File;

public class PathNameExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File dir = new File("D:\\Rashmi\\interview program.txt");
         if (dir.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
	}

}
