package extrapractice;

public class ScroreIn {
	static boolean scoreIncrease(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) return false;			
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(scoreIncrease(new int[] {1,5,4}));
	}
}
