//2
public class Time1Test {
	public static void zamaniGoruntule(String baslik, Time1 time1) {
		System.out.printf("%s%nEvrensel zaman: %s%n Standart Zaman: %s%n",baslik,
				time1.toUniversalTimeString(),
				time1.toString());
	}
	public static void main(String[] args) {
		Time1 time1 = new Time1();
		zamaniGoruntule("zaman nesnesi olusturduktan sonra zaman:",time1);
		System.out.println();
		time1.setTime(13,27,6);
		zamaniGoruntule("setTime cagrildiktan sonra:",time1);
		System.out.println();
		try {
			time1.setTime(99,99,99);
			
		}catch(IllegalArgumentException illegalArgumentException) {
			System.out.printf("Exception: %s%n%n",illegalArgumentException.getMessage());
			
		}
		zamaniGoruntule("gecersiz degerler ile setTime'ý cagýrmak",time1);
	}
}
