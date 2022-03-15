package com.example.demo.entities.manytomany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "bookmanytomany")
public class Bookmanymapping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "bookname")
    private String bookname;

    @ManyToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL , mappedBy = "books")
    Set<Authormanymapping> authors = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Set<Authormanymapping> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Authormanymapping> authors) {
        this.authors = authors;
    }
}
