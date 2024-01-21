package org.example.data.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long sourceId;
    private boolean adult;
    private String overview;
    private double popularity;
    private LocalDate releaseDate;
    private int runtime;

    @ManyToMany(mappedBy = "movies", cascade = CascadeType.ALL)
    private List<Company> productionCompanies = new ArrayList<>();

    @ManyToMany(mappedBy = "movies", cascade = CascadeType.ALL)
    private List<Genere> genres = new ArrayList<>();

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Character> characters = new ArrayList<>();


}
