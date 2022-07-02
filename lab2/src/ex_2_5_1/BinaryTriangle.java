package ex_2_5_1;

public class BinaryTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kString = "1",lString="", sString="";
		int m = 0;
		int n = 5;
		for (int i = 0; i < n; i++) {
			
			for (int j = 1; j < m; j++) {
				lString += "0";
			}
			System.out.println(kString+lString+sString);
			sString="1";
			lString="";
			m+=2;
		}
	}

}
