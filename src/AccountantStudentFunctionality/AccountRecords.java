package AccountantStudentFunctionality;

import java.util.Scanner;

public class AccountRecords {

	  public AccountRecords(String name, String dob, double amount) {
		// TODO Auto-generated constructor stub
	}



	public AccountRecords(String name, String pass, String string, double amount) {
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
		  String name, dob, pass;
		  int ch,day,month, year;
	      double amount = 0;
	      Scanner kb = new Scanner(System.in);
          AccountRecords acct;
	      do{
	    	  acct = null;
	    	  System.out.println("Enter your choice (1-5):");
	    	  System.out.println("1. Create new account without deposit");
	    	  System.out.println("2. Create new account with deposit an amount");
	    	  System.out.println("3. Deposit an amount to an existing account");
	    	  System.out.println("4. Withdraw an amount from an account");
	    	  System.out.println(" 5. Exit");
	    	  System.out.println(" Enter your choice: ");
	    	  ch = kb.nextInt();
	    	  kb.nextLine(); 
	  switch(ch) {
	  		case 1: System.out.println("Enter name: ");
	  				name = kb.nextLine();
	  				do {
	  					System.out.println("Enter date of birth as day month year(e.g. 23 12 2001):");
	  					System.out.print("Day: ");
	  					day = kb.nextInt();
	  					System.out.print("Month: ");
	  					month = kb.nextInt();
	  					System.out.print("Year: ");
	  					year = kb.nextInt();
	  				    }
	  				while(checkInput(day,month,year));
	  					dob = (day+"/"+month+"/"+year);
	  					acct = new AccountRecords(name,dob, amount);
	  					break;

	  		case 2: System.out.println("Enter name: ");
	  				name = kb.nextLine();
	  				do {
	  					System.out.println("Enter date of birth as day month year(e.g. 23 12 2001):");
	  					System.out.print("Day: ");
	  					day = kb.nextInt();
	  					System.out.print("Month: ");
	  					month = kb.nextInt();
	  					System.out.print("Year: ");
	  					year = kb.nextInt();
	  				   }
	  				while(checkInput(day,month,year));
	  					dob = (day+"/"+month+"/"+year);
	  					System.out.println("Enter initial deposit amount: ");
	  					amount = kb.nextDouble();
	  					acct = new AccountRecords(name, dob, amount);
	  					break;
	  					
	  		case 3: System.out.print("Enter name: ");
	  				name = kb.nextLine();
	  				System.out.print("Enter password: ");
	  				pass = kb.nextLine();
	  				System.out.print("Enter amount to be deposited: ");
	  				amount = kb.nextDouble();
	  				acct = new AccountRecords(name,pass,"deposit",amount);
	  				break;
	  				
	  		case 4: System.out.print("Enter name: ");
	  				name = kb.nextLine();
	  				System.out.print("Enter password: ");
	  				pass = kb.nextLine();
	  				System.out.print("Enter amount you want to withdraw: ");
	  				amount = kb.nextDouble();
	  				acct = new AccountRecords(name,pass,"withdraw",amount);
	  				break;

	         case 5:  System.out.println("Exit.");

	               }
	      }while(ch!=5);
	  }

private static boolean checkInput(int day, int month, int year) {
		boolean checkInput;
		checkInput=false; 
		if(day>= 0 || day <=31) {
			System.out.println("Invalid day");
			checkInput=true;   
		}
		if(month>=0 || month <= 31) {
			System.out.println("Invalid Month");
			checkInput=true;
		}
		return checkInput;

	  }

	}