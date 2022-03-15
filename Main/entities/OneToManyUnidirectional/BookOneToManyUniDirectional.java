package com.example.demo.entities.OneToManyUnidirectional;

import javax.persistence.*;

@Entity
@Table(name = "booktonetomany")
public class BookOneToManyUniDirectional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bookname;


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

}
