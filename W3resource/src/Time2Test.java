
public class Time2Test {
	public static void main(String[] args) {
		Time2 t1 = new Time2();
		Time2 t2 = new Time2(2);
		Time2 t3 = new Time2(2,3);
		Time2 t4 = new Time2(4,5,6);
		Time2 t5 = new Time2(t4);
		System.out.println("Constructed with");
		displayTime("t1: tum varsayilan elemanlar",t1);
		displayTime("t2: sadece saat belirtilmis",t2);
		displayTime("t3: sadece saat ve dakika belirtilmis",t3);
		displayTime("t4: saat dakika ve saniye belirtilmis",t4);
		displayTime("t5: t4 nesnesi icine koyulmus.",t5);
		try {
			Time2 t6 = new Time2(35,87,446);
		}catch(IllegalArgumentException e) {
			System.out.println("t6yi baslatirken hata: "+e.getMessage()+"\n\n");
		}
	}
	private static void displayTime(String baslik, Time2 time2) {
		System.out.printf("%s%n  %s%n  %s%n",baslik,time2.toUniversalString(),time2.toString());
	}
}
