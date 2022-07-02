package lab6_5;
import java.util.ArrayList;

public class Uygulama_LocalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YerelSiniflar.TelefonDogrula("5555555555");
		YerelSiniflar.TelefonDogrula("555vv5555555");
		YerelSiniflar.TelefonDogrula("555525555");
		YerelSiniflar.TelefonDogrula("555525g555");
		YerelSiniflar.TelefonDogrula("55511525g555");
		System.out.println(YerelSiniflar.regularIfade);
		
		//YerelSiniflar.TelefonDogrula("").TelefonNumarasi;
		//Locall class kullanimi icin icerisinde bulundugu fonksiyon tetiklenmelidir
		ArrayList<Integer> c=new ArrayList<>(5);
		for(int i = 0; i < 1000; i++) {
			c.add(i*i);
			}
		for (Integer integer : c) {
			System.out.println(integer);
		}
		System.out.println(c.size());
		
	}

}