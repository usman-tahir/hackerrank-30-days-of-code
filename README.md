# hackerrank-30-days-of-code
Code snippets from the 30 days of code challenge on Hackerrank

### Day 0 (“Warm up”)
Basic input/output with Java - reading in a string, and appending it to another string before printing the entire string out. This solution simply involved getting the string that was input, and concatenating it to the existing string, along with a newline for formatting purposes.

### Day 1 ("Types")
Basic input output - this time involving integer and double input. This was accomplished by parsing the input as an integer/double, while passing it in as a string (using Scanner#nexLine). The printout was simple, and asked for basic arithmetic (addition), as well as string concatenation.

### Day 2 ("Operators")
More input and output, this time with arithmetic calculations for tip and tax additions to a value. The variables are read in and parsed, and then applied to the meal cost provided to the user. The final meal cost (after applying the tip and the tax) is cast to an integer and then printed out.

### Day 3 ("Conditional Statements")
Basic conditional statements, using && and || operators for specific output. In this challenge, the parity of a number was compared, as well as if it fell into a certain range of numbers. The output was returned as a string, and printed out, as soon as a number was received as input from the user, and interpreted by the function.

### Day 4 ("Classes and Instances")
Introduction to Object-Oriented Programming concepts, including object instantiation and instance variable instantation. A basic Person object was made in this exercise, and its 'age' instance variable was compared using a comparision function (Person#amIOld), with a range based printout being used to give the user some output.

### Day 5 ("Loops")
Basic loop construction with sentinel values, that are updated during the execution of the loop. In this exercise, the first 10 multiples of an inputted number are generated, and then the loop breaks. Both the loop counter and the current number (used to generate the multiple) are incremented during each loop iteration.

### Day 6 ("Review")
Another looping exercise with feedback in the form of a string that has been rearranged with its even and odd indexed elements separated. Once each string is entered by the user into an array of strings, that array is parsed using a function that splits the string into letters, assigns the even and odd indexed elements into their respective strings, and returns a new string after it is formatted.

### Day 7 ("Arrays")
This exercise involves looping through arrays backwards, after initializing an array with a set amount of elements. The basic logic here is to use the length of the array to move forward and backward through the array, based on what is required.

### Day 8 ("Dictionaries and Maps")
This exercise used a data structure known as a HashMap to collect, store, and later reference data using key and value pairs. Users are prompted for a name and a phone number to add to an address book, and this key value pair (name -> number) can be used to store the data and reference it later. If a name does not exist in the address book, then the user is prompted accordingly; otherwise, the name and the number are printed out side by side.

### Day 9 ("Recursion")
A basic introduction to recursion, using the factorial algorithm. For any number greater than one, the factorial of that number is equal that number multiplied by the factorial of one minus that number ((n!) = (n x factorial(n - 1))); the algorithm for this functionality becomes recursive, since the number 1 is set as a base case (the factorial of 1 is 1), and any other number greater than one follows the normal factorial rule.

### Day 10 ("Binary Numbers")
This exercise required the conversion of a decimal number into its binary form, and then the analysis of that converted number (a string of zeros and ones) to determine the maximum length of consecutivie ones (eg. '111' would return 3) that existed in that converted number. For this exercise, the task was broken down into two parts; First, the actual number passed in was converted to its binary form (in the form of a string), and then, that string was analyzed based on the repetition of the character '1'. This was done by creating a helper function that took the max length of the converted string and producing an equal length string of ones, and comparing it to the converted number (in string format) as a whole, iterating through and becoming smaller each time to determine if such a maximum could be found. If not, a value of 0 was returned.

### Day 11 ("2D Arrays")
This exercise required parsing a two-dimensional array and creating 'hourglass' figures out of the elements, which essentially boiled down to one-dimensional arrays with 7 elements in each generated hourglass. Furthermore, once all the 'hourglasses' were generated, the maximum sum for all hourglasses needed to be computed, which consisted of summing all the values in the one-dimensional arrays, and sorting all those values to find the maximum sum. One edge case that was somewhat interesting to deal with was a grid (generated two-dimensional array) that had all negative numbers, and determining the max sum from an array of negative integers.

### Day 12 ("Inheritance")
Basic class-based inheritance with a superclass (Person) and a subclass (Student). This exercise allows the user to instantiate a student object, and give them attributes such as a first name, a last name, a student ID number, and an array of test scores, with which to calculate a character letter grade based on their average score from their test scores. The information was read in and used to construct the Student object, which then called its 'calculate' method to produce a character letter grade.

### Day 13 ("Abstract Classes")
This exercise takes class-based inheritance a step futher by introducing abstraction. A Book class serves as the abstract class to the MyBook class, which extends it and implements its attributes (title and author) and functionality (Book#display). The MyBook class has an additional price field, which belongs only to MyBook class instantiations, using the 'super()' constructor to initialize its title and author.

### Day 14 ("Scope")
This exercise deals with determining the maximum difference between the elements of a given array, using a Difference class. This is achieved by iterating through the array twice, and comparing the absolute differences between the elements against all other elements, finally setting the maximum difference once both iterations are done.

### Day 15 ("Linked List")
Using the provided Linked List implementation using a Node class, an insertion method needed to be created in order to append nodes to the end of the Linked List that was generated. This was done by creating a new node with the passed in data, iterating through the current linked list (using a reference to 'head' - the first node in the Linked List), and then appending the new node, and returning head.

### Day 16 ("Exceptions - String to Integer")
This exercise was a basic introduction into try catch blocks, and catching exceptions based on parsing a string. If a string could be parsed into an integer, it is printed out; otherwise (once the exception is caught), an error message is printed, instead of the program crashing.
