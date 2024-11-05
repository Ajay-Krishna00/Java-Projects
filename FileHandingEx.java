import java.io.*;

public class FileHandingEx {
  public static void main(String args[])
  {
    String path = "./demo.txt";
    String text1 = "Hello World \n";
    String text2 = "1 2 3 4 5 6";
    try(FileWriter fw=new FileWriter(path))
    {
      fw.write(text1);
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    System.out.println("Written Successfully");
    try(FileWriter fw=new FileWriter(path,true))
    {
      fw.write(text2);
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    System.out.println("Appended Successfully");
    
    System.out.println("Content of file are:");
    try (FileReader fr=new FileReader(path))
    {
      int ch = fr.read(); //fr.read returns -1 if end of file is reached
      int sum = 0;
      while(ch!=-1)
      {
        System.out.print((char) ch);
        if (Character.isDigit(ch)) {
          sum += Character.getNumericValue(ch);
        }
        ch = fr.read();
      }
      System.out.println("\nSum of digits in file is: " + sum);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
