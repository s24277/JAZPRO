package org.example.data.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
public class Genere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int sourceId;
    private String name;

    @ManyToMany
    private List<Anime> anime = new ArrayList<>();

}
