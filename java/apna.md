# Java Comprehensive Notes

## 🧠 Overview

Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle). It follows the principle of "Write Once, Run Anywhere" due to the Java Virtual Machine (JVM).

---

## 📦 Basic Structure

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

* `public class`: defines a class
* `main` method: entry point of the program
* `System.out.println()`: prints output to the console

---

## 🔢 Data Types

### Primitive Types

| Type      | Size    | Example             |
| --------- | ------- | ------------------- |
| `byte`    | 1 byte  | `byte b = 10;`      |
| `short`   | 2 bytes | `short s = 100;`    |
| `int`     | 4 bytes | `int a = 500;`      |
| `long`    | 8 bytes | `long l = 100L;`    |
| `float`   | 4 bytes | `float f = 2.3f;`   |
| `double`  | 8 bytes | `double d = 2.3;`   |
| `char`    | 2 bytes | `char c = 'A';`     |
| `boolean` | 1 bit   | `boolean b = true;` |

### Non-Primitive Types

* `String`, `Array`, `Class`, `Object`

---

## 🧮 Operators

### Arithmetic

`+`, `-`, `*`, `/`, `%`

### Assignment

`=`, `+=`, `-=`, `*=`, `/=`, `%=`

### Comparison

`==`, `!=`, `>`, `<`, `>=`, `<=`

### Logical

`&&`, `||`, `!`

### Unary

`++`, `--`, `+`, `-`, `!`

### Ternary

`condition ? expr1 : expr2`

---

## 🔁 Loops

### `for`

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### `while`

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### `do-while`

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

## 🔀 Conditionals

### `if`, `else if`, `else`

```java
if (a > b) {
    // do something
} else {
    // do something else
}
```

### `switch`

```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    default:
        System.out.println("Other day");
}
```

---

## 🧱 Classes and Objects

```java
class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void introduce() {
        System.out.println("Hi, I'm " + name + ", age " + age);
    }
}
```

---

## 🔧 Methods

```java
returnType methodName(parameters) {
    // code
    return value;
}
```

### Example:

```java
int add(int a, int b) {
    return a + b;
}
```

---

## 📥 User Input

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
String name = sc.nextLine();
sc.close();
```

---

## 📌 Command-line Arguments

```java
public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
```

---

## ☑️ Best Practices

* Class names should start with a capital letter
* Use proper indentation
* Close resources like `Scanner` with `sc.close()`
* Use comments (`//` or `/* */`) to explain complex code

---

# 🚀 Advanced Java Topics

## 🧬 Inheritance

Inheritance allows one class to inherit the properties of another.

```java
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
```

## 🔁 Polymorphism

Allows methods to perform different tasks based on the object that calls them.

### Compile-time (Method Overloading):

```java
class Math {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}
```

### Runtime (Method Overriding):

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
```

## 🛑 Abstraction

Hiding implementation details and showing only essential features.

### Abstract Class:

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
```

## 🔐 Encapsulation

Wrapping data and code into a single unit (class) and using access modifiers.

```java
class Person {
    private String name;

    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}
```

## 🎯 Interfaces

Used to achieve full abstraction.

```java
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}
```

## ❗ Exception Handling

Handle runtime errors gracefully.

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("This block always executes");
}
```

## 📄 File Handling

### Writing to a File:

```java
import java.io.FileWriter;

FileWriter writer = new FileWriter("output.txt");
writer.write("Hello, file!");
writer.close();
```

### Reading from a File:

```java
import java.io.File;
import java.util.Scanner;

File file = new File("output.txt");
Scanner sc = new Scanner(file);
while (sc.hasNextLine()) {
    System.out.println(sc.nextLine());
}
sc.close();
```

---

Let me know if you want to include collections, threads, or JDBC as well!


# Creating the markdown content as a string
java_oop_notes_md = '''
# Java Object-Oriented Programming (OOP) Notes

## Object-Oriented Programming Overview

Object-Oriented Programming (OOP) is a methodology for designing programs using **classes** and **objects**. It simplifies software development and maintenance by providing the following concepts:

- **Class**: A user-defined data type that defines properties and functions. It is a logical representation and does not occupy memory until an object is instantiated.
  - *Example*: A `Human` class with body parts as properties and actions as functions.

- **Object**: A runtime entity; an instance of a class. It can represent any real-world entity and can operate on both data members and member functions.

### Example 1: Student Class

```
class Student {
   String name;
   int age;
  
