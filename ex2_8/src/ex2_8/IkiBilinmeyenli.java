package ex2_8;

public class IkiBilinmeyenli {
	double a,b,c;
	public IkiBilinmeyenli(int a,int b,int c) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void KokHesapla() {
		double r1,r2,d,rp,ri;
		d= b*b-4*a*c;
		if (d<0) {
			rp = -b/(2.0*a);
			ri = Math.sqrt(Math.abs(d))/(2*a);
			System.out.println("karmasik kökler var:");
			System.out.println("kök1 = "+rp+"i+" + ri);
			System.out.println("kök2 = "+rp+"i"+(-1)*ri  );
			
		}
		 if (d==0) {
			r1 = -b/(2*a);
			System.out.println("tek kök var.");
			System.out.println("kök1 = kök2 :" +r1);
			 
		}
		if(d>0) {
			r1 = (-b+Math.sqrt(d))/(2.0*a);
			r2 = (-b-Math.sqrt(d))/(2.0*a);
			System.out.println("Birinci Kok: "+r1);
			System.out.println("Ikinci kok:"+r2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IkiBilinmeyenli birinciIkiBilinmeyenli = new IkiBilinmeyenli(1, -4, 4);
		IkiBilinmeyenli ikincIkiBilinmeyenli = new IkiBilinmeyenli(31,31,31);
		birinciIkiBilinmeyenli.KokHesapla();
		ikincIkiBilinmeyenli.KokHesapla();
		
		
	}

}
