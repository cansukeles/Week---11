### Library Management System

There are the following entities in this library system.

Book: Entity/table containing the properties of books.

Author: Entity/table containing the properties of authors.

Category: Entity/table containing book categories.

Publishing House: Entity/table containing the properties of publishing houses.

Book Borrowing: Entity/table that tracks book borrowing transactions. This table will include who borrowed the book, the date of receipt, and the delivery date.



There are some relationships between these entities:

A book can have one author, an author can have more than one book. (One-to-Many relationship).

A category can have more than one book, while a book can belong to more than one category. (Many-to-Many relationship).

A book may have one publishing house, a publishing house may have more than one book. (One-to-Many relationship).

A book can have multiple loans, but each loan can only belong to one book. (One-to-Many relationship).

### Books Table

### Authors Table

### Categories Table

### Publishers Table

### BookBorrowing Table
