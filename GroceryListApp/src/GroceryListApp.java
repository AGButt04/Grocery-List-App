import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GroceryListApp {
    public static void main(String[] args) {
        // Data storage
        ArrayList<GroceryItem> groceryList = new ArrayList<>();

        // Frame and layout
        JFrame frame = new JFrame("Grocery List App");
        frame.setLayout(new BorderLayout());

        // Table setup
        String[] columns = {"Name", "Quantity", "Category"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        // Built-in items
        groceryList.add(new GroceryItem("Tomatoes", 4, "Vegetables"));
        groceryList.add(new GroceryItem("Milk", 2, "Dairy"));
        groceryList.add(new GroceryItem("Chips", 3, "Snacks"));
        groceryList.add(new GroceryItem("Eggs", 12, "Dairy"));

        // Load built-in items into table
        for (GroceryItem item : groceryList) {
            model.addRow(new Object[]{item.getName(), item.getQuantity(), item.getCategory()});
        }

        // Input fields
        JTextField nameField = new JTextField(10);
        JTextField quantityField = new JTextField(5);
        String[] categories = {"Vegetables", "Dairy", "Snacks", "Other"};
        JComboBox<String> categoryBox = new JComboBox<>(categories);

        // Buttons
        JButton addButton = new JButton("Add Item");
        JButton removeButton = new JButton("Remove Selected");

        // Add item action
        addButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String quantityText = quantityField.getText().trim();
            String category = (String) categoryBox.getSelectedItem();

            if (name.isEmpty() || quantityText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter name and quantity.");
                return;
            }

            try {
                int quantity = Integer.parseInt(quantityText);
                GroceryItem item = new GroceryItem(name, quantity, category);
                groceryList.add(item);
                model.addRow(new Object[]{item.getName(), item.getQuantity(), item.getCategory()});
                nameField.setText("");
                quantityField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Quantity must be a number.");
            }
        });

        // Remove item action
        removeButton.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                groceryList.remove(selectedRow);
                model.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(frame, "Please select a row to remove.");
            }
        });

        // Top input panel
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Quantity:"));
        inputPanel.add(quantityField);
        inputPanel.add(new JLabel("Category:"));
        inputPanel.add(categoryBox);
        inputPanel.add(addButton);
        inputPanel.add(removeButton);

        // Add to frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);

        // Final frame settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}