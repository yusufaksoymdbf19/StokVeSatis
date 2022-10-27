
public class ThisTest {
	public static void main(String[] args) {
		SimpleTime simpleTime = new SimpleTime(10,12,13);
		System.out.println(simpleTime.buildString());
		
	}
}
class SimpleTime{
	private int saat;
	private int dakika;
	private int saniye;
	public SimpleTime(int saat, int dakika, int saniye) {
		this.saat = saat;
		this.dakika = dakika;
		this.saniye = saniye;
		
		
	}
	public String buildString() {
		return String.format("%24s: %s%n%24s:%s",
				"this.toUniversalString()", this.toUniversalString(),
				"toUniversalString()",toUniversalString());
		
	}
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d",this.saat,this.dakika, this.saniye);
		
	}
	
}