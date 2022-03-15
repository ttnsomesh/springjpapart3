package com.example.demo.entities.manytomany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "authormanytomany")
public class Authormanymapping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Embedded
    private AddressManyToMany address;

    @ManyToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinTable(name = "bookauthor" , joinColumns = {@JoinColumn(name = "authorid")},inverseJoinColumns = {@JoinColumn(name = "bookid")})

    Set<Bookmanymapping> books = new HashSet<>();

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

    public AddressManyToMany getAddress() {
        return address;
    }

    public void setAddress(AddressManyToMany address) {
        this.address = address;
    }

    public Set<Bookmanymapping> getBooks() {
        return books;
    }

    public void setBooks(Set<Bookmanymapping> books) {
        this.books = books;
    }
}
