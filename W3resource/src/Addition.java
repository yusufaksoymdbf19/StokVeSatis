import java.util.Scanner;
public class Addition{//4
	public static void main(String[] args) {
		int birinciSayi, ikinciSayi,toplam=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci sayi:");
		birinciSayi = scanner.nextInt();
		System.out.print("Ikinci sayi:");
		ikinciSayi = scanner.nextInt();
		toplam = birinciSayi + ikinciSayi;
		System.out.println("Sayilarin toplami: "+toplam);
	}
}