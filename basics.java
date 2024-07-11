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
public class Basics {
    private void printStringLength(String str) {
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        Basics obj = new Basics();
        obj.printStringLength("rakesh");
    }
}


