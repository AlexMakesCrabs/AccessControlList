package ACL;

public class Room {
	
	private String roomName;
	
	public Room(String name) {
		this.roomName = name;
	}
	
	public String getRoom(){
		return roomName;
	}
	
	private void setRoom(String name){
		roomName = name;
	}
	
	@Override
	public String toString() {
		return getRoom();
	}
	
	public static void main(String[] args) {
		Room r = new Room("room1");
		System.out.println(r);
		r.setRoom("room2");
		System.out.println(r);
	}
	
}
