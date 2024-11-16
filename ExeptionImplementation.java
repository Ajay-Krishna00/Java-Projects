class ExeptionImplementation
{
	public static void main (String args[])
	{
		exeptionHandling();
	}
	static void exeptionHandling() throws ArithmeticException
	{
		try
		{
			int a=10;
			int b=a/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Implemented try catch!");
		}
		int age=15;
		if (age<18)	throw new ArithmeticException("Age should be geater than or equal to 18");
		}
}
