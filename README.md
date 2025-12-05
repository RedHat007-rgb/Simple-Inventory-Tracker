Here is the updated **README.md** with the **Tech Stack Justification section completely removed**.
Everything else remains the same and clean.

---

# 📦 Basic Inventory Management Dashboard

### **Week 1 – Friday Integration Project (30 Nov – 5 Dec)**

A simple, functional Inventory Tracker built using **Java (DSA + OOP)** and **HTML/CSS** to consolidate Week-1 learning.

---

## 📌 1. Problem Statement & Motivation

**Problem:**
Small businesses need a lightweight tool to track stock items. Spreadsheets lead to errors, inconsistencies, and manual overhead.

**Motivation:**

- Real-world applicability (shops, bookstores, e-commerce)
- Applies arrays + loops, classes + encapsulation (Java OOP), semantic HTML/CSS
- Teaches modular, testable, scalable system thinking

This is a **static prototype** (no database, no API). Backend logic runs in Java; UI is static HTML.

---

## 🎯 2. Functional & Non-Functional Requirements

### **Functional Requirements**

- Add item (name, quantity, price) → stored in array
- Display items in a **table**
- Display items in a **list** (quick scan)
- Search items by partial name
- Compute total inventory value

### **Non-Functional Requirements**

- Basic responsive CSS
- Encapsulated Java classes
- O(n) loop performance acceptable
- Semantic HTML for accessibility
- Polyglot DSA version in Python

---

## 🏗️ 3. Architecture Overview (LLD)

### **High-Level Flow**

HTML Form → (Simulated) → Java Backend → Console/Static HTML

### **Core Components**

- `Item` class (name, qty, price)
- `InventoryManager` (array, add/search/sum)

### **LLD Diagram**

```
[User] → [HTML Form]
          ↓
  (Future: JS → API)
          ↓
[Java InventoryManager]
   - items[]: Item[10]
   - addItem()
   - searchItem()
   - getTotalValue()
          ↓
[HTML Table / List Output]
```

---

## 🔄 4. Workflow & Data Flow

### **User Workflow**

1. Fill `index.html` form
2. Java receives data (manual simulation)
3. Java adds/searches items in array
4. Output shown in console / HTML updates
5. Commit and push

### **Data Flow Diagram**

```
Form Input
    ↓
Java Array<Item>
    ↓
Add/Search/Sum Loops
    ↓
Table/List Output (HTML)
```

---

## 🧠 5. DSA / Algorithmic Components

### **Array-Based Operations**

- **Add Item:** Loop → find first empty slot
- **Search Item:** While-loop → partial match
- **Total Value:** For-loop → qty × price

Python script mirrors logic for polyglot learning.

---

## 📂 6. Project Structure

```
inventory-tracker/
├── backend/
│   ├── Item.java
│   └── InventoryManager.java
├── frontend/
│   └── index.html
├── scripts/
│   └── dsa_python.py
├── tests/
│   └── InventoryTest.java
└── README.md
```

---

## 🧪 7. Testing

- JUnit for add/search/sum
- Manual UI checks for form, table, list rendering

---

## 🌐 8. Deployment

- **Frontend:** GitHub Pages
- **Backend:** Local Java execution
- Future: Full-stack deployment using Heroku/Render

---

## 📘 9. HOW TO RUN

### Java Backend

```
cd backend
javac Item.java InventoryManager.java
java InventoryManager
```

### Frontend

Open:

```
frontend/index.html
```

### Python DSA Script

```
python scripts/dsa_python.py
```

---

## 📝 License

MIT (Optional)

---
