package com.library.tables;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "LIBRARY_MEMBERS")
public class Member {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate accountCreateDate;
    private List<Rental> rentals = new ArrayList<>();

    public Member() {
    }

    public Member(int id, String firstName, String lastName, LocalDate accountCreateDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountCreateDate = accountCreateDate;
    }

    @OneToMany(
            targetEntity = Rental.class,
            mappedBy = "member",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    @NotNull
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    @NotNull
    @Column(name = "ACCOUNT_CREATE_DATE")
    public LocalDate getAccountCreateDate() {
        return accountCreateDate;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setAccountCreateDate(LocalDate accountCreateDate) {
        this.accountCreateDate = accountCreateDate;
    }
}
