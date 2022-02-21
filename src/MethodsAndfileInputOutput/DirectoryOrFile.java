/*Write a Java program to check if given path name is a directory or a file.*/

package MethodsAndfileInputOutput;

import java.io.File;

public class DirectoryOrFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("D:\\Rashmi\\interview program.txt");
        if (dir.isDirectory()) 
          {
           System.out.println(dir.getAbsolutePath() + " is a directory.\n");
          } 
        else
         {
           System.out.println(dir.getAbsolutePath() + " is not a directory.\n");
         }
        if (dir.isFile()) 
          {
           System.out.println(dir.getAbsolutePath() + " is a file.\n");
          } 
        else
         {
           System.out.println(dir.getAbsolutePath() + " is not a file.\n");
         }  
	}

}
