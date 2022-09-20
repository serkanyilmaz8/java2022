package eclipseGithub;

public class SayiBulma {

	public static void main(String[] args) {
		
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
			System.out.println(wanted + " is an element of the array");
		else
			System.out.println(wanted + " is not an element of the array");

	}

}
