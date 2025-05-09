# 🧱 Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) is a paradigm centered on **objects** that represent **real-world entities**, encapsulating both **state (data)** and **behavior (methods)**.

---

## 🎯 Key OOP Terms in Java

### ➤ Class
A **class** is a blueprint for creating objects. It defines:
- **Attributes (fields or properties)**
- **Constructors**
- **Methods (functions inside a class)**

```java
public class Person {
    // Attributes
    String name;
    int age;

    // Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method
    void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}
```

---

## 🧱 Attributes (Fields)
Variables declared inside a class but **outside any method**. These hold the **state** of an object.

```java
class Car {
    String model;
    int year;
}
```

🔹 **Best Practice**: Use `private` access modifier and access through getter/setter for encapsulation.

---

## 🛠️ Constructor
A **special method** used to initialize objects. It has:
- Same name as the class
- No return type (not even `void`)
- Can be overloaded

```java
class Book {
    String title;

    // Constructor
    Book(String t) {
        title = t;
    }
}
```

🔹 **Best Practice**: Use constructors to ensure required fields are initialized.

---

## 🔧 Methods
**Functions** inside a class that define **behavior** of objects.

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
```

🔹 **Best Practice**:
- Keep methods short and single-purpose
- Use meaningful names
- Reuse code through helper methods

---

## 🧠 Four Pillars of OOP

### 1. **Encapsulation**
Combines data (attributes) and methods in a class. Protects internal state via `private` fields and `public` getters/setters.

```java
class Account {
    private int balance;

    public void deposit(int amount) {
        if (amount > 0) balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
```

---

### 2. **Inheritance**
A class (child) **inherits** attributes and methods from another class (parent).

```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
```

🔹 **Use When**: Classes share common behaviors.

---

### 3. **Polymorphism**
Same interface, different behavior.

#### Compile-Time (Method Overloading)
```java
class Printer {
    void print(String text) { System.out.println(text); }
    void print(int number) { System.out.println(number); }
}
```

#### Run-Time (Method Overriding)
```java
class Animal {
    void sound() { System.out.println("Some sound"); }
}

class Cat extends Animal {
    @Override
    void sound() { System.out.println("Meow"); }
}
```

---

### 4. **Abstraction**
Hides internal implementation and exposes only relevant details.

#### Using Abstract Class
```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
}
```

#### Using Interface
```java
interface Drawable {
    void draw();
}

class Square implements Drawable {
    public void draw() { System.out.println("Drawing Square"); }
}
```

---

## 🧪 Real-World Example (Combining All Concepts)

```java
interface Vehicle {
    void drive();
}

abstract class Engine {
    abstract void start();
}

class Car extends Engine implements Vehicle {
    private String model;

    // Constructor
    Car(String model) {
        this.model = model;
    }

    // Method from Interface
    public void drive() {
        System.out.println(model + " is driving.");
    }

