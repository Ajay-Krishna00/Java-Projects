class ExeptionHandling
{
	public static void main(String []args)
	{
		int a,d;
		try{
			d=0;
			a=42/d;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		try{
			String l=null;
			int n=l.length();
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
		try{
			int arr[]=new int[5];
			arr[6]=10;
		}
		catch(ArrayIndexOutOfBoundsException ne)
		{
			System.out.println(ne);
		}
		try{
			int n=Integer.parseInt("Ajay");
		}
		catch(NumberFormatException ne)
		{
			System.out.println(ne);
		}
	}
}


