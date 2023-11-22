package dev.patika;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", columnDefinition = "serial")
    private Long id;

    @Column(name = "book_name", length = 150)
    private String name;

    @Column(name = "book_publication_year")
    private int publicationYear;

    @Column(name = "book_stock")
    private int stock;

   @ManyToOne
    @JoinColumn(name = "book_author_id", referencedColumnName = "author_id")
    private Author author;

    @ManyToMany
    @JoinTable(
            name = "book2categories",
            joinColumns = {@JoinColumn(name = "book2categories_book_id")},
            inverseJoinColumns = {@JoinColumn(name = "book2categories_category_id")}
    )
    private List<Category> bookCategoryList;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "book_publisher_id", referencedColumnName = "publisher_id")
    private Publisher publisher;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "book_bookBorrowing_id", referencedColumnName = "bookBorrowing_id")
    private BookBorrowing bookBorrowing;

    public Book() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

   public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Category> getBookCategoryList() {
        return bookCategoryList;
    }

    public void setBookCategoryList(List<Category> bookCategoryList) {
        this.bookCategoryList = bookCategoryList;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public BookBorrowing getBookBorrowing() {
        return bookBorrowing;
    }

    public void setBookBorrowing(BookBorrowing bookBorrowing) {
        this.bookBorrowing = bookBorrowing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publicationYear=" + publicationYear +
                ", stock=" + stock +
                ", author=" + author +
                ", publisher=" + publisher +
                ", bookBorrowing=" + bookBorrowing +
                '}';
    }
}
