package lab3_2;

public class Simpleobject {
	
	
	public Simpleobject() {
		// TODO Auto-generated constructor stub
		System.out.println("Argumansiz yapici.");
	}
	public Simpleobject(int a)
	{
		System.out.println("Argumanli yapici: "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Simpleobject();
		new Simpleobject(555);
	}

}
