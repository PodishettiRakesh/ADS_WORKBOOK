

// Easy Challenge:
// - Task: Write a simple Java program that uses the `java.util.Random` class to generate and print a random number.
import java.util.Random;
// public class Libraries {
//     public static void main(String[] args) {
//         Random ran=new Random();
//         System.out.println(ran.nextInt());
//     }
// }



// Medium Challenge:
// - Task: Create a Java program that reads integers using `java.util.Scanner` until 0 is entered, then prints the sum of these integers.
import java.util.Scanner;
public class Libraries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        while(true){
            int num=scan.nextInt();
            if(num==0){
                System.out.println(num+sum);
                break;
            }else{
                sum+=num;
                System.out.println(sum);
            }
        }
    }
}

// Hard Challenge:
// - Task: Implement a Java program that uses `java.io.BufferedReader` to read text from a file named "input.txt" and prints it to the console.
