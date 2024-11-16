class Employee
{
	String name;
	int age;
	int phone_no;
	String address;
	double salary;
	Employee(String n,int a,int ph,String add,double s)
	{
		name=n;
		age=a;
		phone_no=ph;
		address=add;
		salary=s;
	}
	public void printSalary()
	{
		System.out.println("Salary: "+salary);
	}
	public void printDetails()
	{
		System.out.println("Name: "+name+"\nAge: "+age+"\nPhone no: "+phone_no+"\nAddress: "+address);
	}
}

class Officer extends Employee
{
	String specialisation;
	Officer(String n,int a,int ph,String add,double s,String sp)
	{
		super(n,a,ph,add,s);
		specialisation=sp;
	}
	public void printRole() 
	{
        System.out.println("Specialisation: " + specialisation);
    	}
}
class Manager extends Employee
{
	String department;
	Manager(String n,int a,int ph,String add,double s,String D)
	{
		super(n,a,ph,add,s);
		department=D;
	}
	public void printRole() 
	{
        System.out.println("Department: " + department);
    	}
}

class HeirarchicalInheritance
{
	public static void main(String []args)
	{
		Officer off=new Officer("Abhay",19,123456789,"Aluva",100000,"Data Scientist");
		Manager man=new Manager("Ajay",19,123456789,"Cheranalloor",100000,"Software Development");
		System.out.println("The Details of Officer are:");
		off.printDetails();
		off.printSalary();
		off.printRole() ;
		System.out.println("\nThe Details of Manager are:");
		man.printDetails();
		man.printSalary();
		man.printRole();
	}
}
