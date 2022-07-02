package ex_2_3_3;

public class ArrayCopy {

	static char a[] = {'H','E','L','L','O'};
	static char b[] = {'W','O','R','L','D'};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("arraycopyden önce a: ");
		System.out.println(a);
		System.out.print("arraycopyden önce b:");
		System.out.println(b);
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.print("arraycopyden sonra a: ");
		System.out.println(a);
		System.out.print("arraycopyden sonra b:");
		System.out.println(b);
	}

}
