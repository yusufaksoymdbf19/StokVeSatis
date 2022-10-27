package tr.com.yusuf.types;
import java.sql.Date;
public class StokContract {
	private int id;
	private int personelId;
	private int urunId;
	private Date tarih;
	private int adet;
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int  getPersonelId() {
		return this.personelId;
	}
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}
	public int getUrunId() {
		return this.urunId;
	}
	public void setUrunId(int urunId) {
		this.urunId = urunId;
	}
	public Date getTarih() {
		return this.tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	public int getAdet() {
		return this.adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	@Override
	public String toString() {
		return String.format("%d %d %d %s %d",this.id,this.personelId, this.urunId,this.tarih,this.adet);
	}
}
