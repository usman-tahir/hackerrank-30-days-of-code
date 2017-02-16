import java.io.*;
import java.util.*;

public class Solution {

  static ArrayList<String> returnPeopleWithGmailAccounts(String[] names, String[] emails) {
    ArrayList<String> result = new ArrayList<String>();
    int len = emails.length;
    int index;

    for (index = 0; index < len; index += 1) {
      int atSignIndex = emails[index].indexOf("@");
      int gmailIndex = emails[index].indexOf("gmail");
      if (atSignIndex != -1 && (gmailIndex > atSignIndex)) {
        result.add(names[index]);
      }
    }
    Collections.sort(result);
    return result;
  }
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of rows in the table
    System.out.print("Enter the number of rows in the column: ");
    int rows = s.nextInt();

    String[] names = new String[rows];
    String[] emails = new String[rows];

    int index;

    for (index = 0; index < rows; index += 1) {
      // Get the name and email
      System.out.print("Enter the name of this person: ");
      names[index] = s.next();

      System.out.print("Enter the email for this person: ");
      emails[index] = s.next();
    }

    ArrayList<String> result = returnPeopleWithGmailAccounts(names, emails);
    for (String r : result) {
      System.out.println(r);
    }

  }

}
