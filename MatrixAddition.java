import java.util.Scanner;
class MatrixAddition
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the rows and column of first matrix:");
		int n1=sc.nextInt();
		int m1=sc.nextInt();
		System.out.println("Enter the rows and column of second matrix:");
		int n2=sc.nextInt();
		int m2=sc.nextInt();
		int a1[][]=new int[n1][m1];
		int a2[][]=new int[n2][m2];
		int a3[][]=new int[n2][m2];
		if (n1==n2 && m1==m2)
		{
			System.out.println("Enter elements of first matrix:");
			for (int i=0; i<n1; i++)
			{
				for (int j=0; j<m1;j++)
				{
					a1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter elements of second matrix:");
			for (int i=0; i<n2; i++)
			{
				for (int j=0; j<m2;j++)
				{
					a2[i][j]=sc.nextInt();
				}
			}
			sc.close();
			System.out.println("The sum is:");
			for (int i=0; i<n1; i++)
			{
				for (int j=0; j<m1;j++)
				{
					a3[i][j]=a1[i][j]+a2[i][j];
					System.out.print(a3[i][j]+" ");
				}
				System.out.println("");
			}
		}
		else 
		{
			System.err.println("ERROR:The no. of elements must be equal");
		}
	}
}





