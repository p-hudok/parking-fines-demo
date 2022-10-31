package com.example.parking.fines.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Temporal (TemporalType.DATE)
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    private Date issueDate;

    private boolean isPayed;

    public Citizen() {
    }

    public Citizen(int id) {
        this.id = id;
    }

    public Citizen(String name) {
        this.name = name;
    }

    public Citizen(int id, String name) {
        this.id  = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}