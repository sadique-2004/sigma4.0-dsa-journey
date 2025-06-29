## 📚 OOPS in Java

Welcome to my **OOPS** folder!
Here I keep all my Java code related to **Object-Oriented Programming System (OOPS)** concepts.
This repository is helpful for beginners who want to understand core OOPS principles with simple examples.

---

## ✅ What is OOPS?

**OOPS** is a programming approach that uses **objects** and **classes** to organize code, making it reusable, scalable, and easy to maintain.

The main pillars of OOPS are:
1️⃣ **Class & Object**
2️⃣ **Encapsulation**
3️⃣ **Inheritance**
4️⃣ **Polymorphism**
5️⃣ **Abstraction**

---

## 📌 1️⃣ Class & Object

**Class:** Blueprint/template for creating objects.
**Object:** Instance of a class.

**Example:**

```java
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Object
        myCar.color = "Red";
        myCar.speed = 120;
        myCar.drive();
    }
}
```

---

## 📌 2️⃣ Encapsulation

**Encapsulation** means wrapping data (variables) and code (methods) together and restricting direct access to some components.

➡️ Achieved using **private** variables and **getter/setter** methods.

**Example:**

```java
class Student {
    private String name; // Private variable

    // Setter
    public void setName(String newName) {
        name = newName;
    }

    // Getter
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John");
        System.out.println(s.getName());
    }
}
```

---

## 📌 3️⃣ Inheritance

**Inheritance** means one class can inherit properties and methods of another class.

➡️ Use **extends** keyword.

**Example:**

```java
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Parent class method
        d.bark(); // Child class method
    }
}
```

---

## 📌 4️⃣ Polymorphism

**Polymorphism** means one thing behaving differently in different situations.

➡️ **Compile-time Polymorphism (Method Overloading)**
➡️ **Run-time Polymorphism (Method Overriding)**

**Method Overloading Example:**

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));       // int version
        System.out.println(c.add(2.5, 3.5));   // double version
    }
}
```

**Method Overriding Example:**

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cat(); // Upcasting
        a.sound(); // Calls Cat's sound()
    }
}
```

---

## 📌 5️⃣ Abstraction

**Abstraction** means hiding complex implementation and showing only necessary features.

➡️ Achieved using **abstract class** or **interface**.

**Example (Abstract Class):**

```java
abstract class Shape {
    abstract void draw(); // Abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
```

---

## 🗂️ How to Use

* Each concept has separate files/folders in this repo.
* Check the examples, run them, and try your own code!
* Clone this repo and practice yourself.

---

## 🤝 Contribution

Feel free to fork, improve, or suggest changes.
PRs are welcome!

---

## 📧 Connect with Me

If you find this helpful, do give it a ⭐️!
Let’s connect and learn together.

---

**Happy Coding! 🚀**
