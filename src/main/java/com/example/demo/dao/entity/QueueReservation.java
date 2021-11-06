package com.example.demo.dao.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity

public class QueueReservation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    @NonNull
    private int id;
    @NonNull
    private String name;
    @NonNull
    private String surName;
    @NonNull
    private LocalDate localDate;
    @NonNull
    private LocalTime localTime;



    public QueueReservation(int id, String name, String surName, LocalDate localDate, LocalTime localTime) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.localDate = localDate;
        this.localTime = localTime;

    }

    public QueueReservation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {return name;}

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

    public LocalTime getLocalTime() {return localTime;}

    public void setLocalTime(LocalTime localTime) {this.localTime = localTime;}

    @Override
    public String toString() {
        return "QueueReservation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", localDate=" + localDate +
                ", localTime=" + localTime +
                '}';
    }
}
