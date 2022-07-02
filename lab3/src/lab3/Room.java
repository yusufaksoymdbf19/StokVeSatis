package lab3;

public class Room {
	public int roomNo;
	public int roomType;
	public int roomArea;
	public int ACMachine;
	public void setData(int roomNo, int roomType, int roomArea, int ACMachine) {
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.ACMachine = ACMachine;
	}
	public void displayData() {
		System.out.println("oda nosu: " + this.roomNo);
		System.out.println("oda tipi: " + this.roomType);
		System.out.println("oda bolgesi: " + this.roomArea);
		System.out.println("AC Makinesi: " + this.ACMachine);
	}
}
