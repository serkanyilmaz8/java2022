package Functions;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel";
		
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		
		int toplam = topla(2, 3);
		System.out.println("sayilarin toplami: " + toplam);
		
		int toplam2 = topla2(1,3,5,67,8);
		System.out.println("toplam2: " + toplam2);
		
	}
	public static void ekle(){
		System.out.println("eklendi");
	}
	
	public static void sil() {
		System.out.println("silindi");
	}
	
	public static void guncelle() {
		System.out.println("guncellendi");
	}
	
	public static int topla(int num1, int num2) {
		return num1+num2;
	}
	
	// variable arguments
	// arka planda int[] gibi calisiyor
	public static int topla2(int... sayilar) {
		int sum = 0;
		for(int num:sayilar) {
			sum += num;
		}
		return sum;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}

}
  