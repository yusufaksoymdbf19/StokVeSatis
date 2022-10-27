package tr.com.yusuf.types;

public class AccountsContact {
	private int id;
	private int yetkiId;
	private String sifre;
	private int personelId;
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYetkiId() {
		return this.yetkiId;
	}
	public void setYetkiId(int yetkiId) {
		this.yetkiId = yetkiId;
	}
	public String getSifre() {
		return this.sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public int getPersonelId() {
		return this.personelId;
	}
	public void setPersonelId(int personelId) {
		this.personelId = personelId;
	}
	@Override
	public String toString() {
		return String.format("%s %s %s %s",this.id,this.personelId,this.sifre,this.yetkiId);
	}
	
	
	
}
