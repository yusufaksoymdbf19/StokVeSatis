package ch2;
//girdi dakika olacak, yil, ay, gun olarak cikti verecek
import java.util.Scanner;
public class Soru7 {
	public static void main(String[] args) { //20
		Scanner scanner = new Scanner(System.in);
		System.out.print("dakika giriniz:");
		long dakika = scanner.nextLong();
		long birYilDakikaCinsi = 365 * 24 * 60;
		long yil = (long)(dakika/birYilDakikaCinsi);
		int  gun = (int)(dakika/60/24)%365;
		System.out.printf("%d dakika yaklasik %d yil %d gun eder.",(int)dakika,yil,gun);
		
	}
}
