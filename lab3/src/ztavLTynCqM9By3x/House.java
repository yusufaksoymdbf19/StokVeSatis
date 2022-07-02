package ztavLTynCqM9By3x;

public class House {
	Room room;
	void createHouse() {
		this.room = new Room();
		
	}
	void displayHouse() {
		this.room.DisplayData();
		
	}
	public static void main(String[] aStrings) {
		House house = new House();
		house.createHouse();
		house.displayHouse();
		house.displayHouse();
	}

}
