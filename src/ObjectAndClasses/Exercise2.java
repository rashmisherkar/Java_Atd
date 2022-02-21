/*Modify above program so the the minimum age and minimum account balance can be changed at run time.
ie: Instead of 25 and 20000 we need 22 and 25000*/

package ObjectAndClasses;

public class Exercise2 {

	int age;
	float accountbalance;
	String name;
	
	static int minandage = 25;
	static float minacbal = 20000;
	
	Exercise2(String name,int age,float accountbalance)
	{
		this.name = name;
		this.age = age;
		this.accountbalance = accountbalance;
	}
	
	void testEligibilityForCC()
	{
		if(age >=minandage && accountbalance >= minacbal)
		{		
			System.out.println(name+" is Eligible for credit card.");
		}
		else 
		{
			System.out.println(name+" is Not Eligible for credit card.");
		}
	}
	
	public static void main(String[] args) 
	{
		Exercise2 tom = new Exercise2("Tom", 22, 50000);
		Exercise2 henry = new Exercise2("Henry", 27, 24500);
		Exercise2 sarah = new Exercise2("Sarah", 26, 25000);
		
		Exercise2.minandage = 22;
		Exercise2.minacbal = 25000;

		tom.testEligibilityForCC();
		
		henry.testEligibilityForCC();
		sarah.testEligibilityForCC();		
	}
}