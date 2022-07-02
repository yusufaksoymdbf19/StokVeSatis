package ex_2_2_3;

public class ForTest {
	public static void main(String[] argStrings) {
		int i = 0;
		int toplam = 0;
		for( i = 1; i <=10;i++) {
			toplam += i;
		}
		System.out.println("ilk 10 terimin toplamý:" + toplam);
	}
}
