
// # - Task: Write a program that uses an `if-else` statement to check if a 
// # number is positive or negative.
// public class Conditions {
//     public static void main(String[] args) {
//         int number = 11;

//         if (number >= 0) {
//             System.out.println("The number is positive.");
//         } else {
//             System.out.println("The number is negative.");
//         }
//     }
// }


// # Medium programChallenge:
// # - Task: Create a program that uses a `for` loop to print the first 10 multiples of a given number.
// public class Conditions {
//     public static void main(String[] args) {
//         int number = 3;
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(number * i);
//         }
//     }
// }


// # Hard Challenge:
// # - Task: Write a program that reads numbers until a negative number is entered and then prints the average of all positive numbers entered (exclude the negative one).
// import java.util.Scanner;

// public class Conditions {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int sum = 0;
//         int count = 0;

//         while (true) {
//             System.out.print("Enter a number: ");
//             int number = scanner.nextInt();

//             if (number < 0) {
//                 break;
//             }

//             sum += number;
//             count++;
//         }

//         if (count > 0) {
//             double average = (double) sum / count;
//             System.out.println("The average of the positive numbers entered is: " + average);
//         } else {
//             System.out.println("No positive numbers were entered.");
//         }

//         scanner.close();
//     }
// }

