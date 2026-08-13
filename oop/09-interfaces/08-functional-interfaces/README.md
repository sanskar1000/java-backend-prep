# Functional Interfaces & Lambda Expressions

This module demonstrates Java's built-in functional interfaces and
lambda expressions.

## 📚 Topics Covered

- Functional Interfaces
- Lambda Expressions
- `Predicate<T>`
- `Consumer<T>`
- `Function<T, R>`
- `Supplier<T>`
- Lambda parameters
- Expression body
- Block body
- `return` in lambda expressions
- Method execution:
  - `Predicate` → `test()`
  - `Consumer` → `accept()`
  - `Function` → `apply()`
  - `Supplier` → `get()`
- Combining multiple functional interfaces
- Input validation
- Data transformation
- Runtime behavior of lambdas

---

## 📁 Programs

| File | Concept |
|---|---|
| `PredicateDemo.java` | Predicate and boolean conditions |
| `ConsumerDemo.java` | Consumer and performing actions |
| `FunctionDemo.java` | Function and data transformation |
| `SupplierDemo.java` | Supplier and generating values |
| `CombinedFunctionalInterfaces.java` | Combining functional interfaces |

---

## 🧠 Functional Interface Summary

| Interface | Input | Return | Method |
|---|---|---|---|
| `Predicate<T>` | T | `boolean` | `test()` |
| `Consumer<T>` | T | Nothing | `accept()` |
| `Function<T, R>` | T | R | `apply()` |
| `Supplier<T>` | None | T | `get()` |

### Memory Trick

```text
Predicate → CHECK  → test()
Consumer  → DO     → accept()
Function  → CHANGE → apply()
Supplier  → GIVE   → get()
