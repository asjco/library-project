package com.library.tables;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "RENTALS")
public class Rentals {

    private int id;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private Copies copies;
    private Members members;

    public Rentals() {
    }

    public Rentals(int id, LocalDate borrowDate, LocalDate returnDate) {
        this.id = id;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    public Members getMembers() {
        return members;
    }

    public void setMembers(Members members) {
        this.members = members;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "COPY_ID")
    public Copies getCopies() {
        return copies;
    }

    public void setCopies(Copies copies) {
        this.copies = copies;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "BORROW_DATE")
    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    @NotNull
    @Column(name = "RETURN_DATE")
    public LocalDate getReturnDate() {
        return returnDate;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    private void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
