package tr.com.yusuf.types;

public class PersonelContract {
	private int id;
	private String adSoyad;
	private String email;
	
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
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	@Override
	public  String toString() {
		return this.id + " " + this.adSoyad + " " + this.email;
	}
	
}
