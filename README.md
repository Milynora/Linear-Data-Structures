# Linear Data Structures in Java

## 📘 Overview

This project implements four **linear data structures** in Java using an object-oriented and menu-driven console application:

* **Stack**
* **Queue**
* **Singly Linked List**
* **Circular Linked List**

The program allows users to interactively choose a data structure and perform common operations (insert, delete, display, etc.).

---

## 🧠 How the Code Works

### 📁 Class Structure

* **`Main.java`**: Entry point; provides the main menu for selecting a data structure.
* **`DataStructureOps.java`**: Abstract base class defining the interface for all data structure operations.
* **`StackOps.java`**: Implements stack operations using `java.util.Stack`.
* **`QueueOps.java`**: Implements queue operations using `java.util.Queue` and `LinkedList`.
* **`LinkedListOps.java`**: Implements singly linked list operations using `java.util.LinkedList`.
* **`CircularLinkedListOps.java`**: Custom implementation of a circular singly linked list.
* **`Node.java`**: Node class used for circular linked list.

---

## 🛠️ Operations Implemented

| Data Structure           | Operations                                    |
| ------------------------ | --------------------------------------------- |
| **Stack**                | Push, Pop, Display                            |
| **Queue**                | Enqueue, Dequeue, Display                     |
| **Linked List**          | Insert at end, Delete from beginning, Display |
| **Circular Linked List** | Insert, Delete (from beginning), Display      |

Each data structure has its own submenu for the available operations. The user can go back to the main menu to switch structures or exit the program.

---

## 💻 Sample Run / Output

```
<img width="313" height="638" alt="image" src="https://github.com/user-attachments/assets/f67128ae-ab11-4dbb-8d47-fab127cfea6c" />
```
<img width="312" height="643" alt="image" src="https://github.com/user-attachments/assets/639fca52-cb44-4eb3-93a6-8307d2385333" />
---
<img width="356" height="641" alt="image" src="https://github.com/user-attachments/assets/f7f3960f-614f-4f89-9697-3832bf253a79" />
---
<img width="438" height="637" alt="image" src="https://github.com/user-attachments/assets/325b73aa-22ae-4303-9731-6045ab62e5b2" />
---

