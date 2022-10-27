
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Isci {
	private String ad;
	private String soyad;
	private Calendar dogumTarihi;
	private Calendar iseAlisTarihi;
	private static int isciSayisi = 0;
	public Isci(String ad, String soyad, Calendar dogumTarihi, Calendar iseAlisTarihi) {
		this.ad = ad;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
		this.iseAlisTarihi = iseAlisTarihi;
		++isciSayisi;
	}
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MMM.yyyy");	
		return String.format("%s %s Ise alis tarihi: %s Dogum tarihi: %s",ad,soyad,sdf.format(iseAlisTarihi.getTime()),sdf.format(dogumTarihi.getTime()));
	}
	public int getIsciSayisi() {
		return this.isciSayisi;
	}
}
