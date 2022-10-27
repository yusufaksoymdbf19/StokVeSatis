import java.util.EnumSet;
public class EnumTest {
	public static void main(String[] args) {
		System.out.println("Tum kitaplar:");
		for(Book book : Book.values()) {
			System.out.printf("%-10s%-45s%s%n",book,book.getBaslik(),book.getTelifYili());
		}
		System.out.printf("%n enumun rangeini yazdirmak %n");
		for(Book book : EnumSet.range(Book.CPPHTP,Book.JHTP)) {
			System.out.printf("%-10s%-45s%s%n",book,book.getBaslik(),book.getTelifYili());
		}
	}
}
