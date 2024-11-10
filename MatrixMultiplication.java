import java.util.Scanner;
public class MatrixMultiplication {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of rows and col of matrix 1:");
    int m1 = sc.nextInt();
    int n1 = sc.nextInt();
    System.out.println("Enter the no of rows and col of matrix 2:");
    int m2 = sc.nextInt();
    int n2 = sc.nextInt();
    int arr1[][] = new int[50][50];
    int arr2[][] = new int[50][50];
    int arr3[][] = new int[50][50];

    if (n1 == m2) {
      System.out.println("Enter the elements of 1st matrix");
      for (int i = 0; i < m1; i++) {
        for (int j = 0; j < n1; j++) {
          System.out.println("Enter the " + (j + 1) + "th element of " + (i + 1) + "th row");
          arr1[i][j] = sc.nextInt();
        }
      }
      System.out.println("Enter the elements of 2nd matrix");
      for (int i = 0; i < m2; i++) {
        for (int j = 0; j < n2; j++) {
          System.out.println("Enter the " + (j + 1) + "th element of " + (i + 1) + "th row");
          arr2[i][j] = sc.nextInt();
        }
      }
      for (int i = 0; i < m1; i++) {
        for (int j = 0; j < n2; j++) {
          for (int k = 0; k < n1; k++) {
            arr3[i][j] += arr1[i][k] * arr2[k][j];
          }
        }
      }
      System.out.println("The result is :");

      for (int i = 0; i < m1; i++) {
        for (int j = 0; j < n2; j++) {
          System.out.print(arr3[i][j]+"  ");
        }
        System.out.println();
      }
    } else
      System.out.println("Not Valid");
    sc.close();
  }
  
}
