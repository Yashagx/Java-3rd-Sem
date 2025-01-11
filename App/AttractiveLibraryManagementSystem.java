import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AttractiveLibraryManagementSystem {

    // ArrayList to store book details
    ArrayList<Book> bookList = new ArrayList<>();

    // Components for the Book Details panel
    private JTextField titleField, authorField, isbnField, yearField, searchField;
    private JComboBox<String> genreComboBox;
    private JCheckBox availabilityCheckBox;
    private JTable bookTable;
    private DefaultTableModel tableModel;

    public AttractiveLibraryManagementSystem() {
        // Create the JFrame (Main Window)
        JFrame frame = new JFrame("Library Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLayout(new BorderLayout());

        // Set a modern color scheme
        Color primaryColor = new Color(30, 136, 229);  // Blue
        Color secondaryColor = new Color(240, 240, 240);  // Light gray
        Color buttonColor = new Color(0, 150, 136);  // Green
        frame.getContentPane().setBackground(secondaryColor);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);

        // Create a JToolBar with icon buttons
        JToolBar toolBar = new JToolBar();
        JButton addButton = createIconButton("add.png", "Add Book");
        JButton removeButton = createIconButton("delete.png", "Remove Book");
        JButton searchButton = createIconButton("search.png", "Search");
        toolBar.add(addButton);
        toolBar.add(removeButton);
        toolBar.add(searchButton);
        toolBar.setBackground(primaryColor);
        frame.add(toolBar, BorderLayout.NORTH);

        // Create a JTabbedPane with a modern font
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setFont(new Font("Arial", Font.BOLD, 14));

        // Book Details Panel
        JPanel bookDetailsPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        bookDetailsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));  // Padding
        bookDetailsPanel.setBackground(secondaryColor);

        titleField = new JTextField();
        authorField = new JTextField();
        isbnField = new JTextField();
        yearField = new JTextField();
        genreComboBox = new JComboBox<>(new String[]{"Fiction", "Non-Fiction", "Science", "History"});
        availabilityCheckBox = new JCheckBox("Available");
        JButton addBookButton = new JButton("Add Book");
        addBookButton.setBackground(buttonColor);
        addBookButton.setForeground(Color.WHITE);
        JButton updateBookButton = new JButton("Update Book");
        updateBookButton.setBackground(buttonColor);
        updateBookButton.setForeground(Color.WHITE);

        // Add components to the bookDetailsPanel
        bookDetailsPanel.add(new JLabel("Book Title:"));
        bookDetailsPanel.add(titleField);
        bookDetailsPanel.add(new JLabel("Author:"));
        bookDetailsPanel.add(authorField);
        bookDetailsPanel.add(new JLabel("ISBN:"));
        bookDetailsPanel.add(isbnField);
        bookDetailsPanel.add(new JLabel("Publication Year:"));
        bookDetailsPanel.add(yearField);
        bookDetailsPanel.add(new JLabel("Genre:"));
        bookDetailsPanel.add(genreComboBox);
        bookDetailsPanel.add(availabilityCheckBox);
        bookDetailsPanel.add(addBookButton);
        bookDetailsPanel.add(updateBookButton);

        tabbedPane.add("Book Details", bookDetailsPanel);

        // Book List Panel
        JPanel bookListPanel = new JPanel(new BorderLayout());
        bookListPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));  // Padding
        String[] columnNames = {"Title", "Author", "ISBN", "Genre", "Availability"};
        tableModel = new DefaultTableModel(columnNames, 0);
        bookTable = new JTable(tableModel);
        bookTable.setFont(new Font("Arial", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(bookTable);
        searchField = new JTextField();
        JButton searchBookButton = new JButton("Search Book");
        searchBookButton.setBackground(buttonColor);
        searchBookButton.setForeground(Color.WHITE);

        JPanel searchPanel = new JPanel(new BorderLayout());
        searchPanel.add(searchField, BorderLayout.CENTER);
        searchPanel.add(searchBookButton, BorderLayout.EAST);

        bookListPanel.add(scrollPane, BorderLayout.CENTER);
        bookListPanel.add(searchPanel, BorderLayout.NORTH);

        tabbedPane.add("Book List", bookListPanel);

        // Add JTabbedPane to JFrame
        frame.add(tabbedPane, BorderLayout.CENTER);

        // Action Listeners
        addBookButton.addActionListener(e -> addBook());
        updateBookButton.addActionListener(e -> updateBook());
        removeButton.addActionListener(e -> removeBook());
        searchBookButton.addActionListener(e -> searchBook());

        // Print name and roll number
        JLabel infoLabel = new JLabel("YASH AGARWAL | RA2311033010055", JLabel.CENTER);
        infoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        infoLabel.setForeground(primaryColor);
        frame.add(infoLabel, BorderLayout.SOUTH);

        // Set frame visibility
        frame.setVisible(true);
    }

    // Method to create buttons with icons
    private JButton createIconButton(String iconPath, String toolTipText) {
        JButton button = new JButton(new ImageIcon(iconPath));
        button.setToolTipText(toolTipText);
        return button;
    }

    // Method to add a book to the list
    private void addBook() {
        String title = titleField.getText();
        String author = authorField.getText();
        String isbn = isbnField.getText();
        String year = yearField.getText();
        String genre = (String) genreComboBox.getSelectedItem();
        boolean available = availabilityCheckBox.isSelected();

        // Add book to ArrayList and JTable
        Book book = new Book(title, author, isbn, year, genre, available);
        bookList.add(book);
        tableModel.addRow(new Object[]{title, author, isbn, genre, available});
        clearFields();
    }

    // Method to update a book's details
    private void updateBook() {
        int selectedRow = bookTable.getSelectedRow();
        if (selectedRow >= 0) {
            Book book = bookList.get(selectedRow);
            book.setTitle(titleField.getText());
            book.setAuthor(authorField.getText());
            book.setIsbn(isbnField.getText());
            book.setYear(yearField.getText());
            book.setGenre((String) genreComboBox.getSelectedItem());
            book.setAvailable(availabilityCheckBox.isSelected());

            tableModel.setValueAt(book.getTitle(), selectedRow, 0);
            tableModel.setValueAt(book.getAuthor(), selectedRow, 1);
            tableModel.setValueAt(book.getIsbn(), selectedRow, 2);
            tableModel.setValueAt(book.getGenre(), selectedRow, 3);
            tableModel.setValueAt(book.isAvailable(), selectedRow, 4);

            clearFields();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a book to update!");
        }
    }

    // Method to remove a book
    private void removeBook() {
        int selectedRow = bookTable.getSelectedRow();
        if (selectedRow >= 0) {
            int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this book?");
            if (confirmed == JOptionPane.YES_OPTION) {
                bookList.remove(selectedRow);
                tableModel.removeRow(selectedRow);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a book to remove!");
        }
    }

    // Method to search for a book by title
    private void searchBook() {
        String searchQuery = searchField.getText().toLowerCase();
        for (Book book : bookList) {
            if (book.getTitle().toLowerCase().contains(searchQuery)) {
                JOptionPane.showMessageDialog(null, "Book found: " + book.getTitle());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No book found with the title: " + searchQuery);
    }

    // Method to clear text fields
    private void clearFields() {
        titleField.setText("");
        authorField.setText("");
        isbnField.setText("");
        yearField.setText("");
        availabilityCheckBox.setSelected(false);
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AttractiveLibraryManagementSystem::new);
    }
}

// Book class to represent book details
class Book {
    private String title, author, isbn, year, genre;
    private boolean available;

    public Book(String title, String author, String isbn, String year, String genre, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.genre = genre;
        this.available = available;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}
