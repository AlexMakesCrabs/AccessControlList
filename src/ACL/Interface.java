package ACL;

public class Interface {
	protected AccessControlList acl = new AccessControlList();
	protected Room[] rooms = {new Room("Room1"), new Room("Room2"), new Room("Room3"), new Room("Main")};
	protected Employee[] emps = {new Employee("Andy"), new Employee("Bri"), new Employee("Josh")};
	
	public Room getDoor(int doornum) {
		if (doornum>=rooms.length || doornum<0) return null;
		return rooms[doornum];
	}
	
	public Employee getEmp(String empName) {
		Employee e = new Employee(empName);
		for (int i = 0;i<emps.length;i++) {
			if (e.equals(emps[i])) {
				return emps[i];
			}
		}
		return null;
	}
	
	public void newEntry(int roomnum, String empName, boolean isEnter) {
		
	}
	
	public static void main(String[] args){
		
		Interface I = new Interface();
		I.acl.push(new Entry(I.getDoor(0),I.emps[0]));
		System.out.println(I.acl.peek());
		
	}
	
	
}
