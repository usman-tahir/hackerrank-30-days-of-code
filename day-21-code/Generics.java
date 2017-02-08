import java.util.*;
import java.io.*;

public class Generics {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Determine the number of elements to enter into the integer array
    System.out.print("Enter the number of integer elements: ");
    int numberofIntegers = s.nextInt();

    Integer[] intArray = new Integer[numberofIntegers];

    // Add the integer lements
    int i;

    for (i = 0; i < numberofIntegers; i += 1) {
      System.out.print("Enter element #" + (i + 1) + ": ");
      intArray[i] = s.nextInt();
    }

    // Determine the number of elements to enter into the string array
    System.out.print("Enter the number of string elements: ");
    int numberofStrings = s.nextInt();

    // Add the string elements
    String[] stringArray = new String[numberofStrings];

    for (i = 0; i < numberofStrings; i += 1) {
      System.out.print("Enter element #" + (i + 1) + ": ");
      stringArray[i] = s.next();
    }

    Printer<Integer> intPrinter = new Printer<Integer>();
    Printer<String> stringPrinter = new Printer<String>();

    intPrinter.printArray(intArray);
    stringPrinter.printArray(stringArray);

    if (Printer.class.getDeclaredMethods().length > 1) {
      System.out.print("The Printer class should only have 1 method named printArray.");
    }

  }

}
