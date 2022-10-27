package tr.com.yusuf.types;

public class MusteriContract {
	private int id;
	private  String adSoyad;
	private String telefon;
	private String adres;
	private int sehirId;
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdSoyad() {
		return this.adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public String getTelefon() {
		return this.telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getAdres() {
		return this.adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public int getSehirId() {
		return this.sehirId;
	}
	public void setSehirId(int sehirId) {
		this.sehirId = sehirId;
	}
	@Override
	public String toString() {
		return String.format("%d %s %s %s %d",this.id,this.adSoyad,this.telefon,this.adres,this.sehirId);
	}
	
	
}
