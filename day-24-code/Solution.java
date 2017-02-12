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

public class Solution {

  public static Node insert(Node head, int data) {
    Node n = new Node(data);
    if (head == null) {
      head = n;
    } else if (head.next == null) {
      head.next = n;
    } else {
      Node start = head;
      while (start.next != null) {
        start = start.next;
      }
      start.next = n;
    }
    return head;
  }

  public static void display(Node head) {
    Node start = head;
    while (start != null) {
      System.out.print(start.data + " ");
      start = start.next;
    }
    System.out.println();
  }

  public static boolean search(Node head, int value) {
    Node current = head;
    boolean found = false;

    while (current != null) {
      if (current.data == value) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public static Node removeDuplicates(Node head) {
    Node current = head;
    Node resulting = new Node(current.data);

    while (current != null) {
      if (search(resulting, current.data) == false) {
        resulting = insert(resulting, current.data);
      }
      current = current.next;
    }
    return resulting;
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of elements to create nodes with
    System.out.print("Enter the number of nodes to create: ");
    int n = s.nextInt();

    Node head = null;
    while (n > 0) {
      // Ask for the data element to associate with the Node
      System.out.print("Enter a data element for this node ("
        + (n - 1) + " left): ");
      int d = s.nextInt();
      head = insert(head, d);
      n -= 1;
    }
    head = removeDuplicates(head);
    display(head);
  }

}
