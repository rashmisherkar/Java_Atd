/*Create a class AccountHolder and create three account-holder object Tom, Henry and Sarah. 
 * Output of the program is to test the eligibility for the account holder for credit card. 
 * Create method testEligibilityForCC() that will return true or false depending on below condition*/

package ObjectAndClasses;

public class Exercise1 {
	int age;
	float accountbalance;
	String name;
	
	Exercise1(String name,int age,float accountbalance)
	{
		this.name = name;
		this.age = age;
		this.accountbalance = accountbalance;
	}
	
	void testEligibilityForCC()
	{
		if(age >=25 && accountbalance >= 25000)
		{
			System.out.println(name+" is Eligible for credit card.");
		}
		else System.out.println(name+" is Not Eligible for credit card.");
	}
	
	public static void main(String[] args) 
	{
		Exercise1 tom = new Exercise1("Tom", 22, 50000);
		Exercise1 henry = new Exercise1("Henry", 27, 26500);
		Exercise1 sarah = new Exercise1("Sarah", 26, 24000);
		
		tom.testEligibilityForCC();
		henry.testEligibilityForCC();
		sarah.testEligibilityForCC();		
	}
}