import java.util.Scanner;
class Employee{
	String name,department;

	Employee(String name, String department,int salary){
		this.name = name;
		this.department = department;
		
		display(name,department,salary);
		
	}
	Employee(String name, String department, double salary){
		this.name = name;
		this.department = department;
		display(name,department,salary);
		
	}
	Employee(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name and department");
		name = s.next();
		department = s.next();	
		display();	
				
	}

	int calcBonus(int salary){
		return salary+(int)(salary*0.10);
	}
	double calcBonus(double salary){
		return salary+salary*0.10;
	}
	public void display(){
		System.out.println("Name : "+name+" Department : "+department);
		
		
	}
	
	public void display(String name, String department,int salary){
		System.out.println("Name : "+name+" Department : "+department+" Salary : "+salary);
		System.out.println("Bonus "+calcBonus(salary));
	}
	public void display(String name, String department,double salary){
		System.out.println("Name : "+name+" Department : "+department+" Salary : "+salary);
		System.out.println("Bonus "+calcBonus(salary));
	}



}
class EmployeeMain{
	public static void main(String[] args){
		Employee e1 = new Employee("vikas","Finance",40000);
		Employee e2 = new Employee("vikas","Finance",30000.00);
		Employee e3 = new Employee();
		
		

	}


}