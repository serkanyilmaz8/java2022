package eclipseGithub;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {

		int sayi = 11;
		boolean asalMi = false;
		
		if(sayi==2)
			asalMi = true;
		else {
			out:for(int i=2; i<sayi; i++) {
				if(sayi%i == 0 )
					break out;
				else
					asalMi = true;
					
			}
		}
		
		System.out.println(sayi + " asal mi: " + asalMi);

	}

}
