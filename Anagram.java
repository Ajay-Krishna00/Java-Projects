import java.util.Scanner;
public class Anagram {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Main Word:");
    String mstr = sc.nextLine();
    System.out.println("Enter the Anagram:");
    String anagram = sc.nextLine();
    int l1 = mstr.length();
    int l2 = anagram.length();
    boolean present = false;
    int count = 0;
    for (int i=0;i<l2;i++)
    {
      for (int j = 0; j < l1; j++) {
        if (Character.toLowerCase(anagram.charAt(i)) == Character.toLowerCase(mstr.charAt(j)))
          present = true;
      }
      if (present)
        count += 1;
    }
    if (count==l2)
      System.out.println("Is Anagram");
    else
      System.out.println("Not Anagram!");
    sc.close();
  }
}
