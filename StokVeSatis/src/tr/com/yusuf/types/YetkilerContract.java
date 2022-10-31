package tr.com.yusuf.types;

public class YetkilerContract {
	private int id;
	private String adi;
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getAdi() {
		return this.adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	@Override
	public String toString() {
		return id + " " + adi;
	}
}
