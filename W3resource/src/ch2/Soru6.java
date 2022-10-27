package ch2;
//basamaklarin toplamini bul. 
//burdayim...
import java.util.Scanner;
public class Soru6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int girilenSayi = scanner.nextInt();
		int temp = girilenSayi;
		int basamak=0;
		int toplam = 0;
		while(temp>0) {
			basamak = temp%10;
			toplam+=basamak;
			temp/=10;
		}
		System.out.printf("basamaklarin toplami: %d",toplam);
		
	}
}
