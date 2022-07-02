package ex2_3_2;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[];
		int size = 5;
		num = new int[size];
		num[0]=3453;
		num[1] = 423;
		num[2]=444;
		num[3]=432;
		num[4]=34;
		for(int i = 0; i < num.length;i++) {
			System.out.println("num["+i+"]= "+num[i]);
		}
	}
}
