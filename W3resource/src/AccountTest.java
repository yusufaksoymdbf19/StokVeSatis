import java.util.Scanner;
public class AccountTest {//1,2,3,5
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*Account myAccount = new Account();
		System.out.printf("ilk isim: %s%n%n",myAccount.getIsim());
		System.out.printf("isim giriniz:");
		String isim = scanner.nextLine();
		myAccount.setIsim(isim);
		System.out.println();
		System.out.printf("myAccount icindeki nesnenin adi: %s",myAccount.getIsim());*/
		Account account1 = new Account("Yusuf Aksoy",50.00);
		Account account2 = new Account("John Wick",-7.53);
		System.out.printf("%s  bilancosu:  %.2f%n",account1.getIsim(),account1.getBilanco());
		System.out.printf("%s bilancosu: %.2f %n",account2.getIsim(),account2.getBilanco());
		System.out.print("depozito miktari giriniz:");
		double girilenDepozito = scanner.nextDouble();
		System.out.printf("account1 bilancosuna %.2f  ekleniyor.%n",girilenDepozito);
		account1.depozito(girilenDepozito);
		System.out.printf("%s bilancosu: %.2f%n",account1.getIsim(),account1.getBilanco());
		System.out.printf("%s bilancosu %.2f", account2.getIsim(),account2.getBilanco());
	}
}
