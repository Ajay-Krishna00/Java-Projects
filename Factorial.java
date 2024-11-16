import java.util.Scanner;
class Factorial
{
	
	
	public static void main(String []args)
	{	int n,ch,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		n=sc.nextInt();
		WithOutRecursion obj1=new WithOutRecursion();
		WithRecursion obj2=new WithRecursion();
		System.out.println("Enter 1 for recursion\n2 for without recursion");
		ch=sc.nextInt();
		switch (ch) {
			case 1:
				result = obj2.recursion(n);
				System.out.println("The Factorial of "
						+ n + " is: " + result);
				break;
			case 2:
				result = obj1.normal(n);
				System.out.println("The Factorial of "
						+ n + " is: " + result);
				break;
		}
		sc.close();
	}
}
class WithOutRecursion
{
	public int normal(int n)
	{
		int result=1;
		for (int i=0; i<n;i++)
		{
			result=result*(n-i);
		}
		return result;
	}}
	
class WithRecursion
{
	public int recursion(int n)
	{
		if (n!=0)
			return n*recursion(n-1);
		return 1;
	}
}

