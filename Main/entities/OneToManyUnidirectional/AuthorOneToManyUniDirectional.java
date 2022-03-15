package com.example.demo.entities.OneToManyUnidirectional;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "authoronetomany")
public class AuthorOneToManyUniDirectional {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @Embedded
    private AddressOneToManyUnidirectional address;

    @OneToMany(cascade = CascadeType.ALL , orphanRemoval = true)
    @JoinColumn(name = "authorid")
    private Set<BookOneToManyUniDirectional> books;


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

    public AddressOneToManyUnidirectional getAddress() {
        return address;
    }

    public void setAddress(AddressOneToManyUnidirectional address) {
        this.address = address;
    }

    public Set<BookOneToManyUniDirectional> getBooks() {
        return books;
    }

    public void setBooks(Set<BookOneToManyUniDirectional> books) {
        this.books = books;
    }

    public void addBook(BookOneToManyUniDirectional book){
        if(book != null){
            if(books == null){
                books = new HashSet<>();
            }
            books.add(book);
        }
    }
}
