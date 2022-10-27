package tr.com.yusuf.types;
import java.sql.Date;
public class SatisContract {
	private int id;
	private int musteriId;
	private int personelId;
	private int urunId;
	private int adet;
	private Date tarih;
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMusteriId() {
		return this.musteriId;
	}
	public void setMusteriId(int musteriId) {
		this.musteriId = musteriId;
	}
	public int getUrunId() {
		return this.urunId;
	}
	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}
	public int getPersonelId() {
		return this.personelId;
	}
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}
	public int getAdet() {
		return this.adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	public Date getTarih() {
		return this.tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	@Override
	public String toString() {
		return String.format("%d %d %d %d %d %s",this.id, this.musteriId,this.personelId,this.urunId,this.adet,this.tarih);
	}
}
