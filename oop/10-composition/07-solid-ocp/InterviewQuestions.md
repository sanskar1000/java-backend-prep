# Open/Closed Principle — Interview Questions

## 1. What is the Open/Closed Principle?

The Open/Closed Principle states:

Software entities should be open for extension but closed for modification.

It means we should be able to add new behavior without repeatedly modifying existing stable code.

## 2. What does "open for extension" mean?

It means new behavior can be added through new implementations or extensions.

Example:

    class FreelancerSalaryCalculator implements SalaryCalculator {
    }

We can add a new salary calculation strategy without changing the existing calculators.

## 3. What does "closed for modification" mean?

It means existing stable code should not need to be modified every time a new feature or behavior is added.

## 4. How does this project demonstrate OCP?

The project uses the SalaryCalculator interface.

Different salary calculation rules are implemented as separate classes:

    SalaryCalculator
    ├── FullTimeSalaryCalculator
    ├── ContractSalaryCalculator
    └── InternSalaryCalculator

A new calculator can be added without modifying SalaryProcessor.

## 5. Why is an interface used?

The interface provides abstraction.

SalaryProcessor depends on:

    SalaryCalculator

rather than:

    FullTimeSalaryCalculator

This reduces coupling.

## 6. What is polymorphism in this project?

A SalaryCalculator reference can refer to different implementations.

Example:

    SalaryCalculator calculator =
            new FullTimeSalaryCalculator();

or:

    SalaryCalculator calculator =
            new ContractSalaryCalculator();

The correct calculate() implementation is selected at runtime.

## 7. What happens if we add a Freelancer calculator?

We create a new class:

    class FreelancerSalaryCalculator implements SalaryCalculator {

        @Override
        public double calculate(Employee employee) {
            return employee.getSalary() * 4;
        }
    }

Existing salary calculators and SalaryProcessor do not need to be modified.

## 8. Why is a large if/else design problematic?

Example:

    if (type.equals("FULL_TIME")) {
        ...
    }

    if (type.equals("CONTRACT")) {
        ...
    }

    if (type.equals("INTERN")) {
        ...
    }

Every new salary type requires modification of the existing class.

This makes the code harder to maintain and violates the intended design of OCP.

## 9. What is Dependency Injection in this project?

SalaryProcessor receives a SalaryCalculator through its constructor.

Example:

    SalaryProcessor processor =
            new SalaryProcessor(calculator);

The dependency is created outside the processor and injected into it.

## 10. What does SalaryProcessor depend on?

SalaryProcessor depends on the abstraction:

    SalaryCalculator

It does not depend directly on:

    FullTimeSalaryCalculator
    ContractSalaryCalculator
    InternSalaryCalculator

## 11. Why is depending on an interface better?

It provides loose coupling.

Instead of:

    SalaryProcessor
          ↓
    FullTimeSalaryCalculator

we have:

    SalaryProcessor
          ↓
    SalaryCalculator
          ↑
       ┌──┼──┐
       ↓  ↓  ↓
     Full Contract Intern

The processor does not need to know the concrete implementation.

## 12. Does OCP mean we can never modify existing code?

No.

OCP does not mean existing code can never change.

It means the design should make it possible to introduce new behavior primarily through extension rather than repeatedly modifying stable existing components.

## 13. What are the benefits of OCP?

- Reduced coupling
- Easier maintenance
- Easier testing
- Easier extension
- Lower risk of breaking existing functionality
- Better scalability
- Cleaner architecture

## 14. How does OCP relate to polymorphism?

Polymorphism allows different implementations to be used through a common abstraction.

For example:

    SalaryCalculator calculator;

can refer to:

    new FullTimeSalaryCalculator()
    new ContractSalaryCalculator()
    new InternSalaryCalculator()

This makes extension possible without changing the code that uses the abstraction.

## 15. What is the difference between SRP and OCP?

SRP focuses on responsibility.

SRP:

    One class should have one cohesive responsibility.

OCP focuses on extensibility.

OCP:

    Add new behavior through extension rather than repeatedly modifying stable existing code.

In simple terms:

    SRP → Separate responsibilities

    OCP → Make behavior extensible

# Quick Interview Revision

| Question | Short Answer |
|---|---|
| What is OCP? | Open for extension, closed for modification |
| Main goal? | Add behavior without modifying stable code |
| How did we implement it? | Interface + implementations |
| What enables runtime selection? | Polymorphism |
| What does SalaryProcessor depend on? | SalaryCalculator interface |
| How is dependency supplied? | Constructor injection |
| Main benefit? | Easier extension and lower coupling |
| Does OCP mean never modifying code? | No |
| Example of violation? | Large if/else based on type |
| Example of extension? | Adding FreelancerSalaryCalculator |

# Interview Challenge

Answer these without looking at the notes:

1. What is OCP?

2. Why is SalaryCalculator an interface?

3. Why doesn't SalaryProcessor depend on FullTimeSalaryCalculator?

4. If we add FreelancerSalaryCalculator, which existing class needs modification?

5. How does polymorphism help OCP?

6. What is the difference between SRP and OCP?

7. Is adding a new implementation an extension or modification?

8. What would happen if SalaryProcessor contained if/else for every salary type?

9. What type of coupling are we trying to reduce?

10. Explain OCP in this project in your own words.
