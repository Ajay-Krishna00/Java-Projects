import java.util.Scanner;
class MyException extends Exception
{
	public MyException(String message) {
		super(message);
	}
}
class CustomExeption
{	public static void main(String args[]){	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=sc.nextInt();
	try {
	check(age);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	
	}
	static void check(int a) throws MyException {
		if(a<18)
		throw new MyException("Age is below 18");
	}
	
}
