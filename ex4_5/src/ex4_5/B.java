package ex4_5;

public class B extends A {
	int k;
	public B() {
		super();
		k=0;
	}
	public B(int i, int j,int k) {
		super(i, j);
		this.k=k;
		// TODO Auto-generated constructor stub
	}
	public void show() {
		super.show();
		System.out.println("k: "+this.k);
	}
}