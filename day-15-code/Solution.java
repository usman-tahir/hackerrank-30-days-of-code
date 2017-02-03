import java.io.*;
import java.util.*;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Solution {
  public static Node insert(Node head, int data) {
    Node current = head;
    Node toInsert = new Node(data);

    if (head == null) {
      return toInsert;
    }

    while (head.next != null) {
      head = head.next;
    }

    head.next = toInsert;
    return current;
  }

  public static void display(Node head) {
    Node start = head;

    while (start != null) {
      System.out.print(start.data + " ");
      start = start.next;
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Node head = null;

    System.out.print("Enter the number of links to add: ");
    int n = s.nextInt();

    while (n-- > 0) {
      System.out.print("Enter an element: ");
      int element = s.nextInt();

      head = insert(head, element);
    }
    display(head);
    System.out.println();
    s.close();
  }
}
