package com.library.tables;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "BOOKS_COPIES")
public class Copy {

    private int serialNumber;
    private String status;
    private Title title;

    public Copy() {
    }

    public Copy(int serialNumber, String status) {
        this.serialNumber = serialNumber;
        this.status = status;
    }

    @ManyToOne
    @JoinColumn(name = "TITLE_ID")
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @Id
    @NotNull
    @Column(name = "SERIAL_NUMBER", unique = true)
    public int getSerialNumber() {
        return serialNumber;
    }

    @NotNull
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    private void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    private void setStatus(String status) {
        this.status = status;
    }
}
