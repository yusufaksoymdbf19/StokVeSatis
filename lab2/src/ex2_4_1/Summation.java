package ex2_4_1;

public class Summation {
	public static void main(String[] argStrings) {
		int toplam =0;
		int gecersiz=0;
		for (int i = 0; i < argStrings.length; i++) {
			try {
				toplam+=Integer.parseInt(argStrings[i]);
				
			} catch (NumberFormatException numberFormatException) {
				// TODO: handle exception
				gecersiz++;
			}
		}
		System.out.println("Toplam argumanlarin sayisi: "+argStrings.length);
		System.out.println("gecersiz tamsayilar: "+gecersiz);
		System.out.println("toplam: "+toplam);
		
	}
}
