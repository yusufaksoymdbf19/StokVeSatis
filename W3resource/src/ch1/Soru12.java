package ch1;

public class Soru12 {
	public static void main(String[] args) {
		double saat = 1;
		double dakika = 40;
		double saniye = 35;
		double mesafeMilCinsinden = 24;
		
		double mesafeKmCinsinden = mesafeMilCinsinden * 1.60934;
		double zamanSaatCinsinden = saat + dakika/60.0 + saniye / (60.0*60.0);
		System.out.println("km/h cinsinden  " + mesafeKmCinsinden / zamanSaatCinsinden);
		
	
	}
}
