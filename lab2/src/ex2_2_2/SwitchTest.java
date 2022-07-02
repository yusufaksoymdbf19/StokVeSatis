package ex2_2_2;

public class SwitchTest {
	public static void  main(String[] argStrings) {
		char ch = 'B';
		switch (ch) {
		case 'A':
			System.out.println("A secildi.");
			break;
		case 'B':
			System.out.println("B secildi. ");
			break;
		case 'C':
			System.out.println("C secildi.");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
	}
}
