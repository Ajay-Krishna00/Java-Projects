import java.util.Scanner;
class Node {
  int data;
  Node next;
  Node prev;

  Node(int data)
  {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

public class DoublyLinkedList {
  static Node insertEnd(Node head,int data)
  {
    Node newNode = new Node(data);
    Node ptr = head;
    if (head == null) {
      head = newNode;
      return head;
    }
    while (ptr.next != null)
      ptr = ptr.next;
    newNode.prev = ptr;
    ptr.next = newNode;
    return head;
  }

  static Node delete(Node head,int data)
  {
    Node ptr = head;
    Node previ = null;
    if (head == null)
    {
      System.out.println("List is empty");
      return head;
    }
    while (ptr.data != data && ptr.next != null)
    {
      previ = ptr;
      ptr = ptr.next;
    }
    if (ptr.data == data) {
      if (ptr.prev == null) {
        head = head.next;
        head.prev = null;
      } else if (ptr.next == null) {
        previ.next = null;
        ptr.prev = null;
      } else {
        previ.next = ptr.next;
        ptr.next.prev = previ;
      }
    } else
      System.out.println("Target not found");
    return head;
  }

  static void Display(Node head)
  {
    Node ptr = head;
    System.out.println( "List is:  ");
    while(ptr.next!=null)
    {
      System.out.print(ptr.data + "  ");
      ptr = ptr.next;
    }
    System.out.print(ptr.data + "\n");
  }
  public static void main(String args[])
  {
    Node head = null;
    Scanner sc = new Scanner(System.in);
    int data;
    while (true) {
      System.out.println("Enter 1 for Insertion at End\n\t2 for Deletion of data\n\t3 for Display\n\t4 for exit");
      int inp = sc.nextInt();
      switch (inp) {
        case 1:
          System.out.println("Enter the data");
          data = sc.nextInt();
          head = insertEnd(head, data);
          break;
        case 2:
          System.out.println("Enter the Target");
          data = sc.nextInt();
          head = delete(head, data);
          break;
        case 3:
          Display(head);
          break;
        case 4:
          System.exit(0);
          break;
      }
    }
  }
  
}
