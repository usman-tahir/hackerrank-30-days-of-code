import java.util.*;
import java.io.*;

class Node {
  Node left, right;
  int data;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

public class Solution {

  public static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    } else {
      Node current;
      if (data < root.data) {
        current = insert(root.left, data);
        root.left = current;
      } else {
        current = insert(root.right, data);
        root.right = current;
      }
      return root;
    }
  }

  public static int getHeight(Node root) {
    int leftHeight = 0, rightHeight = 0;

    if (root.left != null) {
      leftHeight = getHeight(root.left) + 1;
    }

    if (root.right != null) {
      rightHeight = getHeight(root.right) + 1;
    }

    return (leftHeight > rightHeight ? leftHeight : rightHeight);
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    Node root = null;

    // Get the number of elements to add
    System.out.print("Enter the number of elements to add: ");
    int n = s.nextInt();

    // Add the elements to the root node
    while (n-- > 0) {
      System.out.print("Enter a data element: ");
      int d = s.nextInt();
      root = insert(root, d);
    }

    int height = getHeight(root);
    System.out.println(height);
  }

}
