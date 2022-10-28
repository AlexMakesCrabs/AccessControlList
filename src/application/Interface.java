package application;

import java.util.Scanner;

public class Interface {
	protected static AccessControlList acl = new AccessControlList();
	protected static Room[] rooms = {new Room("Room1"), new Room("Room2"), new Room("Room3"), new Room("Main")};
	protected static Employee[] emps = {new Employee("Andy"), new Employee("Bri"), new Employee("Josh")};
	private static Scanner input = new Scanner(System.in);
	
	public static Room getRoom(int roomnum) {
		if (roomnum>=rooms.length || roomnum<0) return null;
		return rooms[roomnum];
	}
	
	public static AccessControlList getACL() {
		return acl;
	}
	
	public static Employee[] getEmps() {
		return emps;
	}
	
	public static Room[] getRooms() {
		return rooms;
	}
	
	public static Employee getEmp(String empName) {
		Employee e = new Employee(empName);
		for (int i = 0;i<emps.length;i++) {
			if (e.equals(emps[i])) {
				return emps[i];
			}
		}
		return null;
	}
	
	public static Room getRoom(String roomName) {
		Room r = new Room(roomName);
		
		for (int i = 0;i<getRooms().length;i++) {
			if (r.equals(getRooms()[i])) return getRooms()[i];
		}
		
		return null;
	}
	
	public static void makeEntries() {

		Room a = null;
		Employee b = null;
		boolean c = false;
		String exitcode = "Back";
		String cont = "";
		
		
		while (!cont.equalsIgnoreCase(exitcode)) {
			boolean valid = false;
			while (valid!=true) {

				System.out.print("\n\nWho are you? (Type a name)\n");
				for (int i = 0;i<emps.length;i++) {
					if (i%3==0) System.out.println();
					System.out.printf("%d: %s\t\t",i+1,getEmps()[i].getName());
				}
				System.out.println();
				cont = input.next();
				if (cont.equalsIgnoreCase(exitcode)) {
					break;
				}
				b = getEmp(cont);
				if (b != null) {
					valid = true;
				}
			}
			if (cont.equalsIgnoreCase(exitcode)) {
				break;
			}
			valid=false;
			
			
			while (valid!=true) {
				System.out.print("\n\nChoose a room:\n");
				for (int i = 0;i<getRooms().length;i++) {
					System.out.printf("%d: %s\t",i+1,getRoom(i).getRoomName());
				}
				System.out.println();
				cont = input.next();
				
				if (cont.equalsIgnoreCase(exitcode)) break; // exit condition
				
				a = getRoom(cont);
				if (a!=null) {
					valid = true;
				}
			}
			if (cont.equalsIgnoreCase(exitcode)) {
				break;
			}
			valid = false;
			
			
			while (valid!=true) {
				System.out.println("\nEntering the building?(Yes/No)");
				cont = input.next();
				
				if (cont.equalsIgnoreCase(exitcode)) break; // exit condition
				
				if (cont.equalsIgnoreCase("Yes")) {
					c = true;
					valid = true;
				}else if (cont.equalsIgnoreCase("No")) {
					c = false;
					valid = true;
				}else valid = false;
				
			}
			if (cont.equalsIgnoreCase(exitcode)) {
				break;
			}
			
			if (a!=null && b!=null) {
				Entry e = new Entry(a,b,c);
				getACL().push(e);
			}
		}
	}
	
	public static void getInfo() {
		System.out.println("DATA:\n\nTop element of the array:");
		System.out.println(getACL().peek());
	}
	
	public static boolean contains(String[] a, String b) {//helper method checks a string against an array of strings
		for (int i = 0;i<a.length;i++) {
			if (b.equals(a[i])) return true;
		}
		return false;
	}
	
	public static int menu() {
		String[] options = {"Entry","Retrieval"};
		String op = "";

		while (!contains(options,op)) {
			System.out.println("Select an option:");
			
			for (int i = 0;i<options.length;i++){
				System.out.printf("%s",options[i]);
				if (i<options.length-1) System.out.print(",\t");
			}
			
			op = input.nextLine();
		}
		
		for (int i = 0;i<options.length;i++) {
			if (op.equalsIgnoreCase(options[i])) return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		
		System.out.println("ACL Starting...");
		System.out.println("Type \"Back\" to go back.");
		System.out.println();
		
		
		
		boolean cont = true;//continue program condition
		while (cont == true) {
			int selection = menu();//select method 
			
			switch (selection) {
			case -1:
				cont = false;
				break;
			case 0: //adding new entries to the stack
				makeEntries();
				break;
			case 1:getInfo();
				break;
			default:
				cont = false;
			}
		}
		
		System.out.println("ACL END");
		input.close();
	}
	
}
