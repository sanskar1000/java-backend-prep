equals() and hashCode()

This folder covers the fundamentals of Java’s equals() and hashCode() methods and their importance in hash-based collections such as HashSet and HashMap.

📚 Topics Covered

* == vs equals()
* Object identity
* Logical equality
* Overriding equals()
* hashCode()
* equals() and hashCode() contract
* Hash collisions
* Relationship with HashSet
* Why custom classes need proper equals() and hashCode()

🧠 Key Concepts

1. == with Objects

For objects, == checks whether two references point to the same object.

Student s1 = new Student("Aradhya");
Student s2 = new Student("Aradhya");
Student s3 = s1;
System.out.println(s1 == s2); // false
System.out.println(s1 == s3); // true

* s1 and s2 refer to different objects.
* s1 and s3 refer to the same object.

⸻

2. equals()

equals() checks logical equality according to the class’s implementation.

It does not automatically mean “compare all fields.”

For example, String overrides equals() to compare its contents:

String a = new String("Java");
String b = new String("Java");
System.out.println(a == b);       // false
System.out.println(a.equals(b));  // true

Important Rule

== checks object identity, while equals() checks logical equality as defined by the class.

⸻

3. Default equals()

If a custom class does not override equals(), it inherits the implementation from Object.

Therefore:

Student s1 = new Student("Aradhya");
Student s2 = new Student("Aradhya");
System.out.println(s1.equals(s2));

does not automatically become true just because both objects have the same name.

Java cannot assume which fields should determine logical equality.

⸻

4. hashCode()

hashCode() returns an integer hash value associated with an object.

Hash-based collections use hash codes to efficiently locate possible matching elements.

Simplified idea:

Object
  ↓
hashCode()
  ↓
Hash value
  ↓
Possible location

⸻

5. equals() and hashCode() Contract

The most important rule is:

If a.equals(b) == true
Then:
a.hashCode() == b.hashCode()

However, the reverse is not guaranteed:

a.hashCode() == b.hashCode()

does not necessarily mean:

a.equals(b) == true

Two different objects can have the same hash code. This is called a hash collision.

⸻

🔗 Relationship with HashSet

HashSet stores unique elements.

Set<String> names = new HashSet<>();
names.add("Java");
names.add("Java");
System.out.println(names.size());

Output:

1

Conceptually, HashSet uses:

hashCode()
    ↓
find possible location
    ↓
equals()
    ↓
determine logical equality

For custom classes, equals() and hashCode() must be implemented consistently when logical equality is required.

⸻

⚠️ Common Mistakes

Mistake 1

Thinking:

a.equals(b)

always means comparing every field.

Correction: equals() defines logical equality according to the class implementation.

Mistake 2

Thinking:

a.hashCode() == b.hashCode()

means the objects are equal.

Correction: Equal hash codes do not guarantee equality.

Mistake 3

Overriding equals() but ignoring hashCode().

Correction: If two objects are equal according to equals(), they must produce the same hash code.

Mistake 4

Thinking two custom objects with identical field values are automatically equal.

Correction: The class must define that logical equality.

⸻

💡 Mental Model

==
"Are these references pointing to the same object?"
equals()
"Does this class consider these objects logically equal?"
hashCode()
"What hash value is associated with this object?"

For hash-based collections:

hashCode()
    ↓
Find where to look
equals()
    ↓
Check whether the candidate is logically equal

⸻

🧪 Example

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

Without overriding equals() and hashCode():

Set<Student> students = new HashSet<>();
Student s1 = new Student("Aradhya");
Student s2 = new Student("Aradhya");
students.add(s1);
students.add(s2);
System.out.println(students.size());

Output:

2

Although the names are the same, the class has not defined them as logically equal.

⸻

📌 Interview Points

Q1. What is the difference between == and equals()?

== checks reference identity for objects, while equals() checks logical equality according to the class’s implementation.

Q2. What is the relationship between equals() and hashCode()?

If two objects are equal according to equals(), they must have the same hash code.

Q3. Can two unequal objects have the same hash code?

Yes. This is called a hash collision.

Q4. Why are equals() and hashCode() important in HashSet?

They allow the collection to locate possible matching elements and determine whether an element is logically equal to an existing element.

⸻

📊 Complexity Note

The actual complexity of hash-based collections depends on the implementation, hashing quality, collisions, and other factors.

For typical well-distributed hashing:

* HashSet lookup: average O(1)
* HashSet insertion: average O(1)
* HashSet removal: average O(1)

Worst-case behavior depends on collisions and implementation details.

⸻

🎯 Learning Status

* == vs equals()
* Object identity
* Logical equality
* Default equals()
* hashCode()
* equals() / hashCode() contract
* Hash collision concept
* Basic HashSet connection

🚀 Next Topic

Java Generics — Fundamentals → Collections Usage
