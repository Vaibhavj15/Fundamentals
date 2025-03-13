// Example 1: Integer Data Type
int number = 10;

// Example 2: Double Data Type
double price = 19.99;

// Example 3: Character Data Type
char initial = 'A';


//Example 1: If-Else Statement
if (number > 0) {
 System.out.println("Positive Number");
} else {
 System.out.println("Negative Number");
}

//Example 2: Switch Statement
switch (number) {
 case 1:
     System.out.println("One");
     break;
 case 2:
     System.out.println("Two");
     break;
 default:
     System.out.println("Not One or Two");
}

//Example 3: For Loop
for (int i = 0; i < 5; i++) {
 System.out.println("Iteration: " + i);
}

//Example 1: One-Dimensional Array
int[] numbers = {1, 2, 3, 4, 5};

//Example 2: Two-Dimensional Array
int[][] matrix = {
 {1, 2, 3},
 {4, 5, 6}
};

//Example 3: Array Length
System.out.println("Length of array: " + numbers.length);


//Example 1: Method with Parameters
public static int add(int a, int b) {
 return a + b;
}

//Example 2: Method Overloading
public static double add(double a, double b) {
 return a + b;
}

//Example 3: Method Returning Value
public static String greet(String name) {
 return "Hello, " + name;
}


//Example 1: Try-Catch Block
try {
 int result = 10 / 0;
} catch (ArithmeticException e) {
 System.out.println("Cannot divide by zero");
}

//Example 2: Finally Block
try {
 int[] arr = new int[5];
 arr[10] = 1;
} catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Array index out of bounds");
} finally {
 System.out.println("Execution completed");
}

//Example 3: Throwing Exception
public static voiD checkAge(int age) throws Exception {
 if (age < 18) {
     throw new Exception("Not eligible to vote");
 }
}


//Example 1: Class and Object
class Car {
 String model;
 int year;

 Car(String model, int year) {
     this.model = model;
     this.year = year;
 }
}

//Example 2: Inheritance
class Vehicle {
 void start() {
     System.out.println("Vehicle started");
 }
}

class Bike extends Vehicle {
 void ride() {
     System.out.println("Bike is riding");
 }
}

//Example 3: Polymorphism
class Animal {
 void sound() {
     System.out.println("Animal makes sound");
 }
}

class Dog extends Animal {
 void sound() {
     System.out.println("Dog barks");
 }
}

//Example 1: ArrayList
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");

//Example 2: HashMap
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
map.put("One", 1);
map.put("Two", 2);

//Example 3: Iterating through a List
for (String fruit : list) {
 System.out.println(fruit);
}


//Example 1: Writing to a File
import java.io.FileWriter;
import java.io.IOException;

try {
 FileWriter writer = new FileWriter("output.txt");
 writer.write("Hello, World!");
 writer.close();
} catch (IOException e) {
 e.printStackTrace();
}

//Example 2: Reading from a File
import java.nio.file.Files;
import java.nio.file.Paths;

try {
 String content = new String(Files.readAllBytes(Paths.get("output.txt")));
 System.out.println(content);
} catch (IOException e) {
 e.printStackTrace();
}

//Example 3: File Existence Check
import java.io.File;

File file = new File("output.txt");
if (file.exists()) {
 System.out.println("File exists");
} else {
 System.out.println("File does not exist");
}
//Example 1: Creating a Thread
class MyThread extends Thread {
 public void run() {
     System.out.println("Thread is running");
 }
}

MyThread thread = new MyThread();
thread.start();

//Example 2: Implementing Runnable
class MyRunnable implements Runnable {
 public void run() {
     System.out.println("Runnable is running");
 }
}

Thread thread2 = new Thread(new MyRunnable());
thread2.start();

//Example 3: Thread Synchronization
class Counter {
 private int count = 0;

 public synchronized void increment() {
     count++;
 }
}
