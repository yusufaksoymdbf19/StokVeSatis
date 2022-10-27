
public class Account { //6,4
	private String isim;
	private double bilanco;
	
	public Account(String isim,double bilanco) {
		this.isim = isim;
		if(bilanco>0)
		this.bilanco = bilanco;
	}
	public void depozito(double depozitoMiktari) {
		if(depozitoMiktari>0.0) {
			bilanco = bilanco + depozitoMiktari;
		}
	}
	public double getBilanco() {
		return this.bilanco;
	}
	public void setBilanco(double bilanco) {
		this.bilanco = bilanco;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getIsim() {
		return this.isim;
	}
	
}
