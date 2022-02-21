
/*Create a class named 'Rectangle' with two data members- 
 length and breadth and a method to claculate the area which is 'length*breadth'.
  The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.*/
package Constructor;

public class Exercise2 {
	int length;
	int breath;
	
	public Exercise2() {
		length = 0;
		breath = 0;
	}
	
	public Exercise2(int Length,int Breath) {
		length = Length ;
		breath = Breath ;
	}
	
	public Exercise2(int Side) {
		length = breath = Side;	
	}
    
	public int Area() {
		return length * breath ;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise2 zero = new Exercise2();
         int zeroArea = zero.Area();
        System.out.println(zeroArea);
        
        Exercise2 rectangle = new Exercise2(10,20);
        int rectangleArea = rectangle.Area();
        System.out.println(rectangleArea);
        

        Exercise2 square = new Exercise2(10);
        int squareArea = square.Area();
        System.out.println(squareArea);

	}

}
