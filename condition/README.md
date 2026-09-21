# Java Conditional Statements

This folder contains Java practice programs focused on conditional statements and decision-making in Java.

Conditional statements allow a program to make decisions based on whether a condition is `true` or `false`.

## 📚 Topics Covered

- `if` statement
- `if-else` statement
- `else-if` ladder
- Nested `if`
- `switch` statement
- Multiple conditions
- Decision-making
- Input validation
- Conditional logic practice

## 📂 Programs

| File | Topic | Description |
|---|---|---|
| `If-ElseDemo.java` | If-Else | Demonstrates basic `if-else` decision-making. |
| `ElseIfLadderDemo.java` | Else-If Ladder | Demonstrates checking multiple conditions using an `else-if` ladder. |
| `NestedIfDemo.java` | Nested If | Demonstrates placing one `if` statement inside another `if` statement. |
| `SwitchDemo.java` | Switch | Demonstrates selecting an option from multiple cases using `switch`. |
| `practice/` | Practice | Contains additional conditional-statement practice programs. |

## 🧠 Key Concepts

### 1. If Statement

The `if` statement executes a block of code only when its condition is `true`.

Example:

    if (age >= 18) {
        System.out.println("Eligible");
    }

### 2. If-Else Statement

The `if-else` statement provides two possible execution paths.

Example:

    if (number > 0) {
        System.out.println("Positive");
    } else {
        System.out.println("Not Positive");
    }

### 3. Else-If Ladder

An `else-if` ladder is used when multiple conditions need to be checked.

Example:

    if (marks >= 90) {
        System.out.println("Grade A");
    } else if (marks >= 75) {
        System.out.println("Grade B");
    } else if (marks >= 60) {
        System.out.println("Grade C");
    } else {
        System.out.println("Grade D");
    }

The conditions are evaluated from top to bottom.

Once a condition becomes `true`, its corresponding block executes and the remaining conditions are skipped.

### 4. Nested If

A nested `if` means placing an `if` statement inside another `if` statement.

Example:

    if (age >= 18) {
        if (hasId) {
            System.out.println("Entry allowed");
        }
    }

Nested conditions are useful when one decision depends on another decision.

### 5. Switch Statement

The `switch` statement is useful when one expression needs to be compared against multiple fixed values.

Example:

    switch (day) {
        case 1:
            System.out.println("Monday");
            break;

        case 2:
            System.out.println("Tuesday");
            break;

        default:
            System.out.println("Invalid day");
    }

The `break` statement prevents execution from continuing into the next case.

## 🔍 Conditional Operators Used

Conditional programs commonly use:

- `>`
- `<`
- `>=`
- `<=`
- `==`
- `!=`
- `&&`
- `||`
- `!`

## 🛠️ Concepts Practiced

- Boolean conditions
- Decision-making
- `if`
- `if-else`
- `else-if`
- Nested `if`
- `switch`
- `case`
- `default`
- `break`
- Relational operators
- Logical operators
- Multiple conditions
- Input-based decision-making

## 🎯 Learning Objective

The goal of this section is to understand how Java programs make decisions and execute different blocks of code based on conditions.

These concepts form the foundation for:

- Loops
- Methods
- Arrays
- Object-oriented programming
- Exception handling
- Backend business logic

## 📈 Learning Progress

- [x] If Statement
- [x] If-Else Statement
- [x] Else-If Ladder
- [x] Nested If
- [x] Switch Statement
- [x] Conditional Practice
- [ ] Loops
- [ ] Methods
- [ ] Arrays
- [ ] Strings
- [ ] Object-Oriented Programming

## 🚀 Next Step

After completing conditional statements, the next major topic is:

**Loops → Methods → Arrays → Strings → Object-Oriented Programming**

## 👨‍💻 Author

**Aradhya Thakur**

Java Backend Development Learning Journey

**Year:** 2026
