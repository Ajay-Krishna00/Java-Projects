/* This is program to Find the Frequency of a target from the Given String */

import java.util.Scanner;

public class Frequency {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.next();
    sc.close();
    int l = str.length();
    int freq[] = new int[256];
    for (int i = 0; i < l; i++) {
      freq[str.charAt(i)]++;
    }
    for (int i = 0; i < 256; i++) {
      if (freq[i] > 0) {
        System.out.println((char) i + " : " + freq[i]);
      }
    }
  }
}
