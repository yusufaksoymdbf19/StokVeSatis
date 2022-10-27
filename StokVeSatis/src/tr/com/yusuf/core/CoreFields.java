package tr.com.yusuf.core;

public class CoreFields {
	private String userName="root";
	private String password="";
	private String url = "jdbc:mysql://localhost/satisvestok/?useUnicode=true&characterEncoding=UTF-8";
	public String getUserName() {
		return this.userName;
	}
	public String getPassword() {
		return this.password;
	}
	public String getUrl() {
		return this.url;
	}
}
