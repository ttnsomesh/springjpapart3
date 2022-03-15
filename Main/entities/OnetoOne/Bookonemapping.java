package com.example.demo.entities.OnetoOne;

import javax.persistence.*;

@Entity
@Table(name = "booktable")
public class Bookonemapping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bookname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "authorid")
    private Authoronemapping author;

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

    public Authoronemapping getAuthor() {
        return author;
    }

    public void setAuthor(Authoronemapping author) {
        this.author = author;
    }
}
