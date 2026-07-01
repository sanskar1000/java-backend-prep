📚 Arrays in Java

📘 Introduction

Arrays are one of the most fundamental data structures in Java.

An array is used to store multiple values of the same data type in a single variable.

Instead of creating many separate variables, an array allows us to organize related data efficiently.

⸻

🔹 What is an Array?

An array is a fixed-size collection of elements of the same data type stored in contiguous memory locations.

Each element is accessed using an index.

* Stores multiple values
* Elements are of the same type
* Fixed size after creation
* Indexed starting from 0

Syntax

int[] numbers = new int[5];

or

int[] numbers = {10, 20, 30, 40, 50};

⸻

🔹 Important Rules

* Array size is fixed after creation.
* Index starts from 0.
* Last index is length - 1.
* All elements must have the same data type.
* Arrays are objects in Java.

⸻

🔹 Why Arrays are Needed

Without arrays:

int marks1 = 85;
int marks2 = 90;
int marks3 = 76;
int marks4 = 88;
int marks5 = 91;

Managing many variables becomes difficult.

⸻

With arrays:

int[] marks = {85, 90, 76, 88, 91};

Now all values are stored together and can be processed using loops.

⸻

🔹 Advantages of Arrays

* Stores multiple values together
* Easy traversal using loops
* Efficient memory usage
* Simplifies data management
* Fast element access using index
* Foundation for advanced data structures

⸻

🔹 Declaring an Array

int[] numbers;

⸻

🔹 Creating an Array

numbers = new int[5];

⸻

🔹 Declaration and Creation Together

int[] numbers = new int[5];

⸻

🔹 Array Initialization

int[] numbers = {10, 20, 30, 40, 50};

⸻

🔹 Accessing Elements

Use the index to access elements.

System.out.println(numbers[0]);

Output

10

⸻

🔹 Updating Elements

numbers[2] = 100;

Now the array becomes

10 20 100 40 50

⸻

🔹 Traversing an Array

Using a for loop

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

⸻

Using an enhanced for loop

for (int num : numbers) {
    System.out.println(num);
}

⸻

🔹 Default Values

Data Type	Default Value
int	0
double	0.0
float	0.0f
boolean	false
char	‘\u0000’
String	null

Example

int[] arr = new int[3];

Output

0
0
0

⸻

🔹 Array Length

The length property gives the number of elements.

System.out.println(numbers.length);

⸻

🔹 Common Operations

* Traversal
* Searching
* Updating
* Finding Maximum
* Finding Minimum
* Sum of Elements
* Average
* Counting
* Reversing
* Sorting

⸻

🔹 Searching

Linear Search

Checks each element one by one.

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        System.out.println(i);
    }
}

⸻

🔹 Finding Maximum

int max = arr[0];
for (int num : arr) {
    if (num > max) {
        max = num;
    }
}

⸻

🔹 Finding Minimum

int min = arr[0];
for (int num : arr) {
    if (num < min) {
        min = num;
    }
}

⸻

🔹 Sum of Elements

int sum = 0;
for (int num : arr) {
    sum += num;
}

⸻

🔹 Average

double average = (double) sum / arr.length;

⸻

🔹 Reversing an Array

int left = 0;
int right = arr.length - 1;
while (left < right) {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    left++;
    right--;
}

⸻

🔹 Arrays are Objects

Every array is an object created in heap memory.

int[] arr = new int[5];

The variable arr stores a reference to the array object.

⸻

🔹 Memory Understanding

When:

int[] numbers = {10, 20, 30, 40, 50};

Java performs:

1. creates a reference variable in stack memory
2. creates the array object in heap memory
3. stores all elements in contiguous memory
4. reference points to the first element
5. array is ready for use

⸻

🔹 Real-World Analogy

Think of an apartment building.

* Building = Array
* Rooms = Elements
* Room Numbers = Indexes

To access a room, you use its room number.

Similarly, array elements are accessed using indexes.

⸻

🔹 Programs Practiced

* PrintArray.java
* SumArray.java
* MaximumElement.java
* MinimumElement.java
* AverageArray.java
* LinearSearch.java
* ReverseArray.java
* CountEvenOdd.java
* LargestElement.java
* SmallestElement.java

⸻

🔹 Key Concepts Learned

* Array Declaration
* Array Creation
* Initialization
* Indexing
* Traversal
* Updating
* Searching
* Maximum Element
* Minimum Element
* Sum
* Average
* Reverse
* Default Values
* Array Length

⸻

🔹 Complexity

Operation	Time Complexity
Access by Index	O(1)
Update by Index	O(1)
Traversal	O(n)
Linear Search	O(n)
Find Maximum	O(n)
Find Minimum	O(n)
Sum	O(n)
Reverse	O(n)

Space Complexity

* Array: O(n)
* Extra Variables: O(1)

⸻

Program	Concepts
PrintArray.java	Traversal
SumArray.java	Sum
MaximumElement.java	Maximum
MinimumElement.java	Minimum
AverageArray.java	Average
LinearSearch.java	Searching
ReverseArray.java	Reversing
CountEvenOdd.java	Counting

⸻

🔹 Common Mistakes Beginners Make

* Accessing an invalid index
* Forgetting that indexing starts at 0
* Confusing length with length()
* Using <= instead of < in loops
* Forgetting to initialize arrays
* Mixing different data types
* Assuming arrays can grow automatically

⸻

🔹 Array Creation Flow

Create Array
↓
Memory allocated in heap
↓
Default values assigned
↓
Elements initialized
↓
Access using index
↓
Array ready for use

⸻

Folder Structure

04-arrays/
│
├── PrintArray.java
├── SumArray.java
├── MaximumElement.java
├── MinimumElement.java
├── AverageArray.java
├── LinearSearch.java
├── ReverseArray.java
└── README.md

⸻

🔹 Conclusion

Arrays are one of the most important data structures in Java because they allow efficient storage and processing of multiple values.

They help make code:

* organized
* efficient
* readable
* reusable
* maintainable
* professional

Mastering arrays builds a strong foundation for advanced topics like:

* Array Algorithms
* Two Pointers
* Sliding Window
* Prefix Sum
* Binary Search
* Sorting
* Collections Framework
* Dynamic Programming
