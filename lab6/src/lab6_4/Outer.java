package lab6_4;

public class Outer {
	public void display() {
		System.out.println("outer");
		Inner inner = new Inner();
		inner.display();
	}
	public class Inner{
		public void display() {
			System.out.println("inner");
		}
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.display();
	}
}
