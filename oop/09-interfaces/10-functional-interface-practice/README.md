# Employee Functional Interface Practice

## 📌 Overview

This project demonstrates how Java Functional Interfaces can be combined with Object-Oriented Programming (OOP) concepts to process `Employee` objects.

The program uses:

- `Predicate<Employee>` for validation
- `Function<Employee, String>` for transformation
- `Consumer<Employee>` for performing an action
- Lambda expressions
- Encapsulation
- Constructor validation
- Method parameters
- Interface-based programming

---

## 📁 Project Structure

08-interfaces/
└── 08-functional-interface-practice/
    ├── EmployeeProcessorDemo.java
    ├── README.md
    └── InterviewQuestions.md

---

## 🎯 Learning Objectives

After completing this program, you should understand:

1. What a Functional Interface is.
2. How lambda expressions implement Functional Interfaces.
3. How `Predicate<T>` works.
4. How `Function<T, R>` works.
5. How `Consumer<T>` works.
6. How functional interfaces can be passed as method arguments.
7. How functional programming features can work together with OOP.
8. How to separate validation, transformation, and action.

---

## 🧠 Functional Interfaces Used

| Interface | Purpose | Method | Return |
|---|---|---|---|
| `Predicate<T>` | Checks a condition | `test()` | `boolean` |
| `Function<T, R>` | Transforms data | `apply()` | `R` |
| `Consumer<T>` | Performs an action | `accept()` | `void` |

---

## 🔄 Program Flow

Employee
↓
Predicate<Employee>
↓
Check salary
↓
salary >= ₹50,000?
↓
Yes
↓
Function<Employee, String>
↓
Employee → Employee Name
↓
Consumer<Employee>
↓
Display Employee Details

---

## 👨‍💼 Employee Class

The `Employee` class represents an employee.

### Fields

- `id`
- `name`
- `salary`

All fields are `private`, demonstrating encapsulation.

### Validation

The constructor validates:

- Employee ID
- Employee name
- Employee salary

Invalid values receive default values.

---

## 🔍 Predicate

The program creates:

`Predicate<Employee> isEligible`

Its responsibility is to determine whether an employee earns at least ₹50,000.

Conceptually:

Employee
→ Check salary
→ `salary >= 50000`
→ `true` or `false`

The Predicate is executed using:

`test(employee)`

---

## 🔄 Function

The program creates:

`Function<Employee, String> getEmployeeName`

Its responsibility is to transform an `Employee` object into the employee's name.

Conceptually:

Employee
→ `getName()`
→ String

The Function is executed using:

`apply(employee)`

---

## ⚙️ Consumer

The program creates:

`Consumer<Employee> displayEmployee`

Its responsibility is to display the employee's information.

It does not return a value.

The Consumer is executed using:

`accept(employee)`

---

## 🔗 Combining Functional Interfaces

The program combines all three functional interfaces inside:

`processEmployee()`

The processing sequence is:

1. Check whether the employee is `null`.
2. Use `Predicate.test()` to check eligibility.
3. Use `Function.apply()` to extract the employee name.
4. Use `Consumer.accept()` to display employee details.

This separates responsibilities clearly.

---

## 📊 Sample Employees

| ID | Name | Salary | Eligible |
|---|---|---:|---|
| E101 | Aradhya | ₹70,000 | Yes |
| E102 | Uday | ₹40,000 | No |
| E103 | Rahul | ₹65,000 | Yes |

---

## 🖥️ Expected Output

===== Eligible Employees =====
Processing employee: Aradhya
------------------------------
Employee ID : E101
Name        : Aradhya
Salary      : ₹70,000.00

Processing employee: Rahul
------------------------------
Employee ID : E103
Name        : Rahul
Salary      : ₹65,000.00

Uday is not processed because his salary is below ₹50,000.

---

## 🧩 Important Concepts

### Predicate

Used when you need to ask:

"Is this condition true?"

Example concept:

`employee.getSalary() >= 50000`

---

### Function

Used when you need to ask:

"Can I transform this value into another value?"

Example:

Employee → String

---

### Consumer

Used when you need to say:

"Perform some action with this value."

Example:

Employee → Display employee details

---

## 🧠 Memory Trick

Predicate → CHECK → `test()`

Consumer → DO → `accept()`

Function → CHANGE → `apply()`

---

## 💡 Key Java Concept

Functional interfaces allow behavior to be passed as a method argument.

Instead of hard-coding all behavior inside `processEmployee()`, the method receives:

- A condition
- A transformation
- An action

This makes the method more flexible and reusable.

---

## ⏱️ Complexity

### Time Complexity

For `n` employees:

O(n)

Each employee is processed once.

### Space Complexity

The processing logic itself uses:

O(1)

additional working space, excluding the employee objects already created.

---

## 🚀 Future Improvements

Possible extensions:

- Add `Supplier<Employee>`
- Add employee department
- Filter employees by department
- Add salary-based transformations
- Add multiple eligibility conditions
- Introduce method references
- Later implement the same processing using Java Streams

---

## 🎓 Concepts Practiced

- [x] Classes
- [x] Objects
- [x] Encapsulation
- [x] Private fields
- [x] Constructors
- [x] Constructor validation
- [x] Getters
- [x] Functional Interfaces
- [x] Predicate
- [x] Function
- [x] Consumer
- [x] Lambda Expressions
- [x] Passing behavior as arguments
- [x] Separation of responsibilities
- [x] Reusable processing method

---

## ⭐ Key Takeaway

The main idea of this project is:

Data + Behavior can be separated.

`Employee` represents the data.

`Predicate` represents the decision.

`Function` represents the transformation.

`Consumer` represents the action.

Together, they demonstrate how modern Java combines OOP with functional programming.
