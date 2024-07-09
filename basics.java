import java.util.Scanner;

public class basics {

    public static void main(String[] args) {
        System.out.println("Hello, World");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num % 2==0){
            System.out.println("given number is even");
        }else{
            System.out.println("it is odd number");
        }
    }
}


