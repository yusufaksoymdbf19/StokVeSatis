
import java.util.Calendar;
import java.util.GregorianCalendar;

public class IsciTest {
	public static void main(String[] args) {
	
		Calendar dogumTarihi = new GregorianCalendar(2001,6,21);
		Calendar iseAlisTarihi = new GregorianCalendar(2022,5,4);
		Isci isci = new Isci("Yusuf","Aksoy",dogumTarihi,iseAlisTarihi);
		System.out.println(isci);
		
		
	}
}
