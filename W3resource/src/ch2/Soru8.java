package ch2;
/*soru:(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that
*      displays the current time in GMT. Revise the program so that it prompts
*      the user to enter the time zone offset to GMT and displays the time in
*      the specified time zone.*/
import java.util.Scanner;
public class Soru8 {
	public static void main(String[] args) {//21
		Scanner scanner = new Scanner(System.in);
		System.out.print("GMTye gore zaman farkini girin:");
		long zamanBolgesiDegisimi = scanner.nextLong();
		long toplamMiliSaniye = System.currentTimeMillis();
		long toplamSaniye = toplamMiliSaniye/1000;
		long toplamDakika = toplamSaniye/60;
		long simdikiSaniye = toplamSaniye%60;
		long simdikiDakika  = toplamDakika%60;
		long toplamSaat = toplamDakika / 60;
		long simdikiSaat = (toplamSaat+zamanBolgesiDegisimi)%24;
		System.out.printf("Simdiki saat: %d:%d:%d",simdikiSaat,simdikiDakika,simdikiSaniye);
	}
}
