package ex_2_2_5;

public class BreakLoop {
	public static void main(String[] argStrings) {
		int i = 0;
	do {
		System.out.println("sonsuz dongu");
		if(i>5)
			break;
		i++;
		
	} while (true);
	}
}
