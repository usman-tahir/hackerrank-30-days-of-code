import java.io.*;
import java.util.*;

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

  static void levelOrder(Node root) {
    int height = getHeight(root);
    int i;

    for (i = 1; i <= height + 1; i += 1) {
      printGivenLevel(root, i);
    }
    System.out.println();
  }

  static void printGivenLevel(Node root, int level) {
    if (root == null) {
      return;
    }
    if (level == 1) {
      System.out.print(root.data + " ");
    } else if (level > 1) {
      printGivenLevel(root.left, level - 1);
      printGivenLevel(root.right, level - 1);
    }
  }

  public static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    } else {
      Node current;
      if(data <= root.data) {
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

    // Get the number of elements to add
    System.out.print("How many elements will be added: ");
    int n = s.nextInt();

    Node root = null;

    while(n > 0) {
      System.out.print("Please enter a data element: ");
      int data = s.nextInt();
      root = insert(root, data);

      n -= 1;
    }
    // System.out.println("Height: " + getHeight(root));
    levelOrder(root);
  }

}
