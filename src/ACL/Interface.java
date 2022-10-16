package ACL;

public class Interface {
	private AccessControlList acl = new AccessControlList();
	private Room[] doors = {new Room("Room1"), new Room("Room2"), new Room("Room3"), new Room("Main")};
	private Employee[] emps = {new Employee("Andy"), new Employee("Bri"), new Employee("Josh")};
	
	public static void main(String[] args){
		this.acl.push(new Entry(doors[0],emps[0]));
		
	}
	
	
}
