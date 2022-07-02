package ex4_5;
public class A {
	int i,j;
	public A() {
		this.i = 0;
		this.j=0;	
	}
	public A(int i, int j) {
		this.i = i;
		this.j = j;
	}
	void show() {
		System.out.println("i: "+this.i+" j: "+this.j);
	}
}