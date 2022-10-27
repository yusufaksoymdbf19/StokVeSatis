package ch2;
//soru: ivme hesapla v1,v2 al, zaman al, ivme ciktisini ver.
import java.util.Scanner;
public class Soru9 {
	public static void main(String[] args) {//22
		Scanner scanner = new Scanner(System.in);
		double v1,v2,zaman,ivme;
		System.out.print("son hizi giriniz:");
		v2 = scanner.nextDouble();
		System.out.print("ilk hizi giriniz:");
		v1 = scanner.nextDouble();
		System.out.print("Zaman giriniz:");
		zaman = scanner.nextDouble();
		ivme = (v2-v1)/zaman;
		System.out.printf("ivmemiz: %.2f",ivme);
		scanner.close();
		
	}
}
