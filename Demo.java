// public class Demo
//  {

//     public int FibanacciNumber(int n){
//         // int first=0;
//         // int second=1;

//         // if(n==0){
//         //     return first;
//         // }else if(n==1){
//         //     return second;
//         // }else{
//         //     while(n>2){
//         //         int next=first+second;
//         //         first=second;
//         //         second=next;
//         //         n--;
//         //     }
//         //     return second;
//         // }

//         if(n<=1){
//             return n;
//         }else{
//             return FibanacciNumber(n-1)+FibanacciNumber(n-2);
//         }
//     }
    

//     public static void main(String[] args) {
//         Demo
//          obj=new Demo
//         ();
//         int number=obj.FibanacciNumber(6);
//         System.out.println(number);
//     }
    
// }

// public class Demo{
//     public String reverseString(String name){
//         if(name.isEmpty()){
//             return name;
//         }else{
//             return reverseString(name.substring(1))+name.charAt(0);
//         }
//     }

//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         System.out.println(obj.reverseString("rakesh"));
//     }
// }



// Task: Write a recursive Java function that determines if a string is a palindrome.
// public class Demo{
//     public String reverseString(String name){
//         if(name.isEmpty()){
//             return name;
//         }else{
//             return reverseString(name.substring(1))+name.charAt(0);
//         }
//     }

//     public Boolean isPalindrone(String s){
//         if(s.equalsIgnoreCase(reverseString(s))){
//             return true;
//         }else{
//             return false;
//         }
//     } 
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         System.out.println(obj.isPalindrone("rakesh"));
//         System.out.println(obj.isPalindrone("amma"));
//     }
// }


// Write a Java program that overloads a method named `print` to 
// handle one integer parameter and one string parameter.
// public class Demo{
//     public void printPara(int number){
//         System.out.println(number);
//     }

//     public void printPara(String name){
//         System.out.println(name);
//     }

//     public static void main(String[] args){
//         Demo obj = new Demo();
//         obj.printPara(5);
//         obj.printPara("rakesh");
//     }
// }


// Implement a class `Shape` that defines a method `area()` and has two 
// subclasses `Square` and `Circle` which override the `area()` method to calculate area specific to each shape.

// abstract class Shape {
//     abstract void area();
// }

// class Circle extends Shape {
//     int radius;

//     public Circle(int radius) {
//         this.radius = radius;
//     }

//     public void area() {
//         double area = Math.PI * radius * radius; 
//         System.out.println("Area of Circle: " + area);
//     }
// }

// class Square extends Shape {
//     int side;

//     public Square(int side) {
//         this.side = side;
//     }

//     @Override
//     public void area() {
//         int area = side * side;
//         System.out.println("Area of Square: " + area);
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         Circle circle = new Circle(5);
//         Square square = new Square(4);

//         circle.area(); 
//         square.area(); 
//     }
// }




// : Create a base class `Employee` with a method `details()`
//  that prints base salary. Then, create a subclass `Manager` that 
//  overrides the `details()` method to include bonus salary and department.

// class Employee {
//     private double baseSalary;

//     public Employee(double baseSalary) {
//         this.baseSalary = baseSalary;
//     }

//     public void details() {
//         System.out.println("Base Salary: " + baseSalary);
//     }

//     public double getBaseSalary() {
//         return baseSalary;
//     }
// }

// class Manager extends Employee {
//     private double bonusSalary;
//     private String department;

//     public Manager(double baseSalary, double bonusSalary, String department) {
//         super(baseSalary);
//         this.bonusSalary = bonusSalary;
//         this.department = department;
//     }

//     @Override
//     public void details() {
//         System.out.println("Base Salary: " + getBaseSalary());
//         System.out.println("Bonus Salary: " + bonusSalary);
//         System.out.println("Department: " + department);
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         Employee emp = new Employee(50000);
//         emp.details();

//         Manager mgr = new Manager(60000, 15000, "Sales");
//         mgr.details();
//     }
// }

// Easy Challenge:
// - Task: Write a function that calculates the sum of all numbers up to n 
// and print the result. Analyze its time complexity.

// public class Demo {
//     public static int sumUpToN(int n) {
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             sum += i;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int n = 10; // You can change this value to test with other numbers
//         int result = sumUpToN(n);
//         System.out.println("Sum of all numbers up to " + n + " is: " + result);
//     }
// }

// Medium Challenge:
// - Task: Implement a function that finds the median of an unsorted array. Discuss the time complexity if you first sort the array.

// Hard Challenge:
// - Task: Write a recursive function to compute Fibonacci numbers and analyze its time complexity in terms of Big O notation.


