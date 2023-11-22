package dev.patika;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book_borrowing")
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookBorrowing_id")
    private Long id;

    @Column(name = "borrower_name")
    private String borrowerName;

    @Column(name = "borrowing_date")
    @Temporal(TemporalType.DATE)
    private LocalDate borrowingDate;
    @Column(name = "return_date")
    @Temporal(TemporalType.DATE)
    private LocalDate returnDate;

   @OneToMany(mappedBy = "bookBorrowing", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Book> bookList;

    public BookBorrowing() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "BookBorrowing{" +
                "id=" + id +
                ", borrowerName='" + borrowerName + '\'' +
                ", borrowingDate=" + borrowingDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
