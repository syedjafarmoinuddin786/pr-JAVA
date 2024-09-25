//PROGRAM TO EXECUTE or IMPLEMENT SINGLE INHERITANCE
import java.util.*;
class person{
	string name;
	int age;
	person(string name,int age){
		this.name = name;
		this.age = age;
	}
	void display(){
		System.out.println("FROM PERSON(SUPER CLASS) CLASS ");
		System.out.println("Person Name :"+ name);
		System.out.println("Person Age :"+ age);
		
	}
class Employee extends person{
	double salary;
	person(string name, int age,double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


}	
	

}
