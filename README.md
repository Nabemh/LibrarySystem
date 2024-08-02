# Library Management System

<!-- ![Library Management System Logo](path/to/logo.png) -->
<!-- Placeholder for Project Logo -->

## Contributors

This project was developed by the following team members:

- **Hanior Nabem Nathaniel** - BHU/22/04/09/0074
- **Ezekiel Oyidih** - BHU/22/04/05/0026
- **Ngakilahyel Samuel** - BHU/22/04/10/0019
- **Caleb Joshua Fuojima** - BHU/22/04/05/0018
- **Precious Oguntuase Toluwalope** - BHU/22/04/05/0070

## Table of Contents

1. [Project Overview](#project-overview)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Usage](#usage)
5. [Implementation Details](#implementation-details)
6. [Project Algorithm](#project-algorithm)
7. [Screenshots](#screenshots)
8. [License](#license)
9. [Acknowledgments](#acknowledgments)

## Project Overview

<p>
  The <strong>Library Management System</strong> is a desktop application designed to help users manage a collection of books with ease. It provides features for adding, viewing, editing, deleting, and generating reports on books. The application offers a user-friendly interface developed using Java Swing, with Object-Oriented Programming (OOP) principles to ensure code structure and maintainability. Exception handling is integrated to manage errors effectively, and file writing is utilized to generate reports.
</p>

### Key Features:

<ul>
  <li><strong>Splash Screen:</strong> Engaging start-up splash screen with a loading progress bar.</li>
  <li><strong>User Authentication:</strong> Login and registration frames for user access control.</li>
  <li><strong>Book Management:</strong> Add, view, edit, delete, and search for books.</li>
  <li><strong>Report Generation:</strong> Generate textual reports and save them to a file.</li>
</ul>

## Technologies Used

<ul>
  <li><strong>Java Swing:</strong> For building the graphical user interface.</li>
  <li><strong>Object-Oriented Programming (OOP):</strong> To maintain a modular code structure.</li>
  <li><strong>Exception Handling:</strong> For effective error management.</li>
  <li><strong>File Writing:</strong> To save book reports in a text file.</li>
</ul>

## Usage

<p>
  After running the application, you'll be presented with the splash screen, followed by the login interface. Here's a guide on how to use the system:
</p>

<ol>
  <li>
    <strong>Login/Register:</strong>
    <ul>
      <li>Enter your credentials to log in or click on the "Register" button to create a new account.</li>
    </ul>
  </li>

  <li>
    <strong>Add Book:</strong>
    <ul>
      <li>Fill in the book details and click "Add" to save the book in the library.</li>
    </ul>
  </li>

  <li>
    <strong>View Books:</strong>
    <ul>
      <li>Click on "View" to see a list of all books. Use the search functionality to find specific books by title.</li>
    </ul>
  </li>

  <li>
    <strong>Edit Book:</strong>
    <ul>
      <li>Select a book by ID, update the details, and click "Save" to apply changes.</li>
    </ul>
  </li>

  <li>
    <strong>Delete Book:</strong>
    <ul>
      <li>Enter the ID of the book you wish to delete and confirm your choice.</li>
    </ul>
  </li>

  <li>
    <strong>Generate Report:</strong>
    <ul>
      <li>Click "Report" to generate and save a report of all books in <code>LibraryReport.txt</code>.</li>
    </ul>
  </li>

  <li>
    <strong>Exit:</strong>
    <ul>
      <li>Click "Exit" to close the application with a confirmation prompt.</li>
    </ul>
  </li>
</ol>

## Implementation Details

### Java Swing

<p>
  Java Swing is used to create the graphical user interface (GUI) of the application. It provides a rich set of components for building a responsive and intuitive user interface.
</p>

### Object-Oriented Programming (OOP)

<p>
  OOP principles are used to enhance modularity and maintainability of the codebase. Here are some key classes:
</p>

<ul>
  <li>
    <strong><code>LibraryManagement</code></strong>: The main class implements <code>ActionListener</code> to handle user actions and manage the overall flow of the application.
  </li>
  <li>
    <strong><code>Book</code></strong>: A model class representing a book. This class encapsulates the book data and provides getter and setter methods.
  </li>
  <li>
    <strong><code>BookTableModel</code></strong>: Extends <code>AbstractTableModel</code> to provide a custom data model for the JTable used in the application. This class manages the display of book data in a tabular format.
  </li>
</ul>

### Exception Handling

<p>
  Exception handling is implemented to ensure the application can manage errors gracefully and provide meaningful feedback to the user.
</p>

<ul>
  <li>
    <strong><code>IOException</code></strong>: This exception is caught when writing the book report to a file, ensuring the application handles file-related errors properly.
  </li>
</ul>

### File Writing

<p>
  File writing is used to create a textual report of all books and save it in a file named <code>LibraryReport.txt</code>.
</p>

## Project Algorithm

<p>
  Here's a detailed algorithmic overview of the project:
</p>

### 1. Splash Screen:
<ul>
  <li>Display a splash screen with the application's logo and loading progress.</li>
  <li>After a brief delay, the splash screen closes, and the login frame appears.</li>
</ul>

### 2. Login Frame:
<ul>
  <li>Display a login frame with fields for username and password.</li>
  <li>Users can log in or navigate to the registration frame if they don't have an account.</li>
</ul>

### 3. Registration Frame:
<ul>
  <li>Display a registration frame with fields for creating a new account.</li>
  <li>After successful registration, users are redirected to the login frame.</li>
</ul>

### 4. Main Application:
<ul>
  <li>Display the main <code>LibraryManagement</code> frame with a background image.</li>
  <li>Present form fields for book details (ID, title, author, publisher, year, ISBN, number of copies).</li>
  <li>Provide buttons for actions: Add, View, Edit, Delete, Clear, Report, Exit.</li>
</ul>

#### Add Book:
<ul>
  <li>Validate input fields and ensure numeric values for year and copies.</li>
  <li>Create a new <code>Book</code> object and add it to the book list.</li>
  <li>Clear input fields and display a success message.</li>
</ul>

#### View Books:
<ul>
  <li>Display a table with all books using <code>BookTableModel</code>.</li>
  <li>Allow searching for a book by title and display search results.</li>
</ul>

#### Edit Book:
<ul>
  <li>Prompt the user to enter a book ID to edit.</li>
  <li>Populate form fields with existing book details.</li>
  <li>Allow the user to modify details and update the book in the list.</li>
</ul>

#### Delete Book:
<ul>
  <li>Prompt the user to enter a book ID to delete.</li>
  <li>Remove the book from the list and display a success message.</li>
</ul>

#### Generate Report:
<ul>
  <li>Generate a textual report of all books.</li>
  <li>Save the report to a file and display it in a text area.</li>
</ul>

#### Exit Application:
<ul>
  <li>Prompt the user for confirmation before exiting the application.</li>
</ul>

## Screenshots

### 1. Splash Screen

<!-- ![Splash Screen](path/to/splash-screen.png) -->
<!-- Placeholder for Splash Screen Image -->

<p>
  <em>This is set to display for 30 seconds with a progress bar.</em>
</p>

### 2. Login Page

<!-- ![Login Page](path/to/login-page.png) -->
<!-- Placeholder for Login Page Image -->

### 3. Registration Page

<!-- ![Registration Page](path/to/registration-page.png) -->
<!-- Placeholder for Registration Page Image -->

### 4. Library Management Frame

<!-- ![Library Management Frame](path/to/library-management-frame.png) -->
<!-- Placeholder for Library Management Frame Image -->

### 5. Add Book

<!-- ![Add Book](path/to/add-book.png) -->
<!-- Placeholder for Add Book Image -->

### 6. View Books

<!-- ![View Books](path/to/view-books.png) -->
<!-- Placeholder for View Books Image -->

<p>
  <em>Table generated successfully with all records as inputted formally.</em>
</p>

### 7. Edit Book

<!-- ![Edit Book](path/to/edit-book.png) -->
<!-- Placeholder for Edit Book Image -->

<p>
  <em>Enter the ID of the book to be edited (record ID 011).</em>
</p>

### 8. Book Edited Successfully

<!-- ![Book Edited Successfully](path/to/book-edited-success.png) -->
<!-- Placeholder for Book Edited Successfully Image -->

### 9. Delete Book

<!-- ![Delete Book](path/to/delete-book.png) -->
<!-- Placeholder for Delete Book Image -->

<p>
  <em>Enter the ID of the book to be deleted (record ID 010).</em>
</p>

### 10. Delete and Edit Confirmation

<!-- ![Delete and Edit Confirmation](path/to/delete-edit-confirmation.png) -->
<!-- Placeholder for Delete and Edit Confirmation Image -->

<p>
  <em>Record 011 edited, record 010 deleted…</em>
</p>

### 11. Generate Report

<!-- ![Generate Report](path/to/generate-report.png) -->
<!-- Placeholder for Generate Report Image -->

<p>
  <em>When the generate report button is clicked, records are automatically generated and saved in <code>LibraryReport.txt</code>.</em>
</p>

### 12. Report Confirmation

<!-- ![Report Confirmation](path/to/report-confirmation.png) -->
<!-- Placeholder for Report Confirmation Image -->

<p>
  <em><code>LibraryReport.txt</code> successfully created and saved!</em>
</p>

### 13. Exit

<!-- ![Exit](path/to/exit.png) -->
<!-- Placeholder for Exit Image -->

## License

<p>
  This project is licensed under the <a href="LICENSE">MIT License</a>.
</p>

## Acknowledgments

<p>
  We would like to thank our mentors and professors for their invaluable guidance and support throughout this project. Special thanks to the Java and GUI development communities for their resources and tutorials.
</p>