   public void getInfo() {
       System.out.println("The name of this Student is " + this.name);
       System.out.println("The age of this Student is " + this.age);
   }
}

public class OOPS {
   public static void main(String args[]) {
       Student s1 = new Student();
       s1.name = "Aman";
       s1.age = 24;
       s1.getInfo();

       Student s2 = new Student();
       s2.name = "Shradha";
       s2.age = 22;
       s2.getInfo();
   }
}
```

### Example 2: Pen Class

```
class Pen {
   String color;
  
   public void printColor() {
       System.out.println("The color of this Pen is " + this.color);
   }
}

public class OOPS {
   public static void main(String args[]) {
       Pen p1 = new Pen();
       p1.color = "blue";

       Pen p2 = new Pen();
       p2.color = "black";

       Pen p3 = new Pen();
       p3.color = "red";

       p1.printColor();
       p2.printColor();
       p3.printColor();
   }
}
```

**Note**: When an object is created using the `new` keyword, space is allocated in the heap, and the reference is stored in the stack memory.

### `this` Keyword

The `this` keyword in Java refers to the current instance of the class. It is used to:
- Pass the current object as a parameter to another method
- Refer to the current class instance variable

---

## Constructors

A **constructor** is a special method invoked automatically at the time of object creation, used to initialize data members.

- Constructors have the same name as the class.
- No return type (not even `void`).
- Called only once at object creation.

### Types of Constructors

1. **Non-Parameterized Constructor**: No arguments.
   ```
   class Student {
      String name;
      int age;
   
      Student() {
          System.out.println("Constructor called");
      }
   }
   ```
2. **Parameterized Constructor**: Takes arguments to provide different values to objects.
   ```
   class Student {
      String name;
      int age;
   
      Student(String name, int age) {
          this.name = name;
          this.age = age;
      }
   }
   ```
3. **Copy Constructor**: Initializes an object from another object. Only user-defined in Java.
   ```
   class Student {
      String name;
      int age;
   
      Student(Student s2) {
          this.name = s2.name;
          this.age = s2.age;
      }
   }
   ```

**Note**: Java has no destructor; it uses a garbage collector for memory management.

---

## Polymorphism

Polymorphism allows presenting the same interface for different underlying forms (data types).

### Types:

1. **Compile-Time Polymorphism (Static)**
   - Achieved through method overloading.

#### Method Overloading

Allows multiple functions with the same name but different parameters.

```
class Student {
   String name;
   int age;
  
   public void displayInfo(String name) {
       System.out.println(name);
   }

   public void displayInfo(int age) {
       System.out.println(age);
   }

   public void displayInfo(String name, int age) {
       System.out.println(name);
       System.out.println(age);
   }
}
```

2. **Runtime Polymorphism (Dynamic)**
   - Achieved through method overriding.

#### Method Overriding

Child class provides a specific implementation of a method already defined in the parent class.

```
class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}
class Circle extends Shape {
   public void area(int r) {
       System.out.println((3.14)*r*r);
   }  
}
```

---

## Inheritance

Inheritance enables one object to acquire properties and behaviors of another.

- **Derived class**: Inherits from another class (base class).
- **Base class**: The class being inherited from.

### Types of Inheritance

1. **Single Inheritance**: One class inherits another.
2. **Hierarchical Inheritance**: Multiple classes inherit from one base class.
3. **Multilevel Inheritance**: A class is derived from another derived class.
4. **Hybrid Inheritance**: Combination of simple, multiple, and hierarchical inheritance.

---

## Packages

A **package** is a group of similar types of classes, interfaces, and sub-packages.

- Built-in packages: `java`, `util`, `io`, etc.
- Example:
  ```
  import java.util.Scanner;
  import java.io.IOException;
  ```

---

## Access Modifiers

| Modifier   | Access Level Description                                                                 |
|------------|-----------------------------------------------------------------------------------------|
| private    | Only within the class                                                                   |
| default    | Only within the package                                                                 |
| protected  | Within the package and outside via child class                                          |
| public     | Everywhere                                                                              |

```
package newpackage;

class Account {
   public String name;
   protected String email;
   private String password;

   public void setPassword(String password) {
       this.password = password;
   }
}

