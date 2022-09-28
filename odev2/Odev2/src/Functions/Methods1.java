package Functions;

public class Methods1 {

	public static void main(String[] args) {
		sayiBulmaca();
		
 
	}
	
	public static void sayiBulmaca() {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int wanted = 3;
		boolean isThere = false;
		
		for(int aNumber:numbers) {
			if(aNumber==wanted) { 
				isThere = true;
				break;
			}
			
		}
		
		if(isThere)
			mesajVer(wanted);
		else
			System.out.println(wanted + " is not an element of the array");

	}
	
	public static void mesajVer(int wanted) {
		System.out.println(wanted + " is an element of the array");
		
	}

}
