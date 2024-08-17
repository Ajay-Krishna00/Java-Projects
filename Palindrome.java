/* This is program to Check whether a Given String is Palindrome or not */

import java.util.Scanner;

class Palindrome {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.next();
    sc.close();
    boolean isPalindrome = true;
    int l = str.length();
    for (int i = 0; i < l / 2; i++) {
      if (str.charAt(i) != str.charAt(l - i - 1)) {
        isPalindrome = false;
      }
    }
    if (isPalindrome) {
      System.out.print("It is Palindrome");
    } else {
      System.out.print("Not Palindrome");
    }
  }
}