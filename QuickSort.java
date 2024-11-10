import java.util.StringTokenizer;

public class QuickSort {
  static void Display(String str[],int l)
  {
    for (int i = 0; i < l; i++) {
      System.out.println(str[i]);
    }
  }

  static void quickSort(String str[], int low, int high)
  {
    if (low < high) {
      int pi = partition(str, low, high);
      quickSort(str, low, pi - 1);
      quickSort(str, pi + 1, high);
    }
  }

  static int partition(String str[],int low,int high)
  {
    String pivot = str[high];
    int i = low - 1;
    for(int j=low ; j<high; j++)
    {
      if (str[j]!=null && pivot.compareToIgnoreCase(str[j]) >= 0) {
        i++;
        String temp = str[j];
        str[j] = str[i];
        str[i] = temp;
      }
    }
    String temp = str[i + 1];
    str[i + 1] = str[high];
    str[high] = temp;
    return (i + 1);
  } 
  public static void main(String args[])
  {
    String s = "Hello world, New day. Ajay";
    String delimiter = " ";
    StringTokenizer st = new StringTokenizer(s, delimiter);
    int l = 0;
    String str[] = new String[50];
    while(st.hasMoreTokens())
    {
      str[l] = st.nextToken();
      l++;
    }
    System.out.println("The Tokens are:");
    Display(str, l-1);
    quickSort(str, 0, l-1);
    System.out.println("The Sorted array is:");
    Display(str, l-1);
  }
}
