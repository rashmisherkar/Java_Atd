/*Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it. 
 Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. 
 Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie Bank
Create object of the 'AddAmount' class and display the final amount in Piggie Bank.
*/

package Constructor;

    public class Exercise3 {
	   int amount = 50;

    public Exercise3(){
    }

    public Exercise3(int a) {
        amount = a+amount;
    }

    public int displayAmount() {
		return amount;
   }

  public static void main(String[] args)
    {
        Exercise3 a = new Exercise3();
        int AMOUNT = a.displayAmount();
        System.out.println(AMOUNT);
        
        Exercise3 b = new Exercise3(40);
        int Amount = b.displayAmount();
        System.out.println(Amount);
    }
}