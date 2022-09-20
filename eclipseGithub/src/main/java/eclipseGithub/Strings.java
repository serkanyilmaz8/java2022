package eclipseGithub;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Strings {

	public static void main(String[] args) {
		
		String mesaj = "Bugun hava cok guzel";
		System.out.println(mesaj);

		System.out.println("Eleman sayisi: " + mesaj.length());
		System.out.println("Metnin 5. elemNani: " + mesaj.charAt(4));
		
		String mesaj2 = mesaj.concat(" Yasasin!");
		System.out.println(mesaj2);
		
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("s"));
		
		System.out.println(mesaj.endsWith("l"));
		System.out.println(mesaj.endsWith("r"));
		
		char[] mesaj3 = new char[10];
		mesaj.getChars(4, 8, mesaj3 , 0);
		System.out.println("mesaj3: " + mesaj3);
		
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf('a'));
		
		System.out.println();
		System.out.println();
		System.out.println("2.video");
		System.out.println();
		System.out.println();
		
		//2.video
		
		System.out.println(mesaj.replace(' ', '-'));
		
		System.out.println(mesaj.substring(2, 4));
		
		System.out.println(mesaj.toLowerCase());
		
		System.out.println(mesaj.toUpperCase());
		
		
		
		
		
		
	}

}
