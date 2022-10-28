package application;

public class Room {
	
	private String roomName;
	
	public Room(String name) {
		this.roomName = name;
	}
	
	public String getRoomName(){
		return roomName;
	}
	
	private void setRoom(String name){
		roomName = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Room) {
			if (getRoomName().equals(((Room)o).getRoomName())) return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return getRoomName();
	}
	
	public static void main(String[] args) {
		Room r = new Room("room1");
		System.out.println(r);
		r.setRoom("room2");
		System.out.println(r);
	}
	
}
