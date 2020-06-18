package com.library.tables;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "LIBRARY_MEMBERS")
public class Members {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate accountCreateDate;

    public Members() {
    }

    public Members(String firstName, String lastName, LocalDate accountCreateDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountCreateDate = accountCreateDate;
    }

    @Id
    @GeneratedValue
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
