package ACL;

public class Interface {
	protected AccessControlList acl = new AccessControlList();
	protected Room[] doors = {new Room("Room1"), new Room("Room2"), new Room("Room3"), new Room("Main")};
	protected Employee[] emps = {new Employee("Andy"), new Employee("Bri"), new Employee("Josh")};
	
	public Room newDoor(int doornum) {
		if (doornum>=doors.length || doornum<0) return null;
		return doors[doornum];
	}
	
	
	
	public static void main(String[] args){
		
		Interface I = new Interface();
		I.acl.push(new Entry(I.newDoor(0),I.emps[0]));
		System.out.println(I.acl.peek());
		
	}
	
	
}
