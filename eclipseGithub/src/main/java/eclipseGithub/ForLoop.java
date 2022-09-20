package eclipseGithub;

public class ForLoop {

	public static void main(String[] args) {
		// General form of for loop
		for(int i=0;  i<10; i+=2 ) {
			System.out.println("i = " + i);
		}
		System.out.println("Dongu bitti");
		
		//infinite for loop
		/* for( ; ; ){
		  System.out.println("for");
		  }
		*/
		
		// Enhanced form
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		for(int item:numbers) {
			System.out.println(item);
		}

	}

}
