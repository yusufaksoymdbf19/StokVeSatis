package lab4_1;

public class UseStatic {
	static int a=3;
	static int b;
	static void meth(int x) {
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("x: "+x);
	}
	static {
		System.out.println("Statik blok baslatildi.");
		b = a*4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth(422);
	}

}
