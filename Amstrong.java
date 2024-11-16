import java.util.Scanner;
class Amstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int num =sc.nextInt();
		int org=num;
		sc.close();
		int t,cube=0;
		while(num!=0)
		{
			t=num%10;
			num=num/10;
			cube=cube+(t*t*t);
		}
		if (cube==org)
		{
			System.out.println("no. is Armstrong");
		}
		else
		{
			System.out.println("not Armstrong");
		}
	}
	
}
