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

<img width="1370" alt="books" src="https://github.com/cansukeles/Week-11/assets/142833559/a22f431a-e144-47d2-81d5-692d660a8ff1">


### Authors Table

<img width="1370" alt="authors" src="https://github.com/cansukeles/Week-11/assets/142833559/ad624933-e87e-4928-8b21-f1a7f0018249">


### Categories Table

<img width="1370" alt="categories" src="https://github.com/cansukeles/Week-11/assets/142833559/9e939730-c41c-4316-be06-aa8c598c012b">


### Publishers Table

<img width="1370" alt="publishers" src="https://github.com/cansukeles/Week-11/assets/142833559/e48a1b40-ba76-4d12-961e-ba68baffbd9c">


### BookBorrowing Table

<img width="1370" alt="bookBorrowing" src="https://github.com/cansukeles/Week-11/assets/142833559/7d862099-a66d-4371-9de8-b515213e3e5a">


