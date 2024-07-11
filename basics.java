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

// public class Basics {
//     private String studentName;
//     private String collegeName;
//     public Basics() {
//         this.studentName = "XYZ";
//         this.collegeName = "ABC";
//     }

//     public Basics(String studentName, String collegeName) {
//         this.studentName = studentName;
//         this.collegeName = collegeName;
//     }

//     public void displayValues() {
//         System.out.println("Student Name: " + studentName);
//         System.out.println("College Name: " + collegeName);
//     }

//     public static void main(String[] args) {
//         Basics obj1 = new Basics();
//         System.out.println("Using default constructor:");
//         obj1.displayValues();

//         Basics obj2 = new Basics("Rakesh", "IIITH Hyderabad");
//         System.out.println("Using parameterized constructor:");
//         obj2.displayValues();
//     }
// }



// Task: Write a Java program to create an array of objects of a class containing multiple attributes,
//  then perform sorting based on one attribute without using built-in sort functions.
// public class Basics {
//     private String studentName;
//     private String collegeName;
//     private int studentID;

//     public Basics(String studentName, String collegeName, int studentID) {
//         this.studentName = studentName;
//         this.collegeName = collegeName;
//         this.studentID = studentID;
//     }

//     public String getStudentName() {
//         return studentName;
//     }

//     public String getCollegeName() {
//         return collegeName;
//     }

//     public int getStudentID() {
//         return studentID;
//     }

//     public void display() {
//         System.out.println("Student ID: " + studentID + ", Student Name: " + studentName + ", College Name: " + collegeName);
//     }

//     public static void main(String[] args) {
//         Basics[] students = new Basics[5];
//         students[0] = new Basics("Rakesh", "IIITH Hyderabad", 3);
//         students[1] = new Basics("John", "MIT", 5);
//         students[2] = new Basics("Alice", "Stanford", 1);
//         students[3] = new Basics("Bob", "Harvard", 4);
//         students[4] = new Basics("Charlie", "Caltech", 2);

//         System.out.println("Before sorting:");
//         for (Basics student : students) {
//             student.display();
//         }

//         // Sorting based on studentID
//         for (int i = 0; i < students.length - 1; i++) {
//             for (int j = 0; j < students.length - 1 - i; j++) {
//                 if (students[j].getStudentID() > students[j + 1].getStudentID()) {
//                     Basics temp = students[j];
//                     students[j] = students[j + 1];
//                     students[j + 1] = temp;
//                 }
//             }
//         }

//         System.out.println("\nAfter sorting by studentID:");
//         for (Basics student : students) {
//             student.display();
//         }
//     }
// }

// Task: Write a Java program that includes a class with a private
//  integer field and a public getter for that field.
// public class Basics {
//     private int x;

//     public Basics(int x) {
//         this.x = x;
//     }

//     public int getX() {
//         return this.x;
//     }

//     public static void main(String[] args) {
//         Basics obj = new Basics(42);
//         System.out.println("The value of x is: " + obj.getX());
//     }
// }



// - Task: Create a Java class with a static method that 
// calculates the area of a rectangle using parameters for width and height.

// public class Basics {

//     private int width;
//     private int height;

//     public Basics(int width, int height) {
//         this.width = width;
//         this.height = height;
//     }

//     public static int calculateArea(int width, int height) {
//         return width * height;
//     }

//     public static void main(String[] args) {
//         Basics rectangle = new Basics(5, 10);
//         int area = calculateArea(rectangle.width, rectangle.height);
//         System.out.println("The area of the rectangle is: " + area);
//     }
// }



// Implement a Java class with a private array of Strings. Include methods to add a string to the array and another 
// method to remove a string from the array by shifting all elements.
// public class Basics {
//     private String[] array;
//     private int size;
//     private int capacity;

//     public Basics(int capacity) {
//         this.capacity = capacity;
//         this.array = new String[capacity];
//         this.size = 0;
//     }

//     public void add(String element) {
//         if (size < capacity) {
//             array[size] = element;
//             size++;
//         } else {
//             System.out.println("Array is full. Cannot add more elements.");
//         }
//     }

//     public void remove(String element) {
//         int index = indexOf(element);
//         if (index != -1) {
//             for (int i = index; i < size - 1; i++) {
//                 array[i] = array[i + 1];
//             }
//             array[size - 1] = null;
//             size--;
//         } else {
//             System.out.println("Element not found in the array.");
//         }
//     }

    
//     private int indexOf(String element) {
//         for (int i = 0; i < size; i++) {
//             if (array[i].equals(element)) {
//                 return i;
//             }
//         }
//         return -1;
//     }


//     public void printArray() {
//         System.out.print("Array elements: ");
//         for (int i = 0; i < size; i++) {
//             System.out.print(array[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Basics strArray = new Basics(10);

//         strArray.add("rakesh");
//         strArray.add("keerthi");
//         strArray.add("kavya");
//         strArray.add("ramudu");
//         strArray.add("nithin");

//         strArray.printArray();

//         strArray.remove("kavya");
//         strArray.printArray();
//     }
// }


// Write a Java program that demonstrates autoboxing of an `int` to an `Integer`.
public class Basics {

    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer boxedInteger = primitiveInt; // Autoboxing

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Boxed Integer: " + boxedInteger);
    }
}
