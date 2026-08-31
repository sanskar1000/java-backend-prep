# 🏦 Bank Account System — Java Packages

## 📌 Overview

This project demonstrates how Java packages, encapsulation, access modifiers, constructors, getters, and object interaction can be used to build a simple bank account system.

The application supports:

- Creating bank accounts
- Depositing money
- Withdrawing money
- Transferring money between accounts
- Displaying account details
- Validating transactions

---

## 📁 Project Structure

```text
05-bank-account/
│
├── src/
│   ├── model/
│   │   └── BankAccount.java
│   │
│   ├── service/
│   │   └── BankService.java
│   │
│   └── Main.java
│
└── README.md

🧠 Concepts Covered

* Java packages
* package keyword
* import keyword
* Encapsulation
* private fields
* final fields
* Constructors
* Getters
* Object composition
* Method parameters
* Multiple objects
* Business logic
* Validation
* Separation of responsibilities

📦 Package Responsibilities

model

Contains the BankAccount class.

model
└── BankAccount

The account stores:

* Account number
* Account holder name
* Balance

⸻

service

Contains the BankService class.

service
└── BankService

The service handles:

* Deposits
* Withdrawals
* Transfers
* Account display

⸻

Main

Main.java creates the objects and uses the services.

⸻
▶️ Sample Output

Initial Accounts:

----------------------------
Account Number: ACC101
Account Holder: Aradhya
Balance: ₹10000.0
----------------------------

----------------------------
Account Number: ACC102
Account Holder: Rahul
Balance: ₹5000.0
----------------------------

--- Deposit ---

Deposited: ₹2500.0

--- Withdraw ---

Withdrawn: ₹3000.0

--- Transfer ---

Withdrawn: ₹2000.0
Deposited: ₹2000.0
Transferred: ₹2000.0 from ACC101 to ACC102

Final Accounts:

----------------------------
Account Number: ACC101
Account Holder: Aradhya
Balance: ₹7500.0
----------------------------

----------------------------
Account Number: ACC102
Account Holder: Rahul
Balance: ₹7000.0
----------------------------

🔄 Application Architecture

                    Main
                      │
                      ↓
                BankService
                ↙    ↓    ↘
               ↓     ↓      ↓
          Deposit  Withdraw  Transfer
               │     │       │
               └─────┴───────┘
                      ↓
                 BankAccount
                    model

🎯 Learning Outcomes

After completing this practice, I can:

* Create and use multiple Java packages.
* Separate model and service responsibilities.
* Apply encapsulation.
* Protect object state using private.
* Avoid exposing sensitive state through public setters.
* Use methods to control state changes.
* Work with multiple objects.
* Pass objects as method parameters.
* Implement basic transaction validation.
* Understand how packages help organize Java applications.

⸻

🛠️ Technologies

* Java
* IntelliJ IDEA
* Git
* GitHub

⸻

📚 Key Takeaway

Object state should be protected and changed through controlled methods rather than allowing other classes to modify it directl
                    
