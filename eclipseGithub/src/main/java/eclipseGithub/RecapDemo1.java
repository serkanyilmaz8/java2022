package eclipseGithub;

public class RecapDemo1 {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 25;
		int num3 = 22;
		int greatest = num1;
		
		if(greatest < num2) {
			if(num2 > num3) {
				greatest = num2;
			}
		}
		
		if(greatest < num3 && num2 <num3) {
			greatest = num3;
		}
		
		System.out.println("the greatest number: " + greatest);

	}

}
