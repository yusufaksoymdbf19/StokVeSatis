package lab6_1;

public class MyClass implements A {
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
	}
	public static void main(String[] argStrings) {
		MyClass myClass = new MyClass();
		myClass.meth1();
		myClass.meth2();
	}
}
