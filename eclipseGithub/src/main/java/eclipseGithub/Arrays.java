package eclipseGithub;

public class Arrays {

	public static void main(String[] args) {
		
		String[] students = new String[3];
		
		String student1 = "Serkan";
		students[0] = student1;
		
		String student2 = "Engin";
		students[1] = student2;
		
		String student3 = "Berke";
		students[2] = student3;
		
		for(String item:students) {
			System.out.println(item);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("2.video");
		System.out.println("");
		System.out.println("");
		
		// 2.video
		
		double[] myList = {1.2, 2.5, 3.6, 4.2, 5.4, 6.9};
		double sum = 0.0;
		
		for(double number:myList) {
			System.out.println(number);
			sum += number;
		}
		System.out.println("sum of this numbers: " + sum);
		
		System.out.println("");
		System.out.println("");
		System.out.println("2.video");
		System.out.println("");
		System.out.println("");
		
		// 3.video
		
		String [][] sehirler = new String[3][3];
		
		sehirler[0][0] = "İstanbul ";
		sehirler[0][1] = "Bursa ";
		sehirler[0][2] = "Balikesir ";
		sehirler[1][0] = "Izmir ";
		sehirler[1][1] = "Aydin ";
		sehirler[1][2] = "Mugla ";
		sehirler[2][0] = "Ankara ";
		sehirler[2][1] = "Cankiri ";
		sehirler[2][2] = "Eskisehir ";
		
		for(int i=0; i<3; i++ ) {
			System.out.println();
			for(int j=0; j<3; j++) {
				System.out.print(sehirler[i][j]);
			}
		}
		
		
		
	}

}
