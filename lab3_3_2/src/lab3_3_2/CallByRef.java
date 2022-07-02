/**
 * 
 */
package lab3_3_2;

/**
 * @author Yusuf
 *
 */
public class CallByRef {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test(3, 5);
		System.out.println("once a:"+test.a+" test.b="+test.b);
		test.meth(test);
		System.out.println("sonra a:"+test.a+" test.b="+test.b);
	}

}