    // Method from Abstract Class
    void start() {
        System.out.println(model + "'s engine started.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.start();
        myCar.drive();
    }
}
```

---

## 📌 Summary Table

| Term         | Definition                                 | Example                      |
|--------------|---------------------------------------------|------------------------------|
| Class        | Blueprint for creating objects              | `class Car {}`               |
| Object       | Instance of a class                         | `new Car()`                  |
| Attribute    | Variable that defines object’s state        | `String model;`              |
| Method       | Function that defines behavior              | `void start()`               |
| Constructor  | Special method to initialize an object      | `Car(String model)`          |
| Inheritance  | Mechanism to acquire behavior from parent   | `class Dog extends Animal`   |
| Polymorphism | Same method, different behavior             | `sound()` in `Animal`, `Dog` |
| Abstraction  | Hiding internal implementation              | `abstract class` or `interface` |
| Encapsulation| Hiding fields using access control          | `private int age;` + getter  |

---

## ✅ Best Practices

- Use **nouns** for class names (`Car`, `Person`) and **verbs** for method names (`drive()`, `getName()`).
- Make fields `private`, and expose through **getters/setters**.
- Use **constructors** to enforce mandatory field initialization.
- Use **interfaces** to define common behavior across unrelated classes.
- Apply **SOLID** principles for maintainable code.

---

Would you like a downloadable `.md` or `.pdf` version of this full guide?



# 🔧 Functions (Methods) in Java

In Java, **functions** are known as **methods** and are always defined inside a **class**. They define the behavior of objects or classes.

---

## 📌 Syntax of a Method

```java
returnType methodName(parameters) {
    // body of method
    return value; // if returnType is not void
}
```

### Example:
```java
int add(int a, int b) {
    return a + b;
}
```

---

## ✅ Types of Methods

### 1. **Instance Methods**
Operate on specific objects.

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
```

**Usage:**
```java
Calculator calc = new Calculator();
int result = calc.add(3, 4);
```

---

### 2. **Static Methods**
Belong to the class, not any specific object. Call them using the class name.

```java
class MathUtils {
    static int square(int n) {
        return n * n;
    }
}
```

**Usage:**
```java
int sq = MathUtils.square(5);
```

---

## 🛠️ Method Parameters and Arguments

### Pass by Value
Java passes all arguments by **value**, even objects (object references are copied).

```java
void greet(String name) {
    System.out.println("Hello, " + name);
}
```

---

## 🌀 Method Overloading
Same method name with different parameters.

```java
class Printer {
    void print(String text) {
        System.out.println(text);
    }

    void print(int number) {
        System.out.println(number);
    }
}
```

---

## 🧱 Return Types

### No return (void)
```java
void greet() {
    System.out.println("Hello!");
}
```

### Returning a value
```java
int multiply(int a, int b) {
    return a * b;
}
```

---

## 🔁 Calling Methods

### From `main`:
```java
public class App {
    static void sayHi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        sayHi();
    }
}
```

### From another object:
```java
Person p = new Person();
p.introduce();
```

---

## ✍️ Real-World Example

```java
class BankAccount {
    private int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    int getBalance() {
        return balance;
    }
}
```

---

## 🎯 Best Practices

- Use **descriptive names** for methods (e.g., `calculateSalary()`, not `calc()`).
- Use **camelCase** for method names.
- Group related methods in a **class**.
- Keep methods **short and focused** on one task.
- **Avoid side effects** in methods unless intentional.
- Use **`static` methods** for utility functions that don’t depend on object state.

---

## 🧪 Method vs Function in Java

| Concept       | Java Terminology | Notes                                 |
|---------------|------------------|---------------------------------------|
| Function      | Method           | Always part of a class                |
| Free function | ❌ Not allowed    | Java doesn't support standalone functions |
| Static method | ✅ Yes            | Belongs to the class, not object      |
| Instance method | ✅ Yes          | Requires an object to call            |

---

## 📝 Summary

```java
// Static Method
public static int sum(int a, int b) {
    return a + b;
}

// Instance Method
public int subtract(int a, int b) {
    return a - b;
}
```

🔹 **Static** → use without creating object  
🔹 **Instance** → use via object of class

---

Would you like a section on **access modifiers**, **recursive methods**, or **lambda expressions** too?


# 📁 Java File System & File Handling

Java provides APIs in the `java.io` and `java.nio.file` packages to interact with the file system — creating, reading, writing, and deleting files and directories.

---

## 🧰 Key Classes for File Handling

| Class            | Package          | Purpose                        |
|------------------|------------------|--------------------------------|
| `File`           | `java.io`        | Represent file or directory    |
| `FileReader`     | `java.io`        | Read from a file (char stream) |
| `FileWriter`     | `java.io`        | Write to a file (char stream)  |
| `Scanner`        | `java.util`      | Easy file reading              |
| `BufferedReader` | `java.io`        | Efficient file reading         |
| `Paths`, `Files` | `java.nio.file`  | Advanced file operations       |

---

## 📄 Creating a File

```java
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

---

## 📝 Writing to a File

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, Java File Handling!");
            writer.close();
            System.out.println("Successfully written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

## 📖 Reading from a File

### Using `Scanner`:
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

---

## 🗑️ Deleting a File

```java
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.delete()) {
            System.out.println("Deleted file: " + file.getName());
        } else {
            System.out.println("File deletion failed.");
        }
    }
}
```

---

## 📁 Directories

### Creating a Directory:
```java
File dir = new File("myFolder");
if (dir.mkdir()) {
    System.out.println("Directory created");
}
```

### List Files in a Directory:
```java
File folder = new File("myFolder");
for (String fileName : folder.list()) {
    System.out.println(fileName);
}
```

---

## 📝 Best Practices

- Always close streams (`Scanner`, `FileWriter`, etc.)
- Use `try-with-resources` for automatic closing
- Use `BufferedReader` or `Files.lines()` for large files
- Use `java.nio.file` for more modern file operations

---

## ✅ When to Use

| Scenario                        | Use                                   |
|----------------------------------|----------------------------------------|
| Basic file I/O                  | `File`, `FileWriter`, `Scanner`       |
| Performance-critical I/O        | `BufferedReader`, `BufferedWriter`    |
| Modern, efficient file access   | `Paths`, `Files` (NIO.2)               |

---

Would you like examples using `Files.readAllLines()`, `BufferedWriter`, or working with binary files?


# 🧮 Arrays in Java

An **array** is a data structure that stores **multiple values of the same type** in a single variable, instead of declaring separate variables for each value.

---

## 🔹 Declaration and Initialization

### ✅ Syntax:

```java
// Declaration only
int[] arr;

