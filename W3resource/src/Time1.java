//1 
public class Time1 {
	private int saat;
	private int dakika;
	private int saniye;
	public void setTime(int saat, int dakika, int saniye) {
		if(saat>=24 || saat <0 || dakika>=60 || dakika <0 || saniye>=60 || saniye < 0) {
			throw new IllegalArgumentException("saat dakika ve/ya da saniye aralıklarinin disinda... ");
		}
		this.saat = saat;
		this.dakika = dakika;
		this.saniye = saniye;
	}
	public String toUniversalTimeString() {
		return String.format("%02d:%02d:%02d",saat, dakika, saniye);
	}
	public String toString() {
		return String.format("%d:%02d:%02d %s",((saat==0 || saat == 12)?12:saat%12),
				dakika,saniye,(saat<12 ? "A.M." : "P.M."));
	}
}
