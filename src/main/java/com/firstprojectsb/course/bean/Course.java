package com.firstprojectsb.course.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private long id;

    //@Column(name = "definir_um_nome") dessa forma pode ser definido um nome para a coluna
    private String name;

    private String author;

    public Course() {
    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                "\n, name='" + name + '\'' +
                "\n, author='" + author + '\'' +
                '}';
    }
}
