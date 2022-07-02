package application;

public class Kayitlar {
	private int id;
	private String kul_adi;
	private String sifre;
	private int yetki;
	
	public Kayitlar() {
		// TODO Auto-generated constructor stub
		this.kul_adi="empty";
		this.sifre="0000";
		this.yetki=1;
	}
	public Kayitlar(int id, String kul_adi, String sifre, int yetki){
		this.id = id;
		this.kul_adi = kul_adi;
		this.sifre = sifre;
		this.yetki = yetki;
	}	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKul_adi() {
		return kul_adi;
	}

	public void setKul_adi(String kul_adi) {
		this.kul_adi = kul_adi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public int getYetki() {
		return yetki;
	}

	public void setYetki(int yetki) {
		this.yetki = yetki;
	}


	

}
