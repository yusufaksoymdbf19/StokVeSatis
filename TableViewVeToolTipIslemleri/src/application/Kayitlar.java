package application;

public class Kayitlar {//harici sýnýf için kayýtlar nasýl olusturulur?
	//hangi attributlar eklenecek?
		//tablodaki sütunlar attribute olarak eklenecek.
		private int id;
		private String kul_ad;
		private String sifre; 
	public Kayitlar() {
	//boþ constructur ne için gereklidir?
	//tablodan veri almak, labelda göstermek için...
		// TODO Auto-generated constructor stub
		//
	}
	//attributlarý parametre olarak alacak olan bir constructor nasýl yapýlýr?
	//constructor fonksiyon nedir?
	//sýnýf ismiyle ayný isme sahip olan nesne baslatýldýgýnda baslayan fonksiyondur.
	public Kayitlar(int columnId, String columnKul_Adi, String columnSifre){
		this.id = columnId;
		this.kul_ad = columnKul_Adi;
		this.sifre = columnSifre;
	}
	//eclipsede getter ve setter nasýl verilir?
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
	
	//constructorlarýn eriþim düzenleyicisi ne olmak zorunda?
	//public.
	
	
	

}
