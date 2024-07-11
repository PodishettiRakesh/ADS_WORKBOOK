// Write a program that uses a try-catch block to handle a potential `ArithmeticException` when dividing by zero.
// public class Exceptions {
//     public static void main(String[] args) {
//         int numerator = 10;
//         int denominator = 0;

//         try {
//             int result = numerator / denominator;
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Error: Cannot divide by zero.");
//         }
//     }
// }



// Write a method that reads integers from a file and throws a `FileNotFoundException` if the file does not exist. 
// Use a try-catch block to handle this exception and print an error message.

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class Exceptions {
//     public static void readIntegersFromFile(String filename) {
//         try {
//             File file = new File(filename);
//             Scanner scanner = new Scanner(file);
            
//             while (scanner.hasNextInt()) {
//                 int number = scanner.nextInt();
//                 System.out.println("Read number: " + number);
//             }
            
//             scanner.close();
//         } catch (FileNotFoundException e) {
//             System.out.println("Error: File not found: " + filename);
//         }
//     }

//     public static void main(String[] args) {
//         String filename = "input.txt"; // Change to a non-existent file name to test
        
//         readIntegersFromFile(filename);
//     }
// }

// Implement a method that throws an `IllegalArgumentException` if a given string is empty or null, 
// and catch this exception in the `main` method.

// public class Demo {
//     public static void checkString(String str) {
//         if (str == null || str.isEmpty()) {
//             throw new IllegalArgumentException("String cannot be null or empty");
//         }
//         System.out.println("Valid string: " + str);
//     }

//     public static void main(String[] args) {
//         try {
//             String input1 = "Hello";
//             String input2 = ""; // Change to null or empty string to test exception
//             checkString(input1);
//             checkString(input2);
//         } catch (IllegalArgumentException e) {
//             System.out.println("Caught IllegalArgumentException: " + e.getMessage());
//         }
//     }
// }
