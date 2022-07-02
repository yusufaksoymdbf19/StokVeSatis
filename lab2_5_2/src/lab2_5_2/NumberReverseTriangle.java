package lab2_5_2;
public class NumberReverseTriangle {
	public static void main(String[] argStrings) {
		String kString = "";
		int n = 5;
		for(int i=5;i>=0;i--) {
			kString= i+""+kString;
			System.out.println(kString);
		}
	}
}