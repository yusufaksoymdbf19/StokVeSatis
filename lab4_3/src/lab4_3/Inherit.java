/**
 * 
 */
package lab4_3;

/**
 * @author Yusuf
 *
 */
public class Inherit {

	/**
	 * 
	 */
	public Inherit() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A superOb = new A();
		B subOb = new B();
		superOb.i=10;
		superOb.j=20;
		System.out.println("superobun icerigi: "+superOb.i+" ,"+superOb.j);
		superOb.showij();
		System.out.println();
		subOb.i = 444;
		subOb.j=5345;
		subOb.k=45345;
		System.out.println("subob'un icerigi: ");
		subOb.showij();
		subOb.showK();
		System.out.println();
		System.out.println("subob daki i,j,k'nin toplami: ");
		subOb.toplam();
	}

}
