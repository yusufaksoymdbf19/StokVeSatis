package tr.com.yusuf.types;

public class KategoriContract {
	private int id;
	private String adi;
	private int parentId;
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
	public int getParentId() {
		return this.parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	@Override
	public String toString() {
		return String.format("%d %s %d", this.id, this.adi, this.parentId);
	}
	
}
