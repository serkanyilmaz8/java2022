package eclipseGithub;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf= 'A';
		
		switch(harf) {
			case 'A', 'O', 'U', 'I':
				System.out.println(harf +" bir kalın sesli harftir");
				break;
			case 'E', 'Ö', 'Ü', 'İ':
				System.out.println(harf +" bir  ince sesli harftir");
				break;
			default:
				System.out.println(harf + " bir sesli harf degildir");
				break;
			
		}

	}

}
