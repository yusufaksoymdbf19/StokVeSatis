package lab3_1;

public class Room {
	int roomNo;
	String roomTypeString;
	float roomArea;
	boolean acMachine;
	
	public void setData(int roomNo, String roomTypeString, float roomArea, boolean acMachine ) {
		this.roomNo = roomNo;
		this.roomTypeString = roomTypeString;
		this.roomArea = roomArea;
		this.acMachine = acMachine;
	}
	public void displayData() {
		System.out.println("The room no is: " + this.roomNo);
		System.out.println("The room type is:" + this.roomTypeString);
		System.out.println("The room area is: " + this.roomArea);
		String s = (acMachine) ? "Yes":"No";
		System.out.println("AC Machine needed:" + s);
	}
	public static void main(String[] argStrings) {
		Room room1 = new Room();
		room1.setData(101, "Deluxe", 240.0f, true);
		room1.displayData();
	}
	
}
