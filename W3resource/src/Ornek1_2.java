//ismi kullanicidan al.
import java.util.Scanner;
public class Ornek1_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("isim? :");
		String isim = scanner.nextLine();
		System.out.printf("Merhaba\n%s",
				isim);
		
	}
}
