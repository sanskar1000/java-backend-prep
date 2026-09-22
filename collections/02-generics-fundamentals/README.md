Java Generics — Fundamentals

This folder contains Java Generics fundamentals practice programs and examples. The goal is to understand why Generics exist, how type parameters and type arguments work, and how Generics provide compile-time type safety.

📚 Topics Covered

* Why Generics exist
* Problems with using Object
* Type safety
* Compile-time type checking
* Type parameters
* Type arguments
* Generic classes
* Parameterized types
* Generic classes with Collections
* Reducing explicit casting
* Generics and List

⸻

🧠 Why Generics?

Before Generics, classes and collections commonly used Object to store different types.

This could require explicit casting:

Object value = box.get();
String name = (String) value;

Generics allow us to specify the expected type:

Box<String> box = new Box<>();
String name = box.get();

The compiler can then detect incorrect types before the program runs.

⸻

🔑 Important Terminology

Type Parameter

A type parameter is a placeholder for a type.

class Box<T> {
}

Here:

T → Type Parameter

Type Argument

A type argument is the actual type supplied to a generic type.

Box<String> box = new Box<>();

Here:

String → Type Argument

Parameterized Type

Box<String>

Box<String> is a parameterized type where String is supplied for T.

⸻

📦 Generic Class Example

class Box<T> {
    private T value;
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
}

Usage:

Box<String> box = new Box<>();
box.set("Java");
String value = box.get();
System.out.println(value);

Output:

Java

⸻

🛡️ Compile-Time Type Safety

With:

Box<String> box = new Box<>();

this is valid:

box.set("Java");

But this is rejected by the compiler:

box.set(100);

because the box is parameterized with String.

⸻

🆚 Raw Type vs Generic Type

Raw Type

Box box = new Box();
box.set("Java");
String value = (String) box.get();

The compiler does not have specific generic type information.

Generic Type

Box<String> box = new Box<>();
box.set("Java");
String value = box.get();

No explicit cast is required because the compiler knows that get() returns String.

⸻

🧩 Generics with Collections

Generics are heavily used throughout the Java Collections Framework.

List of Strings

List<String> names = new ArrayList<>();

The list is intended to contain String elements.

names.add("Aradhya");   // Valid
names.add("Java");      // Valid

But:

names.add(100);         // Compile-time error

Set of Integers

Set<Integer> numbers = new HashSet<>();

Map with String Keys and Integer Values

Map<String, Integer> marks = new HashMap<>();

Here:

String  → Key type
Integer → Value type

⸻

🔍 Key Mental Model

class Box<T>
          ↑
     Type Parameter
Box<String>
     ↑
 Type Argument
Box<String>
     ↓
Parameterized Type

Generics provide:

Generic Type
     ↓
Compile-Time Type Checking
     ↓
Better Type Safety
     ↓
Fewer Explicit Casts

⸻

💡 Important Rule

Generics mainly provide compile-time type safety.

They do not eliminate every possible runtime error, but they allow many incorrect type operations to be detected by the compiler before execution.

⸻

📌 Collections Connection

Generics are essential for understanding the Java Collections Framework.

Common examples:

List<String>
Set<Integer>
Map<String, Integer>

Without Generics:

List names;

the compiler has less information about what the collection is supposed to contain.

With Generics:

List<String> names;

the intended element type is explicit.

⸻

🎯 Key Takeaways

* Generics allow types to be specified instead of using only Object.
* <T> is a type parameter.
* String in Box<String> is a type argument.
* Generics provide compile-time type safety.
* Generics reduce the need for explicit casting.
* Collections heavily depend on Generics.
* List<String> means a List parameterized with String.
* Map<String, Integer> has String keys and Integer values.
* Generics are an important foundation for Java Collections.

⸻

🚀 Next Topics

After these fundamentals, the next Generics topics will include:

* Generic methods
* Multiple type parameters
* Bounded type parameters
* Wildcards
* ? extends
* ? super
* PECS
* Generics with Collections
* Advanced Generics
* Type erasure

These will be introduced when they become necessary during the Collections learning path.
