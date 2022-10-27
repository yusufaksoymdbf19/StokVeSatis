/*girilen 2sayý girdi olarak al.*/
import java.util.Scanner;
public class Ornek2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("ilk sayiyi gir:");
		int birinciSayi = input.nextInt();
		System.out.print("ikinci sayiyi gir:");
		int ikinciSayi = input.nextInt();
		int toplam = birinciSayi+ikinciSayi;
		System.out.printf("Sayilarin toplami: %d",toplam);
	}
}