// Declaration + Allocation
arr = new int[5];

// Declaration + Initialization
int[] arr = {1, 2, 3, 4, 5};
```

---

## 🔸 Accessing Elements

- Arrays are **zero-indexed**
```java
int[] arr = {10, 20, 30};
System.out.println(arr[0]); // 10
System.out.println(arr[2]); // 30
```

---

## 🔸 Modifying Elements

```java
arr[1] = 99;
System.out.println(arr[1]); // 99
```

---

## 🔸 Array Length

```java
int len = arr.length;
System.out.println("Length: " + len);
```

---

## 🔁 Looping through Arrays

### For Loop
```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### For-Each Loop
```java
for (int value : arr) {
    System.out.println(value);
}
```

---

## 🧪 Multi-dimensional Arrays

### 2D Array Declaration and Initialization:
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
System.out.println(matrix[0][1]); // 2
```

### 2D Array Iteration:
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

## ⚙️ Common Array Operations

- **Sorting:**
```java
import java.util.Arrays;

int[] numbers = {5, 2, 8, 1};
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers)); // [1, 2, 5, 8]
```

- **Copying:**
```java
int[] copy = Arrays.copyOf(numbers, numbers.length);
```

- **Searching:**
```java
int index = Arrays.binarySearch(numbers, 5); // array must be sorted
```

---

## 🚫 Array Limitations

- Fixed size (cannot grow or shrink).
- Only stores **same data type**.

For dynamic arrays, use **ArrayList** (part of Java Collections Framework).

---

## ✅ Best Practices

- Always check `array.length` to avoid `ArrayIndexOutOfBoundsException`.
- Use `Arrays.toString(array)` for easy printing.
- Use enhanced for-loops when modification is not required.

---

## 🧠 Example: Full Array Code

```java
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};

        System.out.println("Original: " + Arrays.toString(nums));

        nums[2] = 99;
        System.out.println("Modified: " + Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println("Sorted: " + Arrays.toString(nums));
    }
}
```


# 📜 Strings in Java

A **String** in Java is a sequence of characters enclosed in double quotes. It is a **non-primitive data type** and part of the **`java.lang` package**.

---

## 🔹 Creating Strings

### Using String Literals:
```java
String name = "Rahul";
```

### Using the `new` Keyword:
```java
String name = new String("Rahul");
```

> 🔸 Literal strings are stored in the **String pool**, while `new` creates a new object in the heap.

---

## 🧪 Common String Methods

| Method                | Description                           | Example                                      |
|-----------------------|---------------------------------------|----------------------------------------------|
| `length()`            | Returns the length of the string      | `str.length()`                               |
| `charAt(index)`       | Gets character at given index         | `str.charAt(2)` → `'h'`                      |
| `substring(start)`    | Returns substring from start          | `str.substring(3)`                           |
| `substring(start,end)`| Substring from start to end-1         | `str.substring(1,4)`                         |
| `toLowerCase()`       | Converts to lowercase                 | `str.toLowerCase()`                          |
| `toUpperCase()`       | Converts to uppercase                 | `str.toUpperCase()`                          |
| `trim()`              | Removes leading/trailing spaces       | `"  text  ".trim()`                          |
| `contains(str)`       | Checks if substring exists            | `str.contains("abc")`                        |
| `replace(a, b)`       | Replaces all occurrences              | `str.replace('a', 'b')`                      |
| `equals(str)`         | Checks value equality                 | `str.equals("text")`                         |
| `equalsIgnoreCase()`  | Value equality ignoring case          | `str.equalsIgnoreCase("TEXT")`               |
| `compareTo()`         | Lexicographical comparison            | `str1.compareTo(str2)`                       |
| `split(delimiter)`    | Splits string into array              | `str.split(" ")`                             |
| `indexOf(char)`       | First index of character              | `str.indexOf('l')`                           |
| `last
