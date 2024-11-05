import java.io.*;
import java.util.StringTokenizer;
public class StringTokenizerEx {
  public static void main (String args[])
  {
    BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the String of Numbers: ");
    try{
      String inp = bd.readLine();
      StringTokenizer st = new StringTokenizer(inp);
      int sum = 0;
      System.out.println("The Tokens are:");
      while(st.hasMoreTokens())
      {
        String tk = st.nextToken();
        int n = Integer.parseInt(tk);
        System.out.println(" " + n);
        sum += n;
      }
      System.out.println("The sum is: "+sum);
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  }
}
