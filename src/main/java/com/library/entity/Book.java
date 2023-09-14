package com.library.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "year")
    private int year;

    @Column(name = "available")
    private boolean available;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    public enum Genre {
        crime, comedy, thriller, school,
    }
}
