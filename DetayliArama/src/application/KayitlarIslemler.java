package application;


import java.util.Date;
public class KayitlarIslemler {
	private int iId;
	private String user;
	private String islemAciklama;
	private Double islemTutar;
	private Date islemTarih;

	public KayitlarIslemler() {
		this.iId = 0;
		this.user = "bos";
		this.islemAciklama = "boþ";
		this.islemTutar = 0.0;
		this.islemTarih = new Date();
	}

	public KayitlarIslemler(int iId, String user, String islemAciklama, Double islemTutar, Date islemTarih) {
		this.iId = iId;
		this.user = user;
		this.islemAciklama = islemAciklama;
		this.islemTutar = islemTutar;
		this.islemTarih = islemTarih;
	}

	public int getIId() {
		return this.iId;
	}

	public void setIId(int iId) {
		this.iId = iId;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getIslemAciklama() {
		return this.islemAciklama;
	}

	public void setIslemAciklama(String islemAciklama) {
		this.islemAciklama = islemAciklama;
	}

	public Double getIslemTutar() {
		return this.islemTutar;
	}

	public void setIslemTutar(Double islemTutar) {
		this.islemTutar = islemTutar;
	}

	public Date getIslemTarih() {
		return this.islemTarih;
	}

	public void setIslemTarih(Date islemTarih) {
		this.islemTarih = islemTarih;
	}

}
