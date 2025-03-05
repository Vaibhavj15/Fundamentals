import java.util.Scanner;

// Scanner 
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("itachi: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + itachi + "!");
        scanner.close();
    }
}
// Single Dimensional Array 
public class SingleDimensionalArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
// Multi Dimensional Array 
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// Constructor 
class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    void displayModel() {
        System.out.println("Car model: " + model);
    }
}
// Inheritance
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
// Abstract Class
abstract class Shape {
    abstract void draw();
}
class Circle extends Shape implements Colorable {
    void draw() {
        System.out.println("Drawing a Circle");
    }

    public void color() {
        System.out.println("Coloring the Circle");
    }
}
public class AbstractClassInterface{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.color();
    }
}
