package com.library.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "BOOKS_COPIES")
public class Copies {

    private int serialNumber;
    private String status;

    public Copies() {
    }

    public Copies(int serialNumber, String status) {
        this.serialNumber = serialNumber;
        this.status = status;
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
