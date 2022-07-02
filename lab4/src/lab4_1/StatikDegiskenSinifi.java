package lab4_1;

public class StatikDegiskenSinifi {
	public static int degisken = 0;
	public static void yazdir(int sayac) {
		for (int i = 0; i < sayac; i++) {
			System.out.println("bu bir statik fonksiyondur.");
			System.out.println("degisken = " + ++degisken);
		}
		
	}
	static {
		System.out.println("bu bir statik bloktur.");
	}
	
}
