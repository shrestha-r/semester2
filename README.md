# 📘 Java Comprehensive Notes

## 🧠 Overview
Java is a high-level, object-oriented programming language developed by Sun Microsystems (now Oracle). It supports **Write Once, Run Anywhere** through the Java Virtual Machine (JVM).

---

## 📦 Basic Structure

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- `public class`: Declares a class  
- `main` method: Starting point of the application  
- `System.out.println()`: Prints output to console

---

## 🔢 Data Types

### Primitive Types

| Type     | Size   | Example           |
|----------|--------|-------------------|
| `byte`   | 1 byte | `byte b = 10;`    |
| `short`  | 2 bytes| `short s = 100;`  |
| `int`    | 4 bytes| `int a = 500;`    |
| `long`   | 8 bytes| `long l = 100L;`  |
| `float`  | 4 bytes| `float f = 2.3f;` |
| `double` | 8 bytes| `double d = 2.3;` |
| `char`   | 2 bytes| `char c = 'A';`   |
| `boolean`| 1 bit  | `boolean b = true;` |

### Non-Primitive Types
- `String`
- `Array`
- `Class`
- `Object`

---

## 🧮 Operators

- **Arithmetic**: `+`, `-`, `*`, `/`, `%`
- **Assignment**: `=`, `+=`, `-=`, `*=`, `/=`, `%=`
- **Comparison**: `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical**: `&&`, `||`, `!`
- **Unary**: `++`, `--`, `+`, `-`, `!`
- **Ternary**: `condition ? expr1 : expr2`

---

## 🔁 Loops

### `for` Loop
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### `while` Loop
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### `do-while` Loop
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

## 🔀 Conditionals

### `if-else`
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

### Syntax:
```java
returnType methodName(parameters) {
    // method body
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

## 🖥️ Command-line Arguments

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

## ✅ Best Practices

- Class names should be in PascalCase  
- Use consistent indentation (4 spaces)  
- Close I/O resources (e.g. `sc.close()`)  
- Use comments (`//` or `/* */`) to clarify logic  

---

# 🚀 Advanced Java Topics

## 🧬 Inheritance

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

---

## 🔁 Polymorphism

### Compile-time (Overloading)
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

### Runtime (Overriding)
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

---

## 🛑 Abstraction

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

---

## 🔐 Encapsulation

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

---

## 🎯 Interfaces

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

---

## ❗ Exception Handling

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("Always executed");
}
```

---

## 📂 File Handling

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


# 🖨️ Print Formatting in Java

Java provides several ways to display output to the console. The most commonly used are:

---

## ✅ `System.out.print()`

Prints text to the console **without** moving to a new line.

```java
System.out.print("Hello ");
System.out.print("World!");
```

**Output:**
```
Hello World!
```

---

## ✅ `System.out.println()`

Prints text to the console and **moves to the next line**.

```java
System.out.println("Hello");
System.out.println("World");
```

**Output:**
```
Hello
World
```

---

## ✅ `System.out.printf()` – Formatted Output

The `printf()` method provides **formatted printing**, similar to C’s `printf()`.

### 📌 Syntax:
```java
System.out.printf("format string", values);
```

### 🔤 Format Specifiers

| Specifier | Description                     | Example Output            |
|-----------|---------------------------------|---------------------------|
| `%d`      | Decimal integer                 | `System.out.printf("%d", 10);` → `10` |
| `%f`      | Floating-point number           | `%.2f` → 2 decimal places |
| `%s`      | String                          | `System.out.printf("%s", "Hello");` |
| `%c`      | Character                       | `System.out.printf("%c", 'A');` |
| `%%`      | Literal percent sign            | `System.out.printf("100%%");` → `100%` |

---

## 🔧 Example: Basic Formatting
```java
int age = 25;
String name = "Alice";
System.out.printf("Name: %s, Age: %d\n", name, age);
```

**Output:**
```
Name: Alice, Age: 25
```

---

## 🔍 Example: Floating-point Precision
```java
double pi = 3.1415926535;
System.out.printf("Pi rounded: %.2f\n", pi);
```

**Output:**
```
Pi rounded: 3.14
```

---

## 📏 Width and Alignment

You can define **minimum field width** and align text:

```java
System.out.printf("|%10s|\n", "Java");  // right-align
System.out.printf("|%-10s|\n", "Java"); // left-align
```

**Output:**
```
|      Java|
|Java      |
```

---

## 📝 Notes

- Use `\n` for a **new line** inside `printf`.
- Combine `%` specifiers with modifiers (`%.2f`, `%-10s`, etc.).
- `printf` is very useful for **tables and reports** in console apps.

---

Would you like an example of formatted table printing or writing this output to a file?


# 📦 Variable Scope in Java

In Java, the **scope of a variable** determines where it can be **accessed or modified** within the code. It depends on **where the variable is declared**.

---

## 🔹 1. Local Scope

- Variables declared inside a **method, constructor, or block**.
- Only accessible within that block.
- Must be initialized before use.

```java
public class Example {
    public void show() {
        int localVar = 10;
        System.out.println(localVar); // accessible
    }
    // System.out.println(localVar); // ❌ Error: not visible here
}
```

---

## 🔸 2. Instance Scope (Object Scope)

- Variables declared inside a class but **outside any method**.
- Each object of the class gets its **own copy**.
- Can be accessed in methods **with `this` keyword** or directly.

```java
public class Person {
    String name; // instance variable

    void introduce() {
        System.out.println("My name is " + name);
    }
}
```

---

## 🔸 3. Static Scope (Class Scope)

- Declared using the `static` keyword.
- Belongs to the class itself, not instances.
- Shared across all objects.

```java
public class Counter {
    static int count = 0;

    Counter() {
        count++; // same for all instances
    }
}
```

---

## 🔹 4. Block Scope

- Variables declared in **loops or conditional blocks**.
- Exist only within those `{ }` brackets.

```java
public class Demo {
    public void test() {
        if (true) {
            int x = 5;
            System.out.println(x); // accessible
        }
        // System.out.println(x); // ❌ Error: x is out of scope
    }
}
```

---

## 🔍 Scope Levels Summary

| Scope        | Declared in...                | Accessible in...             |
|--------------|-------------------------------|-------------------------------|
| Local        | Method, constructor, block    | Only within that method/block|
| Instance     | Class (no `static`)           | Whole class, per object      |
| Static       | Class with `static` modifier  | Entire class, shared         |
| Block        | Inside `{ }` like loops/if    | Only within those brackets   |

---

## ✅ Best Practices

- Keep variables in the **narrowest scope** possible to improve readability.
- **Avoid shadowing** instance variables with local variables of the same name.
- Use `this.variableName` to distinguish between local and instance variables if needed.

```java
class Example {
    int value;

    void setValue(int value) {
        this.value = value; // distinguish local and instance variable
    }
}
```

---

Let me know if you want this added to your Java notes document!

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

