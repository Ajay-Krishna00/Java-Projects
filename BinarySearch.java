import java.util.Scanner;
public class BinarySearch {
  
  static int binarySearch(int arr[],int tar,int l)
  {
    int mid;
    int left = 0;
    int right = l - 1;
    while(left<=right)
    {
      mid=left+(right-left)/2;
      if (arr[mid]==tar)return mid;
      else if (arr[mid]<tar)
      {
        left=mid+1;
      }
      else if (arr[mid]>tar)
      {
        right=mid-1;
      }
    }
    return -1;
  }

  public static void main(String args[])
  {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the length of the array :");
      int l = sc.nextInt();
      int arr[] = new int[50];
      System.out.println("Enter the elements:");
      for (int i = 0; i < l; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println("Enter the element to search: ");
      int tar = sc.nextInt();
      int index = binarySearch(arr, tar, l);
      if (index == -1)
        System.out.println("Element no found!");
      else System.out.println("Element found at "+index+" index");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
