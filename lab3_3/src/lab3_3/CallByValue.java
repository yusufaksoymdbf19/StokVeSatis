/**
 * 
 */
package lab3_3;
/**
 * @author Yusuf
 *
 */
public class CallByValue {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		int a =15,b=20;
		System.out.println("cagirmadan once: a="+a+"b="+b);
		test.meth(a, b);
		System.out.println("cagirdiktan sonra: a="+a+"b="+b);
	}
}
