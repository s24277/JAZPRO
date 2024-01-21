package org.example.data.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sourceId;
    private String name;
    private String originCountry;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "COMPANY_ANIME",
            joinColumns = @JoinColumn(name = "ANIME_ID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "PRODUCTION_COMPANIES_ID",
                    referencedColumnName = "id"))
    private List<Anime> anime = new ArrayList<>();

}
