package NumberCharacterStringClass;

public class StringExercise8 {
	static String repeatEnd(String str,int n){
		String s="";
		for(int i=0;i<n;i++) {
			s+=str.substring(str.length()-n);
		}
		
		return s;
	}
	public static void main(String[] args) {
		System.out.println(repeatEnd("Hello",3));
		System.out.println(repeatEnd("Hello",2));
		System.out.println(repeatEnd("Hello",1));
	}
}
