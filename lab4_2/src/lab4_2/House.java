package lab4_2;
public class House {

	Room room;
	void CreateHouse() {
		this.room = new Room();
	}
	void DisplayHouse() {
		this.room.displayData();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house = new House();
		house.CreateHouse();
		house.DisplayHouse();
	}

}
