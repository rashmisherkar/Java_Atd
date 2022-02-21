/*Write a program to create 3 objects of class mobile owned by Abhishek , Rahul and Ravi.
 *Out put of the program should be
Abhishek own iPhone Gold color smartphone having 8MP camera
Rahul own Samsung White color smartphone having 13MP camera
Ravi own Nexus Black color smartphone having 8MP camera*/

package Constructor;

public class RealLifeEg_Exercise1 {
	
	String name, brand, colour , camera;
    
	public RealLifeEg_Exercise1(String Name,String Brand,String Colour, String Camera) {
		name = Name;
		brand =Brand;
		colour =Colour;
		camera = Camera;
	}
	public void MobileInfo() {
		System.out.println(name + "own" +" " + brand +" "+ colour + "smartphone having"+" "+ camera+" "+"camera." );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealLifeEg_Exercise1 m1 = new RealLifeEg_Exercise1("Abhishek","iphone","Gold","8Mp");
		RealLifeEg_Exercise1 m2 = new RealLifeEg_Exercise1("Rahul","Samsung"," While","8Mp");
		RealLifeEg_Exercise1 m3 = new RealLifeEg_Exercise1("Ravi","Nexus","Black","8Mp");
        m1.MobileInfo();
        m2.MobileInfo();
        m3.MobileInfo();


	}

}
