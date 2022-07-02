/**
 * 
 */
package ex4_4;

/**
 * @author Yusuf
 *
 */
public class B extends A {

	/**
	 * 
	 */
	int k;
	public B() {
		// TODO Auto-generated constructor stub
		this.i=0;
		this.j=0;
		this.k=0;
	}

	/**
	 * @param i
	 * @param j
	 */
	public B(int i, int j,int k) {
		
		this.i=i;
		this.j=j;
		this.k = k;
		// TODO Auto-generated constructor stub
	}
	void show() {
		System.out.println("i: "+this.i+" j: "+this.j);
		System.out.println("k: "+this.k);
	}

}
