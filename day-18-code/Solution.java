import java.io.*;
import java.util.*;

public class Solution {

  Stack<Character> stack = new Stack<>();
  Queue<Character> queue = new LinkedList<>();

  void pushCharacter(char c) {
    this.stack.push(c);
  }

  void enqueueCharacter(char c) {
    this.queue.add(c);
  }

  char popCharacter() {
    return stack.pop();
  }

  char dequeueCharacter() {
    return queue.remove();
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = s.nextLine();

    char[] letters = input.toCharArray();

    Solution solution = new Solution();

    for (char c : letters) {
      solution.pushCharacter(c);
      solution.enqueueCharacter(c);
    }

    boolean isPalindrome = true;
    for (int i = 0; i < letters.length / 2; i += 1) {
      if (solution.popCharacter() != solution.dequeueCharacter()) {
        isPalindrome = false;
        break;
      }
    }

    System.out.println("The word, " + input + ", is "
    + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
  }

}
