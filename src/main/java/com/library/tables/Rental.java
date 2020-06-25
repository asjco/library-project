package com.library.tables;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "RENTALS")
public class Rental {

    private int id;
    private LocalDate borrowDate = LocalDate.now();
    private LocalDate returnDate;
    private Copy copy;
    private Member member;

    public Rental() {
    }

    public Rental(int id, LocalDate returnDate) {
        this.id = id;
        this.returnDate = returnDate;
    }

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "COPY_ID")
    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
