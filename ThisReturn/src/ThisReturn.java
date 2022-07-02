
public class ThisReturn {
	private int i = 0;
	ThisReturn arttirmak(){
		++i;
		return this;
	}
	public void yazdir() {
		System.out.println("i nin degeri: " + i);
	}
	
	
}
