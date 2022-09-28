package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortislem = new DortIslem();
		
		int toplam = dortislem.topla(2, 4);
		System.out.println("2+4 = " + toplam);
		
		int fark = dortislem.cikar(4, 3 );
		System.out.println("4-3 = " + fark);
		
		int carpim = dortislem.carp(2, 2);
		System.out.println("2*2 = " + carpim);
		
		int bolum = dortislem.bol(4,2);
		System.out.println("4/2 = " + bolum);
				
	}

}
