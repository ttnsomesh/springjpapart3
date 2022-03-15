package com.example.demo.entities.OneToManyBiDirectional;

import javax.persistence.*;

@Entity
@Table(name = "booktonetomanybidir")
public class BookOneToManyBiDirectional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bookname;

    @ManyToOne
    @JoinColumn(name = "authorid")
    private AuthorOneToManyBiDirectional authors;

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

    public AuthorOneToManyBiDirectional getAuthors() {
        return authors;
    }

    public void setAuthors(AuthorOneToManyBiDirectional authors) {
        this.authors = authors;
    }
}
