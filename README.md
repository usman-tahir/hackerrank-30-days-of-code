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