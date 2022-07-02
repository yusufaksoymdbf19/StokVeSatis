package ex3_4_ikinciKisim;

public class ThisReturn {

	private int i;
	ThisReturn Arrtýr() {
		this.i = this.i+1;
		return this;
	}
	public void Yazdir() {
		System.out.println("I nin degeri: "+this.i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisReturn thisReturn = new ThisReturn();
		thisReturn.Arrtýr().Arrtýr().Arrtýr().Arrtýr().Yazdir();
	}

}
