package lab2_6_1;

public class basamakToplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, s;
		i=17255;
		s=0;
		while (i>10) {
			s+=(i%10);
			i/=10;
		}
		s+=i;
		System.out.println("basamaklarin toplami: "+s);
	}

}
