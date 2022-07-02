package ztavLTynCqM9By3x;
public class Room {
	int roomNo;
	int roomType;
	int acMachine;
	
	public void SetData(int roomNo, int roomType, int acMachine){
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.acMachine = acMachine;
	}
	public void DisplayData(){
		System.out.println("Oda Numarasi: " + this.roomNo);
		System.out.println("Oda Tipi: " + this.roomType);
		System.out.println("AC Makinesi: " + this.acMachine);
	}
}
