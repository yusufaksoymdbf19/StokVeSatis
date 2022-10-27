//Fig 8_7
public class Date {
	private int gun;
	private int ay;
	private int yil;
	public static final int[] ayBasinaGunler = { 0,31,28,31,30,31,30,31,31,30,31,30,31};
	public Date(int gun, int ay, int yil) {
		if(ay<=0||ay>12) throw new IllegalArgumentException("ay("+ay+") 1-12 araliginda olmali.");
		if(gun<=0||(gun>ayBasinaGunler[ay]&&!(ay==2&&gun==29)))
			throw new IllegalArgumentException("gun("+gun+") belirtilmis ay ve yil icin aralik disindadir.");
		if(ay==2&&gun==29&&!(yil%400==0||(yil%4==0&&yil%100!=0))){
			throw new IllegalArgumentException("belirtilmis ay ve yil icin menzil disinda...");
		}
		this.gun = gun;
		this.ay = ay;
		this.yil = yil;
		System.out.printf("Date nesne yapicisi date icin. %s%n",this);
	}
	public String toString(){
		return String.format("%d/%d/%d",ay,gun,yil);
	}
}
