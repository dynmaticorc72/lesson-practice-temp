package tw.satisfaction.myproject.inheritance;

class Employee {
	String name = "mary";
	String address = "Taiwan";
	String phone = "0987654321";
	int salary = 22000;

	public void showDetails() {
		System.out.println("Personal Info");
	}

	public int getSalary() {
		return salary;
	}
	public Employee(){
		
	}
	
	public Employee(String name){
		this.name = name;
	}

}

class Engineer extends Employee {
	String skill = "Java";

	public void program() {
		System.out.println("I can write " + skill + ".");
		super.showDetails();
	}
	
	public Engineer(){
		super("john");
	}
}

class Manager extends Employee{
	String skill = "manager";
	
	public int getSalary(){
		return salary+20000;
	}
	
}

public class CallTestInheritanceEx1 {

	public static void main(String[] args) {
		Engineer softwareEngineer = new Engineer();
		softwareEngineer.salary = 35000;
		softwareEngineer.showDetails();
		softwareEngineer.program();
		System.out.println(softwareEngineer.getSalary());
		
		
		Manager aaa = new Manager();
		System.out.println(aaa.getSalary());

	}

}
