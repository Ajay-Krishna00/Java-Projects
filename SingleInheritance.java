class Employee
{
	int salary=10000;
	Employee(int s){
		salary=s;
	}
	void display()
	{
		System.out.println("Name of Claas is "+this.getClass().getName());
	}
	void calcSalary()
	{
		System.out.println("Salary of employee is "+salary);
	}
}
class Engineer extends Employee
{
	Engineer(int s){
		super(s);
	}
}
class SingleInheritance
{
	public static void main(String []args)
	{	
		Engineer ob=new Engineer(20000);
		ob.display();
		ob.calcSalary();
		
	}
}
