# Smartphone Interface Demonstration

## Overview

This project demonstrates **multiple interface implementation** in Java.

A `Smartphone` can perform multiple independent behaviors, such as taking photos and playing music. Instead of using multiple inheritance (which Java does not support for classes), the `Smartphone` class implements two interfaces:

- `Camera`
- `MusicPlayer`

This project also demonstrates runtime polymorphism using interface references.

---

## Features

- Multiple interface implementation
- Runtime polymorphism
- Encapsulation
- Constructor validation
- Method overriding
- Interface references
- Clean and readable object-oriented design

---

## Project Structure

```
02-multiple-interfaces/
├── SmartphoneDemo.java
├── README.md
└── InterviewQuestions.md
```

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)

---

## OOP Concepts Used

- Interface
- Multiple Interface Implementation
- Encapsulation
- Runtime Polymorphism
- Method Overriding
- Constructor
- Validation
- Getters

---

## Class Design

### Interface: Camera

Defines the capability of taking a photo.

Method:

- `takePhoto()`

---

### Interface: MusicPlayer

Defines the capability of playing music.

Method:

- `playMusic()`

---

### Class: Smartphone

Implements:

- Camera
- MusicPlayer

Fields:

- Brand
- Model
- Storage

Methods:

- `takePhoto()`
- `playMusic()`
- `displayPhoneDetails()`

---

## Expected Output

```
Smartphone constructor executed.

------- Phone Details -------
Brand   : Samsung
Model   : Galaxy S24
Storage : 256 GB

Samsung Galaxy S24 captured a photo.

Samsung Galaxy S24 is playing music.
```

---

## Runtime Polymorphism

The same object is referenced using different interface types.

```java
Smartphone phone = new Smartphone("Samsung", "Galaxy S24", 256);

Camera c = phone;
MusicPlayer m = phone;

c.takePhoto();
m.playMusic();
```

Compile-time types:

- `Camera`
- `MusicPlayer`

Runtime type:

- `Smartphone`

Java decides at runtime which overridden method to execute.

---

## extends vs implements

| extends | implements |
|----------|------------|
| Used with classes | Used with interfaces |
| Supports single inheritance | Supports multiple interfaces |
| Inherits implementation and state | Implements behavior defined by interfaces |

---

## Multiple Inheritance vs Multiple Interface Implementation

### Multiple Inheritance (Not Supported)

```java
class A { }
class B { }

// Not allowed
class C extends A, B { }
```

Java does not allow a class to extend more than one class.

---

### Multiple Interface Implementation (Supported)

```java
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() { }

    @Override
    public void playMusic() { }
}
```

A class can implement multiple interfaces because interfaces define behavior without causing the ambiguity found in multiple inheritance.

---

## Key Learnings

- A class can implement multiple interfaces.
- Interfaces define a contract that implementing classes must follow.
- One object can be referenced using different interface types.
- Runtime polymorphism works with interface references.
- Java avoids multiple inheritance of classes but supports multiple interface implementation.
- Encapsulation and validation help create reliable and maintainable classes.

---

## Author

**Aradhya Thakur**

Java Backend Developer Journey • 2026
