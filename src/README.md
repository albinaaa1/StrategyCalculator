
```markdown
# Assignment #5 - Strategy Design Pattern



## 📌 Project Overview
This project demonstrates the implementation of the **Strategy Behavioral Design Pattern** in Java (JDK 17) using a Calculator domain (**Option B**)[cite: 1]. 

The primary objective is to showcase how interchangeable algorithms can be encapsulated behind a common interface, effectively replacing nested conditional branching (`if/else` or `switch/case`) with polymorphism[cite: 2].

---

## 📁 Project Structure

```text
src/
└── strategy/
    ├── OperationStrategy.java       # Strategy Interface
    ├── AdditionStrategy.java        # Concrete Strategy: Addition
    ├── SubtractionStrategy.java     # Concrete Strategy: Subtraction
    ├── MultiplicationStrategy.java  # Concrete Strategy: Multiplication
    ├── DivisionStrategy.java        # Concrete Strategy: Division
    ├── CalculatorContext.java       # Context Class
    └── Main.java                    # Client Application

```

---

## 🛠 Tech Stack

* **Language:** Java 17


* **IDE:** IntelliJ IDEA


* **Build System:** Standard Java Compiler (`javac`)



---

## 🚀 How to Build and Run

### 1. Using IntelliJ IDEA

1. Open IntelliJ IDEA and select **Open Project**.


2. Choose the root folder of this repository.
3. Ensure **JDK 17** is configured under `File -> Project Structure -> Project`.


4. Navigate to `src/strategy/Main.java` and click **Run** (`Shift + F10`).

### 2. Using Command Line (Terminal)

Navigate to the root directory and run the following commands:

```bash
# Compile the Java classes
javac -d bin src/strategy/*.java

# Run the client program
java -cp bin strategy.Main

```

---

## 🧩 How to Add a New Strategy

The Strategy pattern allows adding new operations without modifying existing code (Open/Closed Principle).

1. Create a new class inside the `strategy` package implementing `OperationStrategy`:


```java
package strategy;

public class PowerStrategy implements OperationStrategy {
    @Override
    public double calculate(double a, double b) {
        return Math.pow(a, b);
    }
}

```


2. Pass an instance of your new strategy to `CalculatorContext` at runtime:


```java
context.setStrategy(new PowerStrategy());
System.out.println(context.executeStrategy(2, 3)); // Outputs: 8.0

```



```

```