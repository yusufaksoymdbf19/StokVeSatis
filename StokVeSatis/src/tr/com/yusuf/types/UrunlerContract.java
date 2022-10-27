package tr.com.yusuf.types;
import java.sql.Date;
public class UrunlerContract {
	//id, ad, kategoriID, tarih
	private int id;
	private String ad;
	private int kategoriId;
	private Date tarih;
	private float fiyat;
	public float getFiyat() {
		return this.fiyat;
		}
	public void setFiyat(float fiyat) {
		this.fiyat = fiyat;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return this.ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getKategoriId() {
		return this.kategoriId;
	}
	public void setKategoriId(int kategoriId) {
		 this.kategoriId = kategoriId;
	}
	public Date getTarih() {
		return this.tarih;
	}
	public void setDate(Date tarih) {
		this.tarih = tarih;
	}
	@Override
	public String toString() {
		return id + " " + ad + " " + kategoriId + " " + tarih;
	}
	
}
