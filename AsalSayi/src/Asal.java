
public class Asal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n, lastn;
		double a;
		boolean flag=true;
		for (i = 2; i < 1000; i++) {
			a=i;
			a=Math.sqrt(a);
			lastn = (int)a;
			flag = true;
			for ( j = 2; j <= lastn; j++) {
				if (i!=j) {
					if (i%j==0) {
						flag=false;
						break;
					}
				}
			}
			if (flag) {
				System.out.println(i);
			}
			
		}
		
	}

}
