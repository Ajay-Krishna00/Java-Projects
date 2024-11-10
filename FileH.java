// This program generates a random string, writes it to a file, reads the string back from the file,
// and then determines the letter with the highest frequency in the string.

import java.io.*;
import java.util.Random;

public class FileH {
  static String generateString(Random rd,int n)
  {
    String ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
    StringBuilder rand = new StringBuilder();
    for(int i=0;i<n;i++)
    {
      int index = rd.nextInt(ch.length());
      rand.append(ch.charAt(index));
    }
    return rand.toString();
  }
  public static void main(String args[]) throws IOException
  {
    String path = "Demo.txt";
    Random rd=new Random();
    String rand = generateString(rd, 50);
    System.out.println("Writing to a file...");
    try(FileWriter fd=new FileWriter(path)) 
    {
      fd.write(rand);
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    finally {
      System.out.println("Writing Done!");
    }
    System.out.println("Reading from a file...");
    int ch;
    StringBuilder str = new StringBuilder();
    String string=new String();
    try(FileReader fr=new FileReader(path)) 
    {
      do{
        ch = fr.read();
        str.append((char)ch);
      } while (ch != -1);
      string = str.toString();
      System.out.println("The string is: "+string);
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    finally {
      System.out.println("Reading Done!");
    }
    int frq[] = new int[26];
    string = string.toLowerCase();
    for(char c:string.toCharArray())
    {
      if ((c >= 'a' && c <= 'z'))
      {
        frq[c - 'a']++;
      }
    }
    int maxFreq = 0;
    char highestFreq = ' ';
    for (int i = 0; i < 26; i++)
    {
      if (maxFreq<frq[i])
      {
        maxFreq = frq[i];
        highestFreq = (char)(i + 'a');
      }
    }
    System.out.println("The letter with highest frequency is : " +highestFreq );

  }
}