public class Sample {
   public static void main(String args[]) {
       Account a1 = new Account();
       a1.name = "Apna College";
       a1.setPassword("abcd");
       a1.email = "hello@apnacollege.com";
   }
}
```

---

## Encapsulation

Encapsulation combines data and functions into a single unit (class). Data is accessed via functions, not directly. Attributes are kept private, and public getter/setter methods are provided.

---

## Abstraction

Abstraction means hiding unnecessary details and showing only essential features.

- Achieved via:
  - **Abstract Classes**
  - **Interfaces**

### Abstract Class

- Declared with `abstract` keyword.
- Can have abstract and non-abstract methods.
- Cannot be instantiated.

```
abstract class Animal {
   abstract void walk();
   void breathe() {
       System.out.println("This animal breathes air");
   }
   Animal() {
       System.out.println("You are about to create an Animal.");
   }
}

class Horse extends Animal {
   Horse() {
       System.out.println("Wow, you have created a Horse!");
   }
   void walk() {
       System.out.println("Horse walks on 4 legs");
   }
}
```

### Interfaces

- All fields are `public static final` by default.
- All methods are `public abstract` by default.
- A class implementing an interface must implement all its methods.
- Support multiple inheritance.

```
interface Animal {
   void walk();
}

class Horse implements Animal {
   public void walk() {
       System.out.println("Horse walks on 4 legs");
   }
}
```

---

## Static Keyword

Can be applied to:
- Variable (class variable)
- Method (class method)
- Block
- Nested class

```
class Student {
   static String school;
   String name;   
}

public class OOPS {
   public static void main(String args[]) {
       Student.school = "JMV";
       Student s1 = new Student();
       Student s2 = new Student();

       s1.name = "Meena";
       s2.name = "Beena";

       System.out.println(s1.school);
       System.out.println(s2.school);
   }
}
```

---

## Exception Handling

Exception handling is a mechanism to handle runtime errors, ensuring the normal flow of the application.

- **try**: The block of code to monitor for errors.
- **catch**: Handles the exception.
- **finally**: Executes code after try/catch, regardless of exception.
- **throw**: Used to explicitly throw an exception.
- **throws**: Declares an exception.

**Example:**
```
try {
    int data = 50 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("Finally block always executes");
}
```

---

## Generics

Generics enable types (classes and methods) to operate on objects of various types while providing compile-time type safety.

**Example:**
```
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10); // Only integers allowed
```

---

## Collections Framework

The Java Collections Framework provides classes and interfaces for storing and manipulating groups of data as a single unit.

- **List** (e.g., `ArrayList`, `LinkedList`)
- **Set** (e.g., `HashSet`, `TreeSet`)
- **Map** (e.g., `HashMap`, `TreeMap`)

**Example:**
```
List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
for (String name : names) {
    System.out.println(name);
}
```

---

## Inner Classes

A class defined within another class. Types include:

- **Member Inner Class**
- **Static Nested Class**
- **Local Inner Class**
- **Anonymous Inner Class**

**Example:**
```
class Outer {
    class Inner {
        void show() {
            System.out.println("Inside inner class");
        }
    }
}
```

---

## Lambda Expressions

Introduced in Java 8, lambda expressions provide a clear and concise way to represent a method interface using an expression.

**Syntax:**
```
(parameter) -> { expression }
```

**Example:**
```
List<String> list = Arrays.asList("a", "b", "c");
list.forEach(item -> System.out.println(item));
```

---

## Java Streams

Streams are used to process collections of objects in a functional style (introduced in Java 8).

**Example:**
```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream()
       .filter(n -> n % 2 == 0)
       .forEach(System.out::println); // Prints even numbers
```

---

## Final Keyword

The `final` keyword can be used with:
- **Variables**: Value cannot be changed (constant).
- **Methods**: Cannot be overridden.
- **Classes**: Cannot be subclassed.

**Example:**
```
final int MAX = 100;
final class Constants { ... }
```

---

## Singleton Class

A design pattern that restricts the instantiation of a class to one object.

**Example:**
```
class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

---

## Serialization

Serialization is the process of converting an object into a byte stream, so that it can be saved to a file or transmitted over a network.

**Example:**
```
import java.io.Serializable;
class Student implements Serializable {
    int id;
    String name;
}
```

---

## File Handling

Java provides classes for file input and output through the `java.io` package.

### Reading from a File

```
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Writing to a File

```
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, file handling in Java!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

*This file covers all essential Java OOP concepts, advanced features, and practical topics for effective programming!*
'''

# Writing the markdown content to a file
file_name = "Java_OOP_Notes.md"
with open(file_name, "w", encoding="utf-8") as f:
    f.write(java_oop_notes_md)

file_name
