package ex1_2;

public class Default {
	private short shortVariable;
	//short, int, long, float, double, char, String, boolean access modifier: private  
	private int intVariable;
	private long longVariable;
	private float floatVariable;
	private double doubleVariable;
	private char charVariable;
	private String stringVariableString;
	private boolean booleanVariable;
	public static void main(String[] argStrings) {
		Default default1 = new Default();
		System.out.println("\n short variable: "+ default1.shortVariable);
		System.out.println("\n int variable: "+ default1.intVariable);
		System.out.println("\n long variable: " + default1.longVariable);
		System.out.println("\n float variable: "+default1.floatVariable);
		System.out.println("\n double variable: "+default1.doubleVariable);
		System.out.println("\n char variable: "+default1.charVariable);
		System.out.println("\n String variable: "+default1.stringVariableString);
		System.out.println("\n boolean variable: "+default1.booleanVariable);
	}
}
