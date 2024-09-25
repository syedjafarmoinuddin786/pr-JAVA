//PROGRAM TO EXECUTE or IMPLEMENT SINGLE INHERITANCE in Java 
import java.util.*;
class person{
	String name;
	int age;
	person(String name,int age){
		this.name = name;
		this.age = age;
	}
	void display(){
		System.out.println("FROM PERSON(SUPER CLASS) CLASS ");
		System.out.println("Person Name :"+ name);
		System.out.println("Person Age :"+ age);
		
	}
}	
class Employee extends person{
	double salary;
	Employee(String name, int age,double salary){
		super(name,age);
		this.salary = salary;
	}
	@Override		// here the method display is overrided
	void display(){
		System.out.println("FROM EMPLOYEE(SUB CLASS) CLASS ");
		System.out.println("Employee Name :"+ name);
		System.out.println("Employee age :"+ age );
		System.out.println("Employee Salary :"+ salary);	
	}
}
public class singleinheritance{
	public static void main(String[] args){
		person p = new person("SHIRAZ",20);
		Employee e = new Employee("AHMAD RAZA",23,80000.0);
		p.display();
		System.out.println();
		e.display();
	}
}	
	
