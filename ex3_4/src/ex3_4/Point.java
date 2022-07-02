package ex3_4;

public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	void displayPoint() {
		System.out.println("X'in degeri: "+this.x);
		System.out.println("Y'nin degeri: "+this.y);
	}
	public static void main(String[] argStrings) {
		Point point = new Point(3, 4);
		point.displayPoint();
	}
}
