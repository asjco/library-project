package com.library.tables;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "BOOKS_COPIES")
public class Copies {

    public enum Status {
        AVAILABLE,
        RENTED,
        WASTED,
        LOST
    }

    private int serialNumber;
    private Status status;
    private Titles titles;

    public Copies() {
    }

    public Copies(int serialNumber, Status status) {
        this.serialNumber = serialNumber;
        this.status = status;
    }

    @ManyToOne
    @JoinColumn(name = "TITLE_ID")
    public Titles getTitles() {
        return titles;
    }

    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    @Id
    @NotNull
    @Column(name = "SERIAL_NUMBER", unique = true)
    public int getSerialNumber() {
        return serialNumber;
    }

    @NotNull
    @Column(name = "STATUS")
    public Status getStatus() {
        return status;
    }

    private void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    private void setStatus(Status status) {
        this.status = status;
    }
}
