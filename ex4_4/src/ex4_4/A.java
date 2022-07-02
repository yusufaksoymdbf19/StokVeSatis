package ex4_4;

public class A {
	public int i, j;
	public A() {
		// TODO Auto-generated constructor stub
		i=0;
		j=0;
		
	}
	public A(int i,int j) {
		this.i=i;
		this.j=j;
	}
	void show() {
		System.out.println("i: "+this.i+" j: "+this.j);
	}
}
