// Arrays
let fruits = ['Apple', 'Banana', 'Cherry'];
console.log(fruits);

// String
let greeting = "Hello, World!";
console.log(greeting);

// String Manipulation
let name = "John Doe";
let upperCaseName = name.toUpperCase();
console.log(upperCaseName);

// Document Object Model (DOM) Manipulation
document.body.innerHTML = "<h1>Welcome to JavaScript!</h1>";

// Arrays
let fruits = ['green apple', 'cherrys', 'Berrys'];
console.log(fruits);

// String
let greeting = "Lesggooo!";
console.log(greeting);

// String Manipulation
let name = "Vaibhav j";
let upperCaseName = name.toUpperCase();
console.log(upperCaseName);

// Document Object Model (DOM) Manipulation
document.body.innerHTML = "<h1>Welcome to JavaScript!</h1>";


// Arrays
let fruits = ['Apple', 'Banana', 'Cherry'];
console.log(fruits);

// String
let greeting = "Hello, World!";
console.log(greeting);

// String Manipulation
let name = "John";
let personalizedGreeting = greeting.replace("World", name);
console.log(personalizedGreeting);

// Document Object Model (DOM)
let heading = document.createElement('h1');
heading.textContent = "Welcome to JavaScript!";
document.body.appendChild(heading);

// Advanced Document Object Model
let list = document.createElement('ul');
fruits.forEach(fruit => {
    let listItem = document.createElement('li');
    listItem.textContent = fruit;
    list.appendChild(listItem);
});
document.body.appendChild(list);

//  Creating an array
let fruits = ['Apple', 'Banana', 'Cherry'];

//  Accessing array elements
console.log(fruits[1]); // Output: Banana

//  Adding an element to an array
fruits.push('Date');

//  Removing an element from an array
fruits.pop();

//  Iterating through an array
fruits.forEach(fruit => console.log(fruit));

//  Creating a string
let greeting = "Hello, World!";

//  Accessing characters in a string
console.log(greeting[7]); // Output: W

//  Finding the length of a string
console.log(greeting.length); // Output: 13

//  Converting a string to uppercase
console.log(greeting.toUpperCase()); // Output: HELLO, WORLD!

//  Replacing a substring
let newGreeting = greeting.replace("World", "JavaScript");

//  Splitting a string into an array
let sentence = "JavaScript is fun";
let words = sentence.split(" ");

//  Joining an array into a string
let joined = words.join(", ");

//  Trimming whitespace
let paddedString = "   Hello   ";
console.log(paddedString.trim()); // Output: Hello

//  Extracting a substring
let substring = sentence.substring(0, 10); // Output: JavaScript

//  Converting a string to lowercase
console.log(sentence.toLowerCase()); // Output: javascript is fun
