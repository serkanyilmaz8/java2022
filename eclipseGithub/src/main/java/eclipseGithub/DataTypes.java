package eclipseGithub;

import java.util.ArrayList;

public class DataTypes {

	public static void main(String[] args) {
		ArrayList<Object> variables = new ArrayList<>();
		
		boolean bool = true;
		variables.add(bool);
		
		char ch ='a';
		variables.add(ch);
		
		byte byteNum = -2;
		variables.add(byteNum);
		
		short shortNum = 1234;		
		variables.add(shortNum);
		
		int intNum = 118122;
		variables.add(intNum);
		
		long longNum = 145243667; 
		variables.add(longNum);
		
		double doubleNum = 2.25346;
		variables.add(doubleNum);
		
		float floatNum = 12.423f;
		variables.add(floatNum);
		
		System.out.println("some variables: " + variables.toString());
		
		

	}

}
