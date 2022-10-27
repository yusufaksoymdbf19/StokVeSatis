import java.util.Scanner;
public class Comparison {//5
	public static void main(String[] args) {
		//sayilari karsilastir.
		int birinciSayi;
		int ikinciSayi;
		Scanner scanner = new Scanner(System.in);
		System.out.print("birinci sayiyi giriniz:");
		birinciSayi = scanner.nextInt();
		System.out.print("ikinci sayiyi giriniz:");
		ikinciSayi = scanner.nextInt();
		if(birinciSayi>ikinciSayi) {
			System.out.println("birinci sayi ikinci sayidan buyuk.");
		}
		 if(birinciSayi<ikinciSayi) {
			System.out.println("birinci sayi ikinci sayidan kucuktur.");
		}
		if(birinciSayi==ikinciSayi) {
			System.out.println("birinci sayi ve ikinci sayi birbirine esittir.");
		}
		if(birinciSayi<=ikinciSayi) {
			System.out.printf("birinci sayi <= ikinci sayi%n");
		}
		if(birinciSayi>=ikinciSayi) {
			System.out.println("birinci sayi >= ikinci sayi");
		}
		if(birinciSayi != ikinciSayi) {
			System.out.println("birinci sayi != ikinci sayi");
		}
		
	}
}
