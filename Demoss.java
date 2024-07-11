// Create a simple Java program where a class `Animal` has a method `eat()` and a subclass `Dog` 
// that inherits `Animal` and adds a method `bark()`.
// class Animal {
//     public void eats(){
//         System.out.println("The Animal is eating");
//     }
// }

// class Dog extends Animal{
//     public void barks(){
//         System.out.println("the dog is barking");
//     }
// }

// public class Demos{
//     public static void main(String[] args) {
//         Dog mydog = new Dog();
//         mydog.eats();
//     }
// }


// Implement a class `Shape` with a method `area()` and create two subclasses, 
// `Triangle` and `Rectangle`, that override the `area()` method to calculate their respective areas.
// abstract class Shape{
//     abstract void area();
// }

// class Triangle extends Shape{
//     int width;
//     int height;

//     public Triangle(int width, int height){
//         this.width=width;
//         this.height=height;
//     }

//     public void area(){
//         System.out.println(0.5*width*height);
//     }

// }

// class Rectangle extends Shape{
//     int width;
//     int length;

//     public Rectangle(int width,int length){
//         this.width=width;
//         this.length=length;
//     }

//     public void area(){
//         System.out.println(length*width);
//     }
// }

// public class Demoss{
//     public static void main(String[] args) {
//         Shape triangle = new Triangle(5, 10);
//         Shape rectangle = new Rectangle(4, 5);
//         triangle.area();
//         rectangle.area();
//     }
// }



// Design a base class `Employee` with methods for setting and getting basic salary, and subclasses `FullTime` 
// and `PartTime` that add their own specific methods like `calculateSalary()` which include additional benefits or hourly rates.
// public class Demoss {
    
//     // Base Class: Employee
//     static class Employee {
//         private double basicSalary;

//         public void setBasicSalary(double basicSalary) {
//             this.basicSalary = basicSalary;
//         }

//         public double getBasicSalary() {
//             return basicSalary;
//         }
//     }

//     // Subclass: FullTime
//     static class FullTime extends Employee {
//         private double benefits;

//         public void setBenefits(double benefits) {
//             this.benefits = benefits;
//         }

//         public double getBenefits() {
//             return benefits;
//         }

//         public double calculateSalary() {
//             return getBasicSalary() + benefits;
//         }
//     }

//     // Subclass: PartTime
//     static class PartTime extends Employee {
//         private double hourlyRate;
//         private int hoursWorked;

//         public void setHourlyRate(double hourlyRate) {
//             this.hourlyRate = hourlyRate;
//         }

//         public double getHourlyRate() {
//             return hourlyRate;
//         }

//         public void setHoursWorked(int hoursWorked) {
//             this.hoursWorked = hoursWorked;
//         }

//         public int getHoursWorked() {
//             return hoursWorked;
//         }

//         public double calculateSalary() {
//             return getBasicSalary() + (hourlyRate * hoursWorked);
//         }
//     }

//     // Main method
//     public static void main(String[] args) {
//         // Full-time employee example
//         FullTime fullTimeEmployee = new FullTime();
//         fullTimeEmployee.setBasicSalary(50000);
//         fullTimeEmployee.setBenefits(10000);
//         System.out.println("Full-time employee salary: " + fullTimeEmployee.calculateSalary());

//         // Part-time employee example
//         PartTime partTimeEmployee = new PartTime();
//         partTimeEmployee.setBasicSalary(20000);
//         partTimeEmployee.setHourlyRate(20);
//         partTimeEmployee.setHoursWorked(80);
//         System.out.println("Part-time employee salary: " + partTimeEmployee.calculateSalary());
//     }
// }
