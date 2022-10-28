package application;

public class Employee {

    private String name;


    public void main(String[] args){
        System.out.println("Test Cases: ");
        Employee e1 = new Employee("Mark");
        e1.getName();
    }
    
    @Override
    public boolean equals(Object o) {
    	if (o instanceof Employee) {
    		if (getName().equals(((Employee)o).getName())) return true;
    	}
    	return false;
    }

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name; 
    }

    @Override
    public String toString(){
        return "Employee: " + getName();
    }

}
