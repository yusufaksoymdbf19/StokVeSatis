public enum Book{
	CPPHTP("c++ how to program","2015"),
	CHTP("C HOW TO PROGRAM","2013"),
	IW3HTP("INTERNET & WORLD WIDE WEB HOW TO PROGRAM","2012"),
	JHTP("Java How To Program","2015"),
	VBHTP("Visual Basic How To Program","2014"),
	CSHARPHTP("Visual C# how to program","2014");
	private  String baslik;
	private String telifYili;
	Book(String baslik,String telifYili){
		this.baslik = baslik;
		this.telifYili = telifYili;
	}
	public String getBaslik() {
		return this.baslik;
	}
	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}
	public String getTelifYili() {
		return this.telifYili;
	}
	public void setTelifYili(String telifYili) {
		this.telifYili = telifYili;
	}
	

}
	
	

		
