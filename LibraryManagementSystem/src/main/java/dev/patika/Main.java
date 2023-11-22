package dev.patika;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

       /* Book book = new Book();
        book.setName("The Magic Mountain");
        book.setPublicationYear(1924);
        book.setStock(5);

        Book book1 = new Book();
        book1.setName("Yenişehir'de Bir Öğle Vakti");
        book1.setPublicationYear(1973);
        book1.setStock(3);

        Book book2 = new Book();
        book2.setName("Why Zebras Don't Get Ulcers");
        book2.setPublicationYear(1994);
        book2.setStock(2);

        Book book3 = new Book();
        book3.setName("The Years");
        book3.setPublicationYear(2008);
        book3.setStock(3);

        Book book4 = new Book();
        book4.setName("Naive. Super");
        book4.setPublicationYear(2005);
        book4.setStock(1);

        Book book5 = new Book();
        book5.setName("Atomic Habits");
        book5.setPublicationYear(2018);
        book5.setStock(5);

        entityManager.persist(book);
        entityManager.persist(book1);
        entityManager.persist(book2);
        entityManager.persist(book3);
        entityManager.persist(book4);
        entityManager.persist(book5);

        Author author = new Author();
        author.setName("Thomas Mann");
        author.setCountry("Germany");
        author.setBirthDate(LocalDate.of(1875, 6, 6));

        Author author1 = new Author();
        author1.setName("Sevgi Soysal");
        author1.setCountry("Türkiye");
        author1.setBirthDate(LocalDate.of(1936, 7, 30));

        Author author2 = new Author();
        author2.setName("Robert Sapolsky");
        author2.setCountry("U.S.");
        author2.setBirthDate(LocalDate.of(1957, 4, 6));

        Author author3 = new Author();
        author3.setName("Annie Ernaux");
        author3.setCountry("France");
        author3.setBirthDate(LocalDate.of(1940, 7, 1));

        Author author4 = new Author();
        author4.setName("Erlend Loe");
        author4.setCountry("Norway");
        author4.setBirthDate(LocalDate.of(1969, 5, 24));

        Author author5 = new Author();
        author5.setName("James Clear");
        author5.setCountry("U.S.");
        author5.setBirthDate(LocalDate.of(1986, 2, 1));

        entityManager.persist(author);
        entityManager.persist(author1);
        entityManager.persist(author2);
        entityManager.persist(author3);
        entityManager.persist(author4);
        entityManager.persist(author5);

        Category category = new Category();
        category.setName("Fiction");
        category.setDescription("Fiction Novel");

        Category category1 = new Category();
        category1.setName("Non-Fiction Book");
        category1.setDescription("Non-Fiction Books");

        Category category2 = new Category();
        category2.setName("Classic");
        category2.setDescription("Classics");

        entityManager.persist(category);
        entityManager.persist(category1);
        entityManager.persist(category2);

        Publisher publisher = new Publisher();
        publisher.setName("Alfred A. Knopf");
        publisher.setEstablishmentYear(1915);
        publisher.setAddress("New York City, U.S.");

        Publisher publisher1 = new Publisher();
        publisher1.setName("İletişim Yayınları");
        publisher1.setEstablishmentYear(1982);
        publisher1.setAddress("İstanbul, Türkiye");

        Publisher publisher2 = new Publisher();
        publisher2.setName("Holt Paperbacks");
        publisher2.setEstablishmentYear(1994);
        publisher2.setAddress("New York City, U.S.");

        Publisher publisher3 = new Publisher();
        publisher3.setName("Seven Stories Press ");
        publisher3.setEstablishmentYear(2017);
        publisher3.setAddress("Paris, France");

        Publisher publisher4 = new Publisher();
        publisher4.setName("Canongate Books");
        publisher4.setEstablishmentYear(2005);
        publisher4.setAddress("Oslo, Norway");

        Publisher publisher5 = new Publisher();
        publisher5.setName("Holt Paperbacks");
        publisher5.setEstablishmentYear(2018);
        publisher5.setAddress("New York City, U.S.");


        entityManager.persist(publisher);
        entityManager.persist(publisher1);
        entityManager.persist(publisher2);
        entityManager.persist(publisher3);
        entityManager.persist(publisher4);
        entityManager.persist(publisher5);

        BookBorrowing bookBorrowing = new BookBorrowing();
        bookBorrowing.setBorrowerName("Cansu Keleş");
        bookBorrowing.setBorrowingDate(LocalDate.of(2023, 11, 23));
        bookBorrowing.setReturnDate(null);

        BookBorrowing bookBorrowing1 = new BookBorrowing();
        bookBorrowing1.setBorrowerName("Miso Keleş");
        bookBorrowing1.setBorrowingDate(LocalDate.of(2023, 1, 4));
        bookBorrowing1.setReturnDate(null);

        BookBorrowing bookBorrowing2 = new BookBorrowing();
        bookBorrowing2.setBorrowerName("Soya Keleş");
        bookBorrowing2.setBorrowingDate(LocalDate.of(2023, 5, 15));
        bookBorrowing2.setReturnDate(null);

        entityManager.persist(bookBorrowing);
        entityManager.persist(bookBorrowing1);
        entityManager.persist(bookBorrowing2); */

      /*  Book book = entityManager.find(Book.class, 1);
        book.setAuthor(entityManager.find(Author.class, 1));

        Category category = entityManager.find(Category.class, 1);
        List<Category> catList = new ArrayList<Category>();
        catList.add(category);
        book.setBookCategoryList(catList);

        book.setBookBorrowing(entityManager.find(BookBorrowing.class, 1));

        Book book2 = entityManager.find(Book.class, 4);
        book2.setBookBorrowing(entityManager.find(BookBorrowing.class, 3));

        Book book3 = entityManager.find(Book.class, 2);
        book3.setBookBorrowing(entityManager.find(BookBorrowing.class, 2)); */


        entityTransaction.commit();
    }
}