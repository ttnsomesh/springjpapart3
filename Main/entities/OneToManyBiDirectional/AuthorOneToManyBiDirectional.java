package com.example.demo.entities.OneToManyBiDirectional;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "authoronetomanybidir")
public class AuthorOneToManyBiDirectional {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @Embedded
    private AddressOneToManyBidirectional address;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<BookOneToManyBiDirectional> books;


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

    public AddressOneToManyBidirectional getAddress() {
        return address;
    }

    public void setAddress(AddressOneToManyBidirectional address) {
        this.address = address;
    }

    public Set<BookOneToManyBiDirectional> getBooks() {
        return books;
    }

    public void setBooks(Set<BookOneToManyBiDirectional> books) {
        this.books = books;
    }

    public void addBook(BookOneToManyBiDirectional book){
        if(book != null){
            if(books == null){
                books = new HashSet<>();
            }
            books.add(book);
        }
    }
}
