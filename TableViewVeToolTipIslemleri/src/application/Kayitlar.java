package application;

public class Kayitlar {//harici s�n�f i�in kay�tlar nas�l olusturulur?
	//hangi attributlar eklenecek?
		//tablodaki s�tunlar attribute olarak eklenecek.
		private int id;
		private String kul_ad;
		private String sifre; 
	public Kayitlar() {
	//bo� constructur ne i�in gereklidir?
	//tablodan veri almak, labelda g�stermek i�in...
		// TODO Auto-generated constructor stub
		//
	}
	//attributlar� parametre olarak alacak olan bir constructor nas�l yap�l�r?
	//constructor fonksiyon nedir?
	//s�n�f ismiyle ayn� isme sahip olan nesne baslat�ld�g�nda baslayan fonksiyondur.
	public Kayitlar(int columnId, String columnKul_Adi, String columnSifre){
		this.id = columnId;
		this.kul_ad = columnKul_Adi;
		this.sifre = columnSifre;
	}
	//eclipsede getter ve setter nas�l verilir?
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKul_ad() {
		return kul_ad;
	}
	public void setKul_ad(String kul_adi) {
		this.kul_ad = kul_adi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	//constructorlar�n eri�im d�zenleyicisi ne olmak zorunda?
	//public.
	
	
	

}
