package ztavLTynCqM9By3x;
public class UseStatic{
	static int a=3;
	static int b=4;
	static void meth(int x) {
		System.out.println("x= " + x);
		System.out.println("a= " + UseStatic.a);
		System.out.println("b= " + UseStatic.b);
	}
	static {
		System.out.println("Statik blok baslatildi.");
		b= a*4;
	}
	public static void main(String[] argStrings) {
		StaticDemo.callme();
		System.out.println("StaticDemo.a="+StaticDemo.a);
	}
	
	
}
	

