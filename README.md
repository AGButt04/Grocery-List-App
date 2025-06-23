# 🛒 Grocery List Management App

A Java Swing desktop application for managing personal grocery shopping lists with categorized items, quantity tracking, and real-time data management. Features pre-loaded sample data and robust input validation for practical grocery planning.

## 🎯 What I Built
- **Complete CRUD Operations**: Add, view, and remove grocery items with persistent data
- **Categorized Shopping**: Organize items by category (Vegetables, Dairy, Snacks, Other)
- **Quantity Management**: Track item quantities with input validation
- **Pre-loaded Data**: Sample grocery items for immediate functionality demonstration
- **Input Validation**: Error handling for empty fields and invalid quantity inputs
- **Professional Table Interface**: Structured data display with selection and removal capabilities

## ✨ Key Features
- ➕ **Add Items**: Create new grocery entries with name, quantity, and category
- 🗑️ **Remove Items**: Delete selected items from the shopping list
- 📊 **Categorized Organization**: Dropdown category selection for better organization
- 🔢 **Quantity Tracking**: Numeric input validation with error handling
- 📋 **Table Display**: Professional tabular view of all grocery items
- ⚠️ **Input Validation**: Comprehensive error checking for user inputs
- 💾 **Data Persistence**: In-memory storage with synchronized table and data updates

## 🏗️ Project Architecture
```
src/
├── GroceryListApp.java   # Main application with GUI and data management
├── GroceryItem.java      # Data model class for grocery items
└── README.md            # Project documentation
```

### Core Components
- **Data Model**: GroceryItem class with name, quantity, and category properties
- **Storage System**: ArrayList for dynamic grocery list management
- **UI Interface**: JTable with DefaultTableModel for real-time data display
- **Input Controls**: Text fields and a dropdown for structured data entry

## 🔧 Implementation Details
- **Object-Oriented Design**: Custom GroceryItem class for data encapsulation
- **Exception Handling**: Try-catch blocks for NumberFormatException handling
- **Synchronized Updates**: Coordinated updates between data storage and table display
- **Input Validation**: Multi-level validation for empty fields and invalid formats
- **Dynamic UI**: Real-time table updates with add/remove operations

## 🚀 Getting Started
```bash
# Clone the repository
git clone https://github.com/AGButt04/Grocery-List-App.git

# Navigate to project directory
cd Grocery-List-App

# Compile the Java files
javac *.java

# Run the application
java GroceryListApp
```

**IDE Setup:**
1. Import the project into your Java IDE (IntelliJ IDEA, Eclipse, VS Code)
2. Ensure JDK 8+ is configured
3. Run `GroceryListApp.java` as the main class

## 🔧 Technologies & Concepts
- **Java SE** - Core programming language
- **Swing Framework** - Desktop GUI components (JTable, JComboBox, JTextField)
- **Object-Oriented Programming** - Custom data models and encapsulation
- **Exception Handling** - NumberFormatException catching and user feedback
- **Data Structures** - ArrayList for dynamic list management
- **Event-Driven Programming** - ActionListener implementations for user interactions

## 💡 Technical Highlights
- **Robust Input Validation**: Multiple validation layers for data integrity
- **Synchronized Data Management**: Coordinated updates between storage and display
- **Professional Error Handling**: User-friendly error messages with specific feedback
- **Category-Based Organization**: Structured data entry with predefined categories
- **Memory Efficient Design**: Dynamic list management with proper cleanup
- **Real-Time Updates**: Immediate reflection of changes in both data and display

## 📖 Learning Outcomes
This project demonstrates proficiency in:
- **Desktop Application Development**: Building practical productivity tools with Java Swing
- **Data Management**: Implementing CRUD operations with proper validation
- **Object-Oriented Design**: Creating custom classes for business logic
- **Exception Handling**: Implementing robust error checking and user feedback
- **UI/UX Design**: Creating intuitive interfaces for data entry and management
- **Real-World Problem Solving**: Building applications that address practical needs

## 🎮 Usage Instructions
1. **View Pre-loaded Items**: Application starts with sample grocery items (Tomatoes, Milk, Chips, Eggs)
2. **Add New Items**: Enter name and quantity, select category, then click "Add Item"
3. **Remove Items**: Select any row in the table and click "Remove Selected"
4. **Category Selection**: Use the dropdown to choose from Vegetables, Dairy, Snacks, or Other
5. **Error Handling**: The Application provides feedback for empty fields or invalid quantities

## 🛒 Sample Data
Pre-loaded with realistic grocery items:
- **Tomatoes** (4 units) - Vegetables
- **Milk** (2 units) - Dairy  
- **Chips** (3 units) - Snacks
- **Eggs** (12 units) - Dairy

---
**Part of my programming portfolio** | [Github Profile](https://github.com/AGButt04) | [LinkedIn](https://www.linkedin.com/in/abdul-ghani-butt-290056338/)
