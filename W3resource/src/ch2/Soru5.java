package ch2;
//bahsis oranini hesapla
import java.util.Scanner;
public class Soru5 {
	public static void main(String[] args) {
		double bahsisOrani, altToplam,toplam;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bahsis orani giriniz:");
		bahsisOrani = scanner.nextDouble();
		System.out.print("alt toplami giriniz:");
		altToplam = scanner.nextDouble();
		toplam = altToplam + bahsisOrani*0.01;
		System.out.println("Sonuc = "+toplam);
		//yanlis duzelt.
		
		
	}
}
