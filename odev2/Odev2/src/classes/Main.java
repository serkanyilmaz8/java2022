package classes;

public class Main {

	public static void main(String[] args) {
		// 
		CustomerManager cm1 = new CustomerManager();
		CustomerManager cm2 = new CustomerManager();
		cm1 = cm2;
		
		cm1.add();
		cm1.remove();
		cm1.update();
		
		/*
		 * classlar referans tiptir bu yuzden adres tutarlar
		 * eger bir class baska bir class a = operatoru ile atanırs
		 * o iki class ta heap te anı alanı gostermeye baslar
		 * 
		 * bu yuzden 
		 * heapte o alandaki herhangi bir degisiklik her 
		 * iki objeyide etkiler 
		 * 
		 * ayrıca bu atama sonucu bosta kalan hea alanı 
		 * garbage collevtor tarafından temizlenir
		 */
		
		
		// value type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		/*
		 * burdaki veriler value type oldugu icin = isleminde direk degerler
		 * kopyalanıyor fakat daha sonraki sayi1 deki degisimler 
		 * sayi2 yi etkilemiyor
		 */
		
		
		int[] array1 = new int[] {1, 2, 3}; // array1 bir adres tutuyor mesela:101
		int[] array2 = new int[] {4, 5, 6}; // array2 bir adres tutuyor mesela:102 
		array2 = array1; // array1 ve array2 iki artik ayni adresi tutuyor: 102 
		array1[0] = 10; // burdaki degisim iki arrayide etkiliyor
		System.out.println(array1[0]);
	}

}
