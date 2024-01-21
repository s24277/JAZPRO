package org.example.data.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int sourceId;
    private String name;
    private String alsoKnownAs;
    private LocalDate birthday;
    private LocalDate deathday;
    private double popularity;

    @OneToMany(mappedBy = "actor")
    private List<Character> characters = new ArrayList<>();

}
