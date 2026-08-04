# Camera Helper Demo (Java 9 Private Methods in Interfaces)

## Overview

This project demonstrates the features introduced in Java 9 for interfaces, including private methods and private static methods.

The project models a simple camera system where a smartphone implements the `Camera` interface. The interface contains abstract, default, static, private, and private static methods to demonstrate how modern Java interfaces work.

---

## Features

- Interface implementation
- Abstract interface method
- Default interface method
- Static interface method
- Private interface method
- Private static interface method
- Constructor validation
- Encapsulation
- Method overriding

---

## Project Structure

```text
08-interfaces/
└── 05-private-methods/
    ├── CameraHelperDemo.java
    ├── README.md
    └── InterviewQuestions.md
```

---

## Concepts Used

### Abstract Method

Defines behavior that must be implemented by every class.

Example:

```java
void takePhoto();
```

---

### Default Method

Provides a default implementation that is automatically inherited by implementing classes.

Example:

```java
default void recordVideo()
```

---

### Static Method

Belongs to the interface itself and must be called using the interface name.

Example:

```java
Camera.showPhotographyTips();
```

---

### Private Method

A helper method used only inside the interface to avoid duplicate code.

Example:

```java
private void prepareCamera()
```

---

### Private Static Method

A helper method used only by static methods inside the interface.

Example:

```java
private static void printHeader()
```

---

## Why Private Methods Were Introduced

Private methods were introduced in Java 9 to:

- Reduce duplicate code
- Share common logic
- Improve encapsulation
- Hide helper methods from implementing classes

---

## Interface Method Comparison

| Method Type | Body | Inherited | Overridable | Access |
|-------------|------|-----------|-------------|--------|
| Abstract | ❌ | — | Must Implement | Implementing Class |
| Default | ✅ | Yes | Yes | Objects |
| Static | ✅ | No | No | Interface Name |
| Private | ✅ | No | No | Interface Only |
| Private Static | ✅ | No | No | Interface Only |

---

## Expected Output

```text
Smartphone constructor executed.

Samsung Galaxy S24 captured a photo using its 50 MP camera.

Preparing camera...
Checking battery...
Focusing lens...
Recording Full HD video.

=== Photography Tips ===

1. Keep the camera steady.
2. Use proper lighting.
3. Focus before capturing

------- Phone Details -------
Brand             : Samsung
Model             : Galaxy S24
Camera Resolution : 50 MP
```

---

## Key Learnings

- Interfaces can contain multiple kinds of methods.
- Default methods provide reusable behavior.
- Static methods belong to the interface.
- Private methods help eliminate duplicate code.
- Private methods cannot be accessed or overridden by implementing classes.
- Modern Java interfaces support clean and maintainable design.

---

## Author

**Aradhya Thakur**

Java Backend Developer Journey • 2026
