package eclipseGithub;

public class ArkadasSayilar {

	public static void main(String[] args) {
		int num1 = 220;
		int num2 = 284;
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=1; i<num1; i++) {
			if(num1%i  == 0)
				sum1 += i;
		}

		for(int j=1; j<num2; j++) {
			if(num2%j  == 0)
				sum2 += j;
		}
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		
		if(num1==sum2 && num2==sum1)
			System.out.println(num1 + " and " + num2 + " are friend number");
		else
			System.out.println("they are not friend number");
	}

}
