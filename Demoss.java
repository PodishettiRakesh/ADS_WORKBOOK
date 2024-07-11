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