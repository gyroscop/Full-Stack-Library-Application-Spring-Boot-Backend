package com.library.springbootlibrary.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @Column(name = "title")
    public String title;

    @Column(name = "author")
    public String author;

    @Column(name = "description")
    public String description;

    @Column(name = "copies")
    public int copies;

    @Column(name = "copies_available")
    public int copiesAvailable;

    @Column(name = "category")
    public String category;

    @Column(name = "img")
    @Lob
    public String img;
}
