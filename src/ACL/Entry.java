package ACL;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
	
	
	//will fix ik it looks like shit -OD
	
	
	private Room r;
	private LocalDateTime time;
	private Employee employee;
	private boolean isEntry;
	
	// private Entry(Room r, Employee e);
	// this.r = r
	// this.emp = e
	// this.time = new Java.getTime();
	public Entry(Room r, Employee e,boolean isEntry) {
		this.r = r;
		this.employee = e;
		this.time = LocalDateTime.now();
		this.isEntry = isEntry;
	}
	
	@Override
	public String toString(){
		String r = "";
		r += this.employee.getName()+" Entered ";
		r += this.r.getRoomName() + " @ time: ";
		r += DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(this.time);
		return r;
	}
	
	public static void main(String[] args) {
		
		DateTimeFormatter test = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		test.format(LocalDateTime.now());
		System.out.println(test.format(LocalDateTime.now()));
		
		Entry e = new Entry(new Room("room1"), new Employee("Andy"),true);
		System.out.println(e.toString());
		
	}
}
