package com.example.demo.dao.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity

public class QueueReservation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private int id;

    private String name;

    private String surName;

    private LocalDate localDate;

    public QueueReservation() {
    }

    public QueueReservation(int id, String name, String surName, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.localDate = localDate;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "QueueReservation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
