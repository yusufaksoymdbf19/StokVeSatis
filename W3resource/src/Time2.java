
public class Time2 {
	private int saat;
	private int dakika;
	private int saniye;
	public Time2(int saat, int dakika, int saniye){
		if(saat>=24 || saat<0) {
			throw new IllegalArgumentException("aralik 0<saat<24 olmali.");
		}
		if(dakika>=60 || dakika < 0)
			throw new IllegalArgumentException("aralik 0<dakika<60 olmali.");
		if(saniye>=60 || saniye<0)
			throw new IllegalArgumentException("aralik 0<saniye<60 olmali.");
		this.saat = saat;
		this.dakika = dakika;
		this.saniye = saniye;
		
	}
	public Time2(int saat, int dakika){
		this(saat,dakika,0);
	}
	public Time2(int saat){
		this(saat,0,0);
	}
	public Time2(){
		this(0,  0, 0);
	}
	public Time2(Time2 time2) {
		this(time2.getSaat(),time2.getDakika(),time2.getSaniye());
	}
	public int getSaat() {
		return this.saat;
	}
	public void setSaat() {
		if(saat>=24 || saat<0)
			throw new IllegalArgumentException("aralik 0-23 olmali.");
	}
	public int getDakika() {
		return this.dakika;
	}
	public void setDakika(int dakika) {
		if(dakika>=60 || dakika<0)
			throw new IllegalArgumentException("dakika araligi 0-59 olmali");
		this.dakika = dakika;
	}
	public int getSaniye() {
		return this.saniye;
	}
	public void setSaniye(int saniye) {
		if(saniye<0 || saniye>=60)
			throw new IllegalArgumentException("saniye araligi 0-59 olmali.");
	}
	public void setTime(int saat, int dakika, int saniye) {
		if(saat>=24 || saat<0) {
			throw new IllegalArgumentException("saat araligi 0-23 olmali.");
		}
		if(dakika<0 || dakika>=60)
			throw new IllegalArgumentException("dakika araligi 0-59 olmali.");
		if(saniye<0 || saniye>=60)
			throw new IllegalArgumentException("saniye araligi ");
		this.saat = saat;
		this.dakika = dakika;
		this.saniye = saniye;
	}
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d",getSaat(),getDakika(),getSaniye());
	}
	public String toString() {
		return String.format("%d:%02d:%02d %s",(getSaat()==0||getSaat()==12?12:getSaat()%12),
				getDakika(),getSaniye(),(getSaat()<12?"AM":"PM"));
		
	}
}
