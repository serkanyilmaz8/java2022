package eclipseGithub;

public class SwitchBlocks {

	public static void main(String[] args) {
		int grade = 'f';
		
		switch(grade) {
			case 'A':
				System.out.println("Perfect");
				break;
			case 'B':
				System.out.println("Good");
				break;
			case 'C':
				System.out.println("Average");
				break;
				
			case 'D':
				System.out.println("Bad");
				break;
			case 'F':
				System.out.println("You missed");
				break;
			default:
				System.out.println("Incorrect grade");
		}

	}

}
