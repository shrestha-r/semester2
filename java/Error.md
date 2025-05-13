# ❗ Error Handling in Java

Error handling in Java is done through a robust **exception handling mechanism** using `try`, `catch`, `throw`, `throws`, and `finally`.

---

## ⚠️ What Is an Exception?

An **exception** is an **unexpected event** that disrupts the normal flow of a program. It occurs during runtime.

---

## 🧩 Types of Exceptions

### 1. **Checked Exceptions**
- Handled at compile time.
- Examples: `IOException`, `SQLException`

```java
import java.io.*;

public class FileRead {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("data.txt"); // may throw IOException
    }
}
```

### 2. **Unchecked Exceptions**
- Occur at runtime.
- Examples: `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException`

```java
int result = 10 / 0; // ArithmeticException
```

---

## 🔁 Exception Hierarchy

```
Object
 └── Throwable
      ├── Error (serious, not caught by programs)
      └── Exception
           ├── Checked Exceptions
           └── Unchecked Exceptions (RuntimeException)
```

---

## 🧪 Try-Catch Block

### ✅ Syntax:

```java
try {
    // code that may throw an exception
} catch (ExceptionType name) {
    // code to handle the exception
}
```

### Example:

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}
```

---

## 🔁 Multiple Catch Blocks

```java
try {
    int[] nums = new int[3];
    System.out.println(nums[5]);
} catch (ArithmeticException e) {
    System.out.println("Math error!");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index out of bounds!");
} catch (Exception e) {
    System.out.println("General error: " + e);
}
```

---

## 🧹 Finally Block

The `finally` block is always executed, regardless of whether an exception occurred or not.

```java
try {
    int result = 10 / 2;
} catch (Exception e) {
    System.out.println("Error occurred");
} finally {
    System.out.println("This will always run");
}
```

---

## 🎯 Throwing an Exception Manually

Use the `throw` keyword:

```java
throw new ArithmeticException("Custom error message");
```

---

## 📝 Throws Keyword

Use `throws` to declare an exception that a method might throw:

```java
public void readFile() throws IOException {
    FileReader fr = new FileReader("file.txt");
}
```

---

## ✅ Best Practices

- Catch the **most specific** exception first.
- Avoid catching `Exception` unless absolutely necessary.
- Always **close resources** (or use try-with-resources).
- Provide **meaningful messages** in your catch blocks.

---

## 🔄 Try-with-Resources (Java 7+)

Automatically closes resources like files, sockets, etc.

```java
import java.io.*;

try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    System.out.println(br.readLine());
} catch (IOException e) {
    System.out.println("File error");
}
```

---

## 📌 Example: Custom Exception

```java
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExample {
    static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Age must be 18+");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (MyException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
```
