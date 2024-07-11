import java.util.Scanner;

// public class basics {

//     public static void main(String[] args) {
//         System.out.println("Hello, World");

//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();
//         if(num % 2==0){
//             System.out.println("given number is even");
//         }else{
//             System.out.println("it is odd number");
//         }
//     }
// }

// public class basics {

// }

// Write a Java program to create a `String` object and print its length.
// public class Basics {
//     private void printStringLength(String str) {
//         System.out.println(str.length());
//     }

//     public static void main(String[] args) {
//         Basics obj = new Basics();
//         obj.printStringLength("rakesh");
//     }
// }

// Task: Write a Java program that creates an instance of a class with two constructors: one default and one parameterized, and then calls a method to display the values.

public class Basics {
    private String studentName;
    private String collegeName;
    public Basics() {
        this.studentName = "XYZ";
        this.collegeName = "ABC";
    }

    public Basics(String studentName, String collegeName) {
        this.studentName = studentName;
        this.collegeName = collegeName;
    }

    public void displayValues() {
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {
        Basics obj1 = new Basics();
        System.out.println("Using default constructor:");
        obj1.displayValues();

        Basics obj2 = new Basics("Rakesh", "IIITH Hyderabad");
        System.out.println("Using parameterized constructor:");
        obj2.displayValues();
    }
}


